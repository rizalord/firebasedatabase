package com.rizalord.realtimedatabase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ListAdapter (val con: Context , val layoutResId : Int , val list : List<Users>)
    : ArrayAdapter<Users>(con , layoutResId , list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(con)
        val view = layoutInflater.inflate(layoutResId , null)

        val textNama = view.findViewById<TextView>(R.id.tv_nama)
        val textEmail = view.findViewById<TextView>(R.id.tv_email)

        val user = list[position]
        textNama.text = user.nama
        textEmail.text = user.email

        return view
    }
}