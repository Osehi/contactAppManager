package com.polish.contactappmanager.di

import android.content.Context
import androidx.room.Room
import com.polish.contactappmanager.model.dao.ContactAppManagerDao
import com.polish.contactappmanager.model.database.ContactAppManagerDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideContactAppManagerDatabase(@ApplicationContext context: Context):ContactAppManagerDatabase {
        // return an instance of the database
        return Room.databaseBuilder(
            context,
            ContactAppManagerDatabase::class.java,
            ContactAppManagerDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }
    
    @Singleton
    @Provides
    fun provideContactAppManagerDao(contactAppManagerDatabase: ContactAppManagerDatabase): ContactAppManagerDao {
        // Dao is used to access the method to write or read into or from database
        return contactAppManagerDatabase.contactAppManagerDao()
    }

}