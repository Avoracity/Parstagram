package com.example.parseinstagram;

import android.app.Application;
import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CqYSW8ZeGvttdJbR3if3xHn5Q2XpvZiSKXwn9lwD")
                .clientKey("z4fzi4I06QBoXo26mMqy5Uwzq9plK8sSNLmqHGJl")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }

}
