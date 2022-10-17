package com.BaltazarSegura.LuisDavid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.BaltazarSegura.LuisDavid.databinding.ItemMusicBinding

class MusicListAdpter (
    private val listMusic: List<Music>): RecyclerView.Adapter<MusicListAdpter.MusicViewHolder>(){

    class MusicViewHolder(
        private val binding: ItemMusicBinding
    ): RecyclerView.ViewHolder(binding.root) {
        val picture: ImageView = binding.pictureImage
        val nombre: TextView = binding.nombre
        val album: TextView = binding.album
        val tiempo: TextView = binding.tiempo
        val banda: TextView = binding.banda
        val genero: TextView = binding.genero
        val btnplay: Button = binding.btnPlay
        val image_star: ImageView = binding.star
        val btnpause: Button = binding.btnPause
        val btnshare: Button = binding.btnShare
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        // Crear una nueva vista, que define la interfaz de usuario del elemento de la lista
        val itemBinding = ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(itemBinding)
    }

    // Reemplazar el contenido de una vista (invocado por el administrador de diseño)
    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        // Obtenga el elemento de su conjunto de datos en esta posición y reemplace el contenido de la vista con ese elemento
        val music: Music = listMusic[position]

        val context = holder.itemView.context

        val idRes = context.resources.getIdentifier(music.picture, "drawable", context.packageName)


        holder.nombre.text = music.nombre
        holder.banda.text = music.banda
        holder.album.text = music.album
        holder.genero.text = music.genero
        holder.tiempo.text = music.tiempo
        holder.picture.setImageResource(idRes)

        if(music.genero == "Rock"){

            holder.image_star.visibility = View.VISIBLE

        }

        holder.btnplay.setOnClickListener {
            Toast.makeText(context, "Play music ${music.nombre}", Toast.LENGTH_SHORT).show()
        }

        holder.btnpause.setOnClickListener {
            Toast.makeText(context, "Pause music ${music.nombre}", Toast.LENGTH_SHORT).show()
        }

        holder.btnshare.setOnClickListener{

            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Nombre: ${music.nombre}")
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"
            ContextCompat.startActivity(context, intent, null)


        }

    }



    //Devuelve el tamaño de tu conjunto de datos (invocado por el administrador de diseño)
    override fun getItemCount(): Int {
        return listMusic.size
    }

}