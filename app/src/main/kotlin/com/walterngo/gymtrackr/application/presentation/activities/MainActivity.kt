package com.walterngo.gymtrackr.application.presentation.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.walterngo.gymtrackr.R
import com.walterngo.gymtrackr.application.presentation.presenters.MainPresenter

class MainActivity : AppCompatActivity(), MainPresenter.ViewSurface {

    val mPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        mPresenter.onCreateView(this)
    }
}
