package com.tutorial.amritakumari.mvp.view

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import com.tutorial.amritakumari.mvp.presenter.IPresenter

open abstract class BaseFragment<P : IPresenter<IView> > : Fragment(), IView {

    private lateinit var mPresenter : P

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(mPresenter == null){
            mPresenter = initializePresenter(context)
        }
        mPresenter?.attachView(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

    abstract fun initializePresenter(context: Context) : P

}