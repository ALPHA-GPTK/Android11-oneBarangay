package com.example.onebarangay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import fragments.DashboardFragment
import fragments.NotificationsFragment
import fragments.ProfileFragment
import fragments.ServicesFragment
import io.sentry.Sentry
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_dashboard.*

class MainActivity : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val servicesFragment = ServicesFragment()
    private val notificationFragment = NotificationsFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(dashboardFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.dashboard -> replaceFragment(dashboardFragment)
                R.id.services -> replaceFragment(servicesFragment)
                R.id.notification -> replaceFragment(notificationFragment)
                R.id.profile -> replaceFragment(profileFragment)
            }
            true
        }

//        val adapter = ItemAdapter()
//        announcementRV.layoutManager = LinearLayoutManager(this)
//        announcementRV.adapter = adapter

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}