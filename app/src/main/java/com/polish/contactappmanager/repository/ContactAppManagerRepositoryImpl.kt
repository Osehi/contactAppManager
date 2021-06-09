package com.polish.contactappmanager.repository

import com.polish.contactappmanager.model.ContactEntity
import com.polish.contactappmanager.model.dao.ContactAppManagerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ContactAppManagerRepositoryImpl @Inject constructor(val contactAppManagerDao: ContactAppManagerDao): IContactAppManagerRepository {
    override fun getAllContact(): Flow<List<ContactEntity>> {
        return contactAppManagerDao.getAllContact()
    }

    override suspend fun insert(myContactEntity: ContactEntity) {
        withContext(Dispatchers.IO){
            contactAppManagerDao.insert(myContactEntity)
        }
    }

    override suspend fun delete(myContactEntity: ContactEntity) {
        withContext(Dispatchers.IO){
            contactAppManagerDao.delete(myContactEntity)
        }
    }

    override suspend fun update(myContactEntity: ContactEntity) {
        withContext(Dispatchers.IO){
            contactAppManagerDao.update(myContactEntity)
        }
    }
}