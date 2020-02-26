package com.example.myapplication;

import androidx.room.TypeConverter;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Converters {
    @TypeConverter
    public static String[] fromString(String value) {
        Type listType = new TypeToken<String[]>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromArrayList(String[] list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
}