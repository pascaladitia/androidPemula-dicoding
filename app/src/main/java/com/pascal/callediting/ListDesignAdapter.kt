package com.pascal.callediting

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListDesignAdapter(
    private val context: Context,
    private val images: List<Design>,
    val listener: (Design) -> Unit
) : RecyclerView.Adapter<ListDesignAdapter.ImageViewHolder>() {

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageSrc = view.findViewById<ImageView>(R.id.img_item_photo)
        val title = view.findViewById<TextView>(R.id.tv_item_name)
        val desc = view.findViewById<TextView>(R.id.tv_item_detail)
        val btnBelajar: Button = itemView.findViewById(R.id.btn_belajar)

        fun bindView(image: Design, listener: (Design) -> Unit) {

            imageSrc.setImageResource(image.imageSrc)
            title.text = image.imageTitle
            desc.text = image.imageDesc

            itemView.setOnClickListener {
                Toast.makeText(btnBelajar.context, "Selamat Belajar :)", Toast.LENGTH_SHORT).show()
            }
            btnBelajar.setOnClickListener {
                listener(image) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_row_design, parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)

        }
    }
