package com.elad.themovie.ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.elad.themovie.R;
import com.elad.themovie.service.repository.storge.model.Movie;
import com.elad.themovie.ui.SpannedGridLayoutManager;
import com.elad.themovie.ui.adapter.MoviesPageListAdapter;
import com.elad.themovie.ui.listeners.ItemClickListener;
import com.elad.themovie.ui.viewmodel.MovieDetailsViewModel;
import com.elad.themovie.ui.viewmodel.MoviesListViewModel;

public class MoviesListFragment extends Fragment implements ItemClickListener {

    protected MoviesListViewModel viewModel;
    private MovieDetailsViewModel detailsViewModel;

    protected RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        recyclerView = view.findViewById(R.id.moviesRecyclerView);
        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);*/

        //StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);

        SpannedGridLayoutManager gridLayoutManager = new SpannedGridLayoutManager(new SpannedGridLayoutManager.GridSpanLookup() {
            @Override
            public SpannedGridLayoutManager.SpanInfo getSpanInfo(int position) {
                if (position%9 == 0) {
                    return new SpannedGridLayoutManager.SpanInfo(2, 2);
                    //this will count of row and column you want to replace
                } else {
                    return new SpannedGridLayoutManager.SpanInfo(1, 1);
                }
            }
        }, 3, 1f);
        // 3 is the number of coloumn , how nay to display is 1f

        recyclerView.setLayoutManager(gridLayoutManager);
        viewModel = ViewModelProviders.of(getActivity()).get(MoviesListViewModel.class);
        observersRegisters();
        return view;
    }

    private void observersRegisters() {
        final MoviesPageListAdapter pageListAdapter = new MoviesPageListAdapter(this);
        viewModel.getMovies().observe(this, pageListAdapter::submitList);
        viewModel.getNetworkState().observe(this, networkState -> {
            pageListAdapter.setNetworkState(networkState);
        });
        recyclerView.setAdapter(pageListAdapter);
        detailsViewModel = ViewModelProviders.of(getActivity()).get(MovieDetailsViewModel.class);
    }

    @Override
    public void OnItemClick(Movie movie) {
        detailsViewModel.getMovie().postValue(movie);
        if (!detailsViewModel.getMovie().hasActiveObservers()) {
            // Create fragment and give it an argument specifying the article it should show
            MovieDetailsFragment detailsFragment = new MovieDetailsFragment();
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragmentsContainer, detailsFragment);
            transaction.addToBackStack(null);
            //Commit the transaction
            transaction.commit();
        }
    }
}
