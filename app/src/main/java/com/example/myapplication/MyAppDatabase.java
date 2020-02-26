package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.Room;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

@Database(entities = {Verb.class},version = 1,exportSchema = false)
@TypeConverters({Converters.class})
public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao myDao();

    private static MyAppDatabase INSTANCE;


}
