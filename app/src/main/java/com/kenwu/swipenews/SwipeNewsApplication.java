package com.kenwu.swipenews;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.kenwu.swipenews.database.AppDatabase;

public class SwipeNewsApplication extends Application {
    private static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "swipe_db").build();
    }

    public static AppDatabase getDatabase() {
        return database;
    }

}
