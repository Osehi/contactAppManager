package com.polish.contactappmanager.model.dao

import androidx.room.*
import com.polish.contactappmanager.model.ContactEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactAppManagerDao {

    @Query("SELECT * FROM contact_table ORDER BY id ASC")
    fun getAllContact(): Flow<List<ContactEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(myContact:ContactEntity)

    @Delete
    suspend fun delete(myContact: ContactEntity)

    @Update
    suspend fun update(myContact: ContactEntity)

}