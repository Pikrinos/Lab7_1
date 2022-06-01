package com.example.lab7_1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentActivity

class BatteryReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_BATTERY_LOW){
            val dialog = BatteryDialog()
            val fragmentManager = (context as FragmentActivity).supportFragmentManager
            dialog.show(fragmentManager,"dlg")
        }
    }
}