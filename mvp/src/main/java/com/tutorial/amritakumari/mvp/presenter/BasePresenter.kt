package com.tutorial.amritakumari.mvp.presenter

import android.content.Context
import android.os.Bundle
import com.tutorial.amritakumari.mvp.view.IView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BasePresenter<V : IView>(protected var mView: V?, protected var compositeDisposable: CompositeDisposable): IPresenter<V> {

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
        compositeDisposable.dispose()
    }

    override fun addDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }
}