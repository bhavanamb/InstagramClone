package com.novem.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MmZRg1GMUvirw5Ln6unjO22YKjDfZZAkEdmwlvnY")
                .clientKey("3MmTltTzZct0PK65yldBj2qhE6taC0nbEK9WKh4G")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
