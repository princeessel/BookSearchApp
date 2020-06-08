package com.example.booksearchapp;

public class Book {
    private static final String COVER_EDITION_KEY = "cover_edition_key";
    private static final String EDITION_KEY = "edition_key";
    private static final String TITLE_SUGGEST = "title_suggest";
    private static final String AUTHOR_NAME = "author_name";

    private String openLibraryId;
    private String author;
    private String title;

    public String getOpenLibraryId() {
        return openLibraryId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getMediumCoverUrl() {
        return "http://covers.openlibrary.org/b/olid/" + openLibraryId + "-M.jpg?default=false";
    }

    public String getLargeCoverUrl() {
        return "http://covers.openlibrary.org/b/olid/" + openLibraryId + "-L.jpg?default=false";
    }
}
