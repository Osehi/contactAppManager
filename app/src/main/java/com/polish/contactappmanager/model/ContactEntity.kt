package com.polish.contactappmanager.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_table")
data class ContactEntity(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var firstName:String?,
    var lastName:String?,
    var email:String?,
    var phone:String?,
    var address:String?

)