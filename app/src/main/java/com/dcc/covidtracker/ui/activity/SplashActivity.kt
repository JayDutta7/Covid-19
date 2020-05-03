package com.dcc.covidtracker.ui.activity

import android.os.Bundle
import com.dcc.covidtracker.R
import com.dcc.covidtracker.ui.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }//end of oncreate

    override fun setContentView(): Int? {
        return R.layout.activity_main
    }


}
