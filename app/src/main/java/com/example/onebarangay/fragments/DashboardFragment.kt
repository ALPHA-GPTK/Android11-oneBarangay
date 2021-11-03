package com.example.onebarangay.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onebarangay.AnnouncementAdapter
import com.example.onebarangay.R
import kotlinx.android.synthetic.main.activity_main.view.*

/**
 * A simple [Fragment] subclass.
 */
class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

//        val recyclerView:RecyclerView
//
//        recyclerView = view.findViewById(R.id.rv_announcement)
//        recyclerView.layoutManager = LinearLayoutManager(context)

//        view.rv_announcement.layoutManager = LinearLayoutManager(activity)
//        view.rv_announcement.adapter = AnnouncementAdapter()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}