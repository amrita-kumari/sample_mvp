package com.tutorial.amritakumari.mvp.presenter

import android.content.Context
import android.os.Bundle
import com.tutorial.amritakumari.mvp.view.IView

open class BasePresenter<V : IView>(protected val context: Context) : IPresenter<V> {

    private  var mView: IView? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
    }

    override fun onSave(savedInstanceState: Bundle?) {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    override fun onDestroy() {
    }

    override fun dettachView() {
        mView = null
    }

}