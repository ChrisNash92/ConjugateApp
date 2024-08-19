package com.example.myapplication;

import androidx.room.ProvidedTypeConverter;
import androidx.room.TypeConverter;

@ProvidedTypeConverter
public class Converters {
    @TypeConverter
    public static Tense fromString(String value) {
        String[] tenses = value.split("[\\|]", -2);
        return new Tense(tenses[0], tenses[1], tenses[2], tenses[3], tenses[4], tenses[5]);
    }
    @TypeConverter
    public static String fromArrayList(Tense value) {
        return String.join("|", value.Eu, value.Ele, value.Nos, value.Eles, value.TenseInfomationPortuguese, value.TenseInfomationEnglish);
    }
}
