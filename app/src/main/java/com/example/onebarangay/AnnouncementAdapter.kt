package com.example.onebarangay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.announcement_custom_view.view.*

//class AnnouncementAdapter(val arrayList: ArrayList<Model>, val context: Context):
//    RecyclerView.Adapter<AnnouncementAdapter.ViewHolder>() {
//
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bindItems(model: Model) {
//            itemView.announcement_title.text = model.title
//            itemView.announcement_date.text = model.date
//            itemView.announcement_time.text = model.time
//            itemView.announcement_desc.text = model.desc
//            itemView.announcement_img.setImageResource(model.image)
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ): AnnouncementAdapter.ViewHolder {
//        val v = LayoutInflater.from(parent.context).inflate(R.layout.announcement_custom_view, parent, false)
//
//        return ViewHolder(v)
//    }
//
//    override fun onBindViewHolder(holder: AnnouncementAdapter.ViewHolder, position: Int) {
//        holder.bindItems(arrayList[position])
//    }
//
//    override fun getItemCount(): Int {
//        return arrayList.size
//    }
//}

// New for Firestore
class AnnouncementAdapter(private val announcementList: ArrayList<Announcement>) : RecyclerView.Adapter<AnnouncementAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int, ): AnnouncementAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.announcement_custom_view, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnnouncementAdapter.MyViewHolder, position: Int) {
        val announcement : Announcement = announcementList[position]
        holder.announcementTitle.text = announcement.title
        holder.announcementCreated.text = announcement.created
        holder.announcementDesc.text = announcement.body
    }

    override fun getItemCount(): Int {
        return announcementList.size
    }

    public class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val announcementTitle : TextView = itemView.findViewById(R.id.announcement_title)
        val announcementCreated : TextView = itemView.findViewById(R.id.announcement_created)
        val announcementDesc : TextView = itemView.findViewById(R.id.announcement_desc)
        val announcementImg : ImageView = itemView.findViewById(R.id.announcement_img)
    }

}

