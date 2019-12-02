package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void addVerb(Verb verb);

    @Update
    public void updateVerb(Verb verb);

    @Query("select * from verbs ORDER BY lower(porVerb)")
    public List<Verb> getVerbs();

    @Query("select lower(porVerb) from verbs")
    public List<String> getPorVerbs();

    @Insert
    public void insertAllVerbs(Verb...verbs);

    @Query("SELECT COUNT(porVerb) FROM verbs")
    LiveData<Integer> getRowCount();

    @Query("DELETE FROM VERBS")
    public void clearAll();

    @Delete
    public void deleteVerb(Verb verb);


}
