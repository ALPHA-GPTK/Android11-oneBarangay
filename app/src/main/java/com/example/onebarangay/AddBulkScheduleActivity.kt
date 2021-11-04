package com.example.onebarangay

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.onebarangay.fragments.ServicesFragment
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import kotlinx.android.synthetic.main.activity_add_bulk_schedule.*
import kotlinx.android.synthetic.main.success_dialog_bulk_schedule.view.*
import java.text.SimpleDateFormat
import java.util.*

class AddBulkScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_bulk_schedule)

        val eventType = listOf("Update Resident Information", "SAP", "Ayuda", "Vaccination")
        val eventTypeAdapter =
            ArrayAdapter(this, R.layout.bulk_sched_dropdown_event_type, eventType)
        (eventTypeDrop.editText as? AutoCompleteTextView)?.setAdapter(eventTypeAdapter)

        val timeInterval = listOf("Hourly", "Minute")
        val timeIntervalAdapter =
            ArrayAdapter(this, R.layout.bulk_sched_dropdown_relationship_type, timeInterval)
        (timeDrop.editText as? AutoCompleteTextView)?.setAdapter(timeIntervalAdapter)

        val relationshipType = listOf("Head of the Family", "Mother", "Father", "Daughter", "Son")
        val relTypeAdapter =
            ArrayAdapter(this, R.layout.bulk_sched_dropdown_relationship_type, relationshipType)
        (householdDrop.editText as? AutoCompleteTextView)?.setAdapter(relTypeAdapter)

        bulkSched_doneBtn.setOnClickListener {
            val view = View.inflate(this@AddBulkScheduleActivity,
                R.layout.success_dialog_bulk_schedule,
                null)

            val builderDialog = AlertDialog.Builder(this@AddBulkScheduleActivity)
            builderDialog.setView(view)

            val dialog = builderDialog.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            view.bulkSched_ok_btn.setOnClickListener {
                dialog.dismiss()
            }
        }

        bulkSched_cancelBtn.setOnClickListener {
            super.onBackPressed()
        }

        // For Date Picker
        bulkSched_editDateInterval.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val months = monthOfYear + 1
                bulkSched_editDateInterval.setText("$months / $dayOfMonth / $year")
            }, year, month, day)

            // Disable previous date
            datePickerDialog.datePicker.minDate = calendar.timeInMillis

            datePickerDialog.show()
        }

        // For Time Picker
        bulkSched_editTimeInterval.setOnClickListener {
            val currentTime = Calendar.getInstance()
            val startHour = currentTime.get(Calendar.HOUR_OF_DAY)
            val startMinute = currentTime.get(Calendar.MINUTE)

            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                bulkSched_editTimeInterval.setText("$hourOfDay:$minute")
            }, startHour, startMinute, false).show()
        }

    }

// To check a checkbox
// checkbox.isChecked = true

// To listen for a checkbox's checked/unchecked state changes
// checkbox.setOnCheckedChangeListener { buttonView, isChecked
//     Responds to checkbox being checked/unchecked
// }/

}