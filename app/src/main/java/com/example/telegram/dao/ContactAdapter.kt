package com.example.telegram.dao

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.telegram.Contact
import com.example.telegram.R
import com.example.telegram.databinding.ItemContactBinding

class
ContactAdapter: Adapter<ContactAdapter.ContactViewHolder>() {

    inner class ContactViewHolder(private val binding: ItemContactBinding):
        ViewHolder(binding.root) {
        fun bind(contact: Contact) {
            binding.apply {
                tvName.text = contact.name
            }

        }
    }

    var contact = mutableListOf<Contact>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = contact.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        val binding = ItemContactBinding.bind(view)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contact[position])
    }


}