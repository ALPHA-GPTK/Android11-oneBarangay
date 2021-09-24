package com.example.onebarangay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.onebarangay.fragments.DashboardFragment
import com.example.onebarangay.fragments.NotificationsFragment
import com.example.onebarangay.fragments.ProfileFragment
import com.example.onebarangay.fragments.ServicesFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private val dashboardFragment = DashboardFragment()
//    private val servicesFragment = ServicesFragment()
//    private val notificationFragment = NotificationsFragment()
//    private val profileFragment = ProfileFragment()

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_dashboard -> {
                moveToFragment(DashboardFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_services -> {
                moveToFragment(ServicesFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notification -> {
                moveToFragment(NotificationsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                moveToFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        replaceFragment(dashboardFragment)
//
//        bottom_navigation.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.dashboard -> replaceFragment(dashboardFragment)
//                R.id.services -> replaceFragment(servicesFragment)
//                R.id.notification -> replaceFragment(notificationFragment)
//                R.id.profile -> replaceFragment(profileFragment)
//            }
//            true
//        }

//        val adapter = ItemAdapter()
//        announcementRV.layoutManager = LinearLayoutManager(this)
//        announcementRV.adapter = adapter

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        moveToFragment(DashboardFragment())

    }

    private fun moveToFragment(fragment: Fragment) {
        val fragmentTrans = supportFragmentManager.beginTransaction()

        fragmentTrans.replace(R.id.fragment_container, fragment)
        fragmentTrans.commit()
    }

//    private fun replaceFragment(fragment: Fragment) {
//        if (fragment != null) {
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container, fragment)
//            transaction.commit()
//        }
//    }
}