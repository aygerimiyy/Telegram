package com.example.telegram.dao

import androidx.room.*
import com.example.telegram.Contact


@Dao
interface ContactDao {
   @Query("Select * from contact")
   suspend fun getAllContacts(): List<Contact>


   @Insert(entity = Contact::class,onConflict = OnConflictStrategy.REPLACE)
   suspend fun addContact(contact: Contact)


   @Update(entity = Contact::class, onConflict = OnConflictStrategy.REPLACE)
   suspend fun updateContact(contact: Contact)

   @Delete(entity = Contact::class)
   suspend fun deleteContact(contact: Contact)
}