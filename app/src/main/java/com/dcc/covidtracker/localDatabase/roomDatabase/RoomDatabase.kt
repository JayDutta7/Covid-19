package com.dcc.covidtracker.localDatabase.roomDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dcc.covidtracker.localDatabase.roomDatabase.dao.SampleDao
import com.dcc.covidtracker.localDatabase.roomDatabase.entities.Sample

@Database(
    entities =
    [Sample::class
        ], version = 1, exportSchema = false
)
abstract class RoomDatabase : RoomDatabase() {

    /*Abstract class for getting the interface's*/
    abstract fun sampleDao(): SampleDao




    companion object {

        private var INSTANCE: RoomDatabase? = null

        fun getDatabase(context: Context): RoomDatabase {

            if (INSTANCE == null) {

                /*
                 inMemoryDatabaseBuilder():
                 /////////////////////////////////////
                 The database will be created in system memory,
                  If you kill the app (Killing your process),
                   database will be removed and data will not be persisted.
                    This can be used while Testing.

                databaseBuilder() :
                 /////////////////////////////////////
                 The database will be created in /data/data/com.your.app and will be persisted.
                  This you will be using it in production.

                  */

                synchronized(RoomDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        RoomDatabase::class.java,
                        "tracking_solution.db"
                    )     //.allowMainThreadQueries() //when publish no main thread call allowed
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE!!
        }

    }

}