package com.example.lab7_1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentActivity

class AirplaneModeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            var isAirplaneModeEnabled = intent.getBooleanExtra("state", false).toString()
            when(isAirplaneModeEnabled){
                "false" -> isAirplaneModeEnabled = "off"
                "true" -> isAirplaneModeEnabled = "on"
            }
            val dialog = AirplaneDialog.getString(isAirplaneModeEnabled)
            val fragmentManager = (context as FragmentActivity).supportFragmentManager
            dialog.show(fragmentManager,"dlg")
        }
    }
}