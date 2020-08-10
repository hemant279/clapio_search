package com.elad.themovie.service.repository.network.paging;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;

import com.elad.themovie.service.repository.storge.model.Movie;

import rx.subjects.ReplaySubject;

/*
    Responsible for creating the DataSource so we can give it to the PagedList.
 */
public class NetMoviesDataSourceFactory extends DataSource.Factory {

    private static final String TAG = NetMoviesDataSourceFactory.class.getSimpleName();
    private MutableLiveData<PostsPageKeyedDataSource> networkStatus;
    private PostsPageKeyedDataSource moviesPageKeyedDataSource;

    public NetMoviesDataSourceFactory() {
        this.networkStatus = new MutableLiveData<>();
        moviesPageKeyedDataSource = new PostsPageKeyedDataSource();
    }

    @Override
    public DataSource create() {
        networkStatus.postValue(moviesPageKeyedDataSource);
        return moviesPageKeyedDataSource;
    }

    public MutableLiveData<PostsPageKeyedDataSource> getNetworkStatus() {
        return networkStatus;
    }

    public ReplaySubject<Movie> getMovies() {
        return moviesPageKeyedDataSource.getMovies();
    }

}
