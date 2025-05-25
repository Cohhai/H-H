package com.example.heavenandhell
import android.content.Intent
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IteamsAdapter(private val items: List<Iteam>, private val context: Context) :
    RecyclerView.Adapter<IteamsAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.item_list_image)
        val title: TextView = view.findViewById(R.id.item_list_title)
        val desc: TextView = view.findViewById(R.id.item_list_desc)
        val price: TextView = view.findViewById(R.id.item_list_price)
        val btn: Button =view.findViewById(R.id.item_list_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.iteam_in_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.desc.text = item.desc
        holder.price.text = "${item.price}$"

        when (position) {
            0 -> holder.image.setImageResource(R.drawable.sword)
            1 -> holder.image.setImageResource(R.drawable.plant)
            2 -> holder.image.setImageResource(R.drawable.knife)
            3 -> holder.image.setImageResource(R.drawable.akyla)
            4 -> holder.image.setImageResource(R.drawable.mask)
            5 -> holder.image.setImageResource(R.drawable.egg)
            6 -> holder.image.setImageResource(R.drawable.plush)
        }
        holder.btn.setOnClickListener{
            val intent = Intent(context,ItemActivity::class.java)
            intent.putExtra("iteamTitle",items[position].title)
            intent.putExtra("iteamText",items[position].text)

            context.startActivity(intent)
        }
         }
    }

