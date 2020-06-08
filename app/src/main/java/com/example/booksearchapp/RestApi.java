package com.example.booksearchapp;

import androidx.annotation.NonNull;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApi {
    private String BASE_URL = "https://openlibrary.org/";

    private final BookClient bookClient;
    private static RestApi instance;

    private RestApi() {

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        bookClient = retrofit.create(BookClient.class);


    }

    @NonNull
    public static synchronized RestApi getInstance() {
        if (instance == null) {
            instance = new RestApi();
        }
        return instance;
    }


    Observable<BookResponse> getBookLists(String bookname) {

        return bookClient.getBooks(bookname);
    }
}
