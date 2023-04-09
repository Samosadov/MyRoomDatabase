package com.example.myroomdatabase.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myroomdatabase.db.dao.AlbumsDao;
import com.example.myroomdatabase.db.model.Album;
import com.example.myroomdatabase.util.Constants;

@Database(entities = { Album.class }, version = 1)
//@TypeConverters({ DateRoomConverter.class })
public abstract class AlbumsDB extends RoomDatabase {
    public abstract AlbumsDao getAlbumsDao();

    private static AlbumsDB albumsDB;
    public static AlbumsDB getInstance(Context context) {
        if (null == albumsDB) {
            albumsDB = buildDatabaseInstance(context);
        }
        return albumsDB;
    }

    private static AlbumsDB buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                AlbumsDB.class,
                Constants.DB_NAME).allowMainThreadQueries().build();
    }

    public void cleanUp() { albumsDB = null; }
}
