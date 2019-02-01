package com.yggdralisk.githubbrowser.presenttion.main

import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.yggdralisk.githubbrowser.R
import com.yggdralisk.githubbrowser.util.extension.asNullable
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSupportActionBar()
        setupDrawerClickListeners()
    }

    private fun setupDrawerClickListeners() {
        mainNavigationView.setNavigationItemSelectedListener {
            Timber.d("Menu item selected")
            false
        }

        mainNavigationView.getHeaderView(0)?.setOnClickListener {
            Timber.d("Header click")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?) = when (item?.itemId) {
        android.R.id.home -> {
            openDrawer()
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    private fun openDrawer(gravity: Int = GravityCompat.START) =
        getDrawerLayout()?.openDrawer(gravity)

    private fun getDrawerLayout() = mainDrawerLayout.asNullable()

    private fun setupSupportActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }
    }
}