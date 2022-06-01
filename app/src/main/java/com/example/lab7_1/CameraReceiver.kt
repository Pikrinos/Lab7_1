package com.example.lab7_1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentActivity

class CameraReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_CAMERA_BUTTON){
            val dialog = CameraDialog()
            val fragmentManager = (context as FragmentActivity).supportFragmentManager
            dialog.show(fragmentManager,"dlg")
        }
    }
}