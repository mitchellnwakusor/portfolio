package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "Activity is started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "Activity is destroyed")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "Activity is stopped")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "Activity is paused")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "Activity is restarted")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/")
                )
            )
        })
        button2.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com")
                )
            )
        })

        button3.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=fi.iki.kuitsi.bitbeaker")
                )
            )
        })

        button4.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com")
                )
            )
        })
        button5.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.twitter.com")
                )
            )
        })
        button6.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com")
                )
            )
        })
        button7.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com")
                )
            )
        })
        button8.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=bzSTpdcs-EI")
                )
            )
        })

        button9.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.dribble.com")
                )
            )
        })
        button10.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://linkedin.com")
                )
            )
        })

        button11.setOnClickListener(View.OnClickListener {
            val mailClient = Intent(Intent.ACTION_VIEW)
            mailClient.setClassName(
                "com.google.android.gm",
                "com.google.android.gm.ConversationListActivity"
            )
            startActivity(mailClient)
        })

        button12.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.whatsapp.com")
                )
            )
        })
        button13.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.skype.com")
                )
            )
        })
        button14.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com")
                )
            )
        })
        button15.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://google.com/android")
                )
            )
        })
        button16.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com")
                )
            )
        })








    }
}
