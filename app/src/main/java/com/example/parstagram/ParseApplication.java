package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VJsnDyZ2VolUavqyG2sbWWotWSrMbYLONDxdkwmU")
                .clientKey("D82vLqy8nFo1HzISaytY8C5dgh18zQ8mu8bDQDQv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
