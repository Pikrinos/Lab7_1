package com.example.lab7_1

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class AirplaneDialog: DialogFragment() {

    private var status: String = "false"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        status = arguments?.getString("status") as String
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Airplane mode")
            .setMessage("Airplane mode is $status")
            .setPositiveButton("Ok",null)
            .create()
    }
    companion object {
        fun getString(status: String): com.example.lab7_1.AirplaneDialog {
            val args = Bundle()
            args.putString("status",status)
            val fragment = AirplaneDialog()
            fragment.arguments = args
            return fragment
        }
    }
}