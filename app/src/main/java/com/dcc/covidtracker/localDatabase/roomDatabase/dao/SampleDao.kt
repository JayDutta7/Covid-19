package com.dcc.covidtracker.localDatabase.roomDatabase.dao

import androidx.room.*
import com.dcc.covidtracker.localDatabase.roomDatabase.entities.Sample
import io.reactivex.Maybe
@Dao
interface SampleDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertValue(sampleValue: Sample)

        @Query("SELECT * FROM sampleDB")
        fun getValue(): Maybe<Sample>

        @Update
        fun updateValue(appConfig: Sample)

}