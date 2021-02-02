package com.umssee.phoneexampleandroid

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.umssee.phoneexampleandroid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.main = this

        binding.phoneNum = "010-0000-0000"

        val builder = AlertDialog.Builder(this)
        builder.apply {
            setTitle("전화걸기")
            setMessage(binding.phoneNum)
            setPositiveButton("OK",
                DialogInterface.OnClickListener { dialog, id ->
                    // User clicked OK button
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${binding.phoneNum}"))
                    startActivity(intent)
                })
            setNegativeButton("cancel",
                DialogInterface.OnClickListener { dialog, id ->
                    // User cancelled the dialog
                })
        }
        // Create the AlertDialog
        builder.create()

        binding.btnCall.setOnClickListener {
            builder.show()


        }


    }
}