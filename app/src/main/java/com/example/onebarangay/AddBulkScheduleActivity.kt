package com.example.onebarangay

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.content.ContentProviderCompat.requireContext

class AddBulkScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_bulk_sched)
    }

        private val typeofEvent = listOf("SAP", "Ayuda", "Vaccination")
//        val adapter = ArrayAdapter(requireContext(), R.layout.event_list_item, typeofEvent)
//
//    private fun requireContext(): Context {
//
//    }
//        (textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)
}

// To check a checkbox
// checkbox.isChecked = true

// To listen for a checkbox's checked/unchecked state changes
// checkbox.setOnCheckedChangeListener { buttonView, isChecked
    // Responds to checkbox being checked/unchecked
// }