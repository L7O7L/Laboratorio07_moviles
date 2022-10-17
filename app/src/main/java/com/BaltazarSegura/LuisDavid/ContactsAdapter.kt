package com.BaltazarSegura.LuisDavid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.BaltazarSegura.LuisDavid.databinding.ItemContactBinding

class ContactsAdapter (
    private val listPerson: List<Person>): RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>(){

    class ContactViewHolder(
        private val binding: ItemContactBinding
    ): RecyclerView.ViewHolder(binding.root) {
        val picture: ImageView = binding.pictureImage
        val fullName: TextView = binding.fullnameText
        val email: TextView = binding.emailText
        val additionalText: TextView = binding.aditionalText
        val btnViewDetail: Button = binding.btnGoTeacher
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        // Crear una nueva vista, que define la interfaz de usuario del elemento de la lista
        val itemBinding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(itemBinding)
    }

    // Reemplazar el contenido de una vista (invocado por el administrador de diseño)
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        // Obtenga el elemento de su conjunto de datos en esta posición y reemplace el contenido de la vista con ese elemento
        val person: Person = listPerson[position]

        val context = holder.itemView.context

        val idRes = context.resources.getIdentifier(person.picture, "drawable", context.packageName)


        holder.fullName.text = person.fullName
        holder.email.text = person.email
        holder.picture.setImageResource(idRes)

        if (person.id == 100) {
            holder.email.visibility = View.GONE
        }

        if (person.id == 200) {
            holder.itemView.setOnClickListener {
                Toast.makeText(context, "Click: ${person.fullName}", Toast.LENGTH_SHORT).show()
            }
        }

        if (person.id == 400) {
            holder.additionalText.visibility = View.VISIBLE
        }

        holder.btnViewDetail.visibility = View.VISIBLE
        holder.btnViewDetail.setOnClickListener {
            Toast.makeText(context, "Show Detail Teacher ${person.fullName}", Toast.LENGTH_SHORT).show()
        }
    }

    //Devuelve el tamaño de tu conjunto de datos (invocado por el administrador de diseño)
    override fun getItemCount(): Int {
        return listPerson.size
    }

}