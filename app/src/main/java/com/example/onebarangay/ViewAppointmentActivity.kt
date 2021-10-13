package com.example.onebarangay

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_view_appointment.*
import kotlinx.android.synthetic.main.success_dialog_bulk_schedule.*
import kotlinx.android.synthetic.main.success_dialog_bulk_schedule.view.*
import kotlinx.android.synthetic.main.success_dialog_bulk_schedule.view.bulkSched_ok_btn
import kotlinx.android.synthetic.main.success_dialog_cancel_apptmnt.view.*
import kotlinx.android.synthetic.main.success_dialog_reappointment.view.*
import kotlinx.android.synthetic.main.success_dialog_report.view.*
import kotlinx.android.synthetic.main.success_reserve_apptmnt.view.*
import kotlinx.android.synthetic.main.warning_dialog_res_not_fnd.view.*
import kotlinx.android.synthetic.main.warning_dialog_res_not_fnd.view.resNotFnd_ok_btn

class ViewAppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_appointment)

        btn_show_dialog.setOnClickListener {
//            val view = View.inflate(this@ViewAppointmentActivity, R.layout.success_dialog_bulk_schedule, null)
//            val view = View.inflate(this@ViewAppointmentActivity, R.layout.success_dialog_reappointment, null)
//            val view = View.inflate(this@ViewAppointmentActivity, R.layout.success_dialog_report, null)
//            val view = View.inflate(this@ViewAppointmentActivity, R.layout.success_dialog_cancel_apptmnt, null)
            val view = View.inflate(this@ViewAppointmentActivity, R.layout.success_reserve_apptmnt, null)

            val builderDialog = AlertDialog.Builder(this@ViewAppointmentActivity)
            builderDialog.setView(view)

            val dialog = builderDialog.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            view.reserveAppt_ok_btn.setOnClickListener {
                dialog.dismiss()
            }
        }
    }
}