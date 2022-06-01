package com.example.lab7_1

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class BatteryDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Battery")
            .setMessage("Please charge your battery")
            .setPositiveButton("Ok",null)
            .create()
    }
}