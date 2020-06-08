package com.example.booksearchapp;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookClient {

    @GET("search.json")
    Observable<BookResponse> getBooks(
            @Query("q") String query);
}
