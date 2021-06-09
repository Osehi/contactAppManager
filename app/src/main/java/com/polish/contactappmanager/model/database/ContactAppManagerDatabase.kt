package com.polish.contactappmanager.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.polish.contactappmanager.model.ContactEntity
import com.polish.contactappmanager.model.dao.ContactAppManagerDao

@Database(entities = [ContactEntity::class], version = 1, exportSchema = false)
abstract class ContactAppManagerDatabase : RoomDatabase(){

    abstract fun contactAppManagerDao(): ContactAppManagerDao

    companion object {
        val DATABASE_NAME:String = "contact_app_manager_database"
    }

}