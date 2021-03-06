package com.test.recyclerviewsizing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recycler_view_normal_sizing.*

class RecyclerViewNormalSizing2Views : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_normal_sizing_2_views)

        items_list.adapter = ItemsAdapter().apply { fillSelfWithItems() }
    }
}
