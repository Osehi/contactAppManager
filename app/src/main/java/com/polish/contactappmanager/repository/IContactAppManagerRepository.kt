package com.polish.contactappmanager.repository

import com.polish.contactappmanager.model.ContactEntity
import kotlinx.coroutines.flow.Flow

/**
 * the purpose of creating an interface of all
 * methods responsible for data source in the repository
 * is to make the app testable
 */
interface IContactAppManagerRepository {
    /**
     * get all the contacts
     * using flow; this will produce stream of data
     */
    fun getAllContact(): Flow<List<ContactEntity>>
    /**
     * add contact to database
     */
    suspend fun insert(myContactEntity: ContactEntity)
    /**
     * delete contact from database
     */
    suspend fun delete(myContactEntity: ContactEntity)
    /**
     * update contact in database
     */
    suspend fun update(myContactEntity: ContactEntity)


}