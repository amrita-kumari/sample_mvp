package com.tutorial.amritakumari.mvp.presenter

import android.os.Bundle
import com.tutorial.amritakumari.mvp.view.IView

interface IPresenter<V : IView> {

    fun attachView(view : V)

    fun onCreate(savedInstanceState : Bundle?)

    fun onSave(savedInstanceState : Bundle?)

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()

    fun dettachView()
}