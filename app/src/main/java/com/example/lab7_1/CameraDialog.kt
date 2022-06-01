package com.example.lab7_1

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CameraDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Camera")
            .setMessage("You have clicked on the camera button")
            .setPositiveButton("Ok",null)
            .create()
    }
}