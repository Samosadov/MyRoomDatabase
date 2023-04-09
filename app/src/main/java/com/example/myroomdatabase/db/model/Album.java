package com.example.myroomdatabase.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.myroomdatabase.util.Constants;

import java.io.Serializable;

@Entity(tableName = Constants.TABLE_NAME)
public class Album implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private long album_id;

    @ColumnInfo(name = "album")
    private String title;

    private String artist;
    private int year;

    public Album(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    @Ignore
    public Album() {}

    public long getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(long album_id) {
        this.album_id = album_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (album_id != album.album_id) return false;
        if (year != album.year) return false;
        if (title != null ? !title.equals(album.title) : album.title != null) return false;
        return artist != null ? artist.equals(album.artist) : album.artist == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (album_id ^ (album_id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Rec{" +
                "album_id=" + album_id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}
