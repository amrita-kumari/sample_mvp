package com.tutorial.amritakumari.mvp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tutorial.amritakumari.mvp.presenter.IPresenter

abstract class BaseActivity<P : IPresenter<*>> : AppCompatActivity(),IView {

    protected var mPresenter : P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(mPresenter == null){
            mPresenter = initializePresenter()
        }
        mPresenter?.onCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mPresenter?.onSave(outState)
    }

    override fun onResume() {
        super.onResume()
        mPresenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        mPresenter?.onPause()
    }

    override fun onStop() {
        super.onStop()
        mPresenter?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.onDestroy()
    }

    abstract fun initializePresenter() : P

}