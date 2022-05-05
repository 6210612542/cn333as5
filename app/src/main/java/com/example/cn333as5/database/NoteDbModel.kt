package com.example.cn333as5.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Tanjira Permsakul", "0851291964",  1, 2,false),
            NoteDbModel(2, "Thanchanok Lapprasert", "0935617295",  2, 2,false),
            NoteDbModel(3, "Palmmy Palita", "0869077006",  3, 2,false),
        )
    }
}
