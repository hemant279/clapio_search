package com.elad.themovie.service.repository.network.paging;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.PageKeyedDataSource;

import com.elad.themovie.HashTag;
import com.elad.themovie.service.repository.network.api.MoviesAPIInterface;
import com.elad.themovie.service.repository.network.api.TheMovieDBAPIClient;
import com.elad.themovie.service.repository.storge.model.Movie;
import com.elad.themovie.service.repository.storge.model.NetworkState;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.subjects.ReplaySubject;

public class PostsPageKeyedDataSource extends PageKeyedDataSource<String, Movie> {

    private static final String TAG = PostsPageKeyedDataSource.class.getSimpleName();
    private final MoviesAPIInterface moviesService;
    private final MutableLiveData networkState;
    private final ReplaySubject<Movie> moviesObservable;

    PostsPageKeyedDataSource() {
        moviesService = TheMovieDBAPIClient.getClient();
        networkState = new MutableLiveData();
        moviesObservable = ReplaySubject.create();
    }

    public MutableLiveData getNetworkState() {
        return networkState;
    }

    public ReplaySubject<Movie> getMovies() {
        return moviesObservable;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<String> params, @NonNull final LoadInitialCallback<String, Movie> callback) {
        Log.i(TAG, "Loading Initial Rang, Count " + params.requestedLoadSize);

        networkState.postValue(NetworkState.LOADING);
        Call<HashTag> callBack = moviesService.fetchHasTagVideo("trend",0,0,"17", 1);
        callBack.enqueue(new Callback<HashTag>() {
            @Override
            public void onResponse(Call<HashTag> call, Response<HashTag> response) {
                if (response.isSuccessful()) {
                    callback.onResult(response.body().getData(), Integer.toString(1), Integer.toString(2));
                    networkState.postValue(NetworkState.LOADED);
                    response.body().getData().forEach(moviesObservable::onNext);
                } else {
                    Log.e("API CALL", response.message());
                    networkState.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
                }
            }

            @Override
            public void onFailure(Call<HashTag> call, Throwable t) {
                String errorMessage;
                if (t.getMessage() == null) {
                    errorMessage = "unknown error";
                } else {
                    errorMessage = t.getMessage();
                }
                networkState.postValue(new NetworkState(NetworkState.Status.FAILED, errorMessage));
                callback.onResult(new ArrayList<>(), Integer.toString(1), Integer.toString(2));
            }
        });
    }



    @Override
    public void loadAfter(@NonNull LoadParams<String> params, final @NonNull LoadCallback<String, Movie> callback) {
        Log.i(TAG, "Loading page " + params.key );
        networkState.postValue(NetworkState.LOADING);
        final AtomicInteger page = new AtomicInteger(0);
        try {
            page.set(Integer.parseInt(params.key));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        Call<HashTag> callBack = moviesService.fetchHasTagVideo("trend",0,0,"17", page.get());
        callBack.enqueue(new Callback<HashTag>() {
            @Override
            public void onResponse(Call<HashTag> call, Response<HashTag> response) {
                if (response.isSuccessful()) {
                    callback.onResult(response.body().getData(),Integer.toString(page.get()+1));
                    networkState.postValue(NetworkState.LOADED);
                    response.body().getData().forEach(moviesObservable::onNext);
                } else {
                    networkState.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
                    Log.e("API CALL", response.message());
                }
            }

            @Override
            public void onFailure(Call<HashTag> call, Throwable t) {
                String errorMessage;
                if (t.getMessage() == null) {
                    errorMessage = "unknown error";
                } else {
                    errorMessage = t.getMessage();
                }
                networkState.postValue(new NetworkState(NetworkState.Status.FAILED, errorMessage));
                callback.onResult(new ArrayList<>(),Integer.toString(page.get()));
            }
        });
    }


    @Override
    public void loadBefore(@NonNull LoadParams<String> params, @NonNull LoadCallback<String, Movie> callback) {

    }
}
