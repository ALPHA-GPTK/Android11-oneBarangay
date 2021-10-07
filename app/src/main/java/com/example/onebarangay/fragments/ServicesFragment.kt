package com.example.onebarangay.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onebarangay.R
import com.example.onebarangay.ScanDocumentActivity
import com.example.onebarangay.ViewAppointmentActivity
import com.example.onebarangay.ViewReportsActivity
import kotlinx.android.synthetic.main.fragment_services.view.*

/**
 * A simple [Fragment] subclass.
 */
class ServicesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_services, container, false)

        view.vAppointmentBtn.setOnClickListener {
            startActivity(Intent(context, ViewAppointmentActivity::class.java))
        }

        view.vReportsBtn.setOnClickListener {
            startActivity(Intent(context, ViewReportsActivity::class.java))

        }

        view.sDocuBtn.setOnClickListener {
            startActivity(Intent(context, ScanDocumentActivity::class.java))

        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}