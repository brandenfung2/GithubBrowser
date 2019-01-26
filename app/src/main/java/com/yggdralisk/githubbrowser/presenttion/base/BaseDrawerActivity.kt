package com.yggdralisk.githubbrowser.presenttion.base

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

abstract class BaseDrawerActivity : AppCompatActivity() {
    abstract fun getDrawerLayout(): DrawerLayout?

    protected fun openDrawer(gravity: Int = GravityCompat.START) =
        getDrawerLayout()?.openDrawer(gravity)
}