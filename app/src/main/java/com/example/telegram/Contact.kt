package com.example.telegram

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        @ColumnInfo(name = "name") val name:String,
        @ColumnInfo(name = "image") val image: String
)