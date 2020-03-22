package com.test.recyclerviewsizing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launch_with_issue.setOnClickListener { startActivity(Intent(this, RecyclerViewWrongSizing::class.java)) }
        launch_with_issue_2_views.setOnClickListener { startActivity(Intent(this, RecyclerViewWrongSizing2Views::class.java)) }
        launch_no_issue.setOnClickListener { startActivity(Intent(this, RecyclerViewNormalSizing::class.java)) }
        launch_no_issue_2_views.setOnClickListener { startActivity(Intent(this, RecyclerViewNormalSizing2Views::class.java)) }
    }
}
