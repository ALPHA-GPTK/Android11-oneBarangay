package com.example.onebarangay.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.onebarangay.EditUserProfileActivity
import com.example.onebarangay.R
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_edit_user_profile.view.*
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)

//        view.editUserProfileBtn.setOnClickListener {
//            startActivity(Intent(context, EditUserProfileActivity::class.java))
//        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = listOf("Male", "Female")
        val adapter = ArrayAdapter(requireContext(), R.layout.dropdown_gender, items)
        (gendDrop.editText as? AutoCompleteTextView)?.setAdapter(adapter)

    }


}