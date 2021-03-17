package com.example.instagram;

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
                .applicationId("q8P2ECtE0fvXi4SQLDDb18Ci0I1Z2TjYxGIb2ygd")
                .clientKey("ALuKzmhMI9Gem8K9N7UABcxuryWMniZz3Pjl1lIR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
