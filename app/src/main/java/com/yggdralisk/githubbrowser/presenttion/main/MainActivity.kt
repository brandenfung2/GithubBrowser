package com.yggdralisk.githubbrowser.presenttion.main

import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.yggdralisk.githubbrowser.R
import com.yggdralisk.githubbrowser.util.extension.asNullable
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainContract.View, HasSupportFragmentInjector {
    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.onAttachView(this)
        setContentView(R.layout.activity_main)
        setupSupportActionBar()
        setupDrawerClickListeners()
    }

    private fun setupSupportActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }
    }

    private fun setupDrawerClickListeners() {
        mainNavigationView.setNavigationItemSelectedListener {
            presenter.onDrawerItemClick(it)
        }

        mainNavigationView.getHeaderView(0)?.setOnClickListener {
            presenter.onDrawerHeaderClick(it)
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

    private fun getDrawerLayout() =
        mainDrawerLayout.asNullable()
}