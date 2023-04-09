package com.example.myroomdatabase.db.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myroomdatabase.db.model.Album;
import com.example.myroomdatabase.util.Constants;

import java.util.List;

public interface AlbumsDao {

    @Query("SELECT * FROM " + Constants.TABLE_NAME)
    List<Album> getRecs();

    @Insert
    long insertRecord(Album record);

    @Update
    void updateRecord(Album record);

    @Delete
    void deleteRecord(Album record);

    @Delete
    void deleteRecord(Album... record);
}
