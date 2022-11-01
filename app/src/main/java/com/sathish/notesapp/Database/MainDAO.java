package com.sathish.notesapp.Database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.sathish.notesapp.Models.Notes;

import java.util.List;

@Dao
public interface MainDAO {

    @Insert(onConflict = REPLACE)
    void insert(Notes note);

    @Query("SELECT * FROM notes ORDER BY ID DESC")
    List<Notes> getAll();

    @Query("UPDATE notes SET title= :title,notes= :notes WHERE ID= :id")
    void update(int id,String title,String notes);

    @Delete
    void delete(Notes notes);
    
    @Query("UPDATE notes SET pin= :pin WHERE ID= :id")
    void pin(int id,boolean pin);
}
