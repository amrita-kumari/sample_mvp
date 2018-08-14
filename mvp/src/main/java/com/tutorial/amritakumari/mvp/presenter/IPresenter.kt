package com.tutorial.amritakumari.mvp.presenter

import android.os.Bundle
import io.reactivex.disposables.Disposable

interface IPresenter<V> {

    fun onCreate(savedInstanceState : Bundle?)

    fun onSave(savedInstanceState : Bundle?)

    fun onResume()

    fun onPause()

    fun onStop()

    fun onDestroy()

    fun dettachView()

    fun addDisposable(disposable: Disposable)
}