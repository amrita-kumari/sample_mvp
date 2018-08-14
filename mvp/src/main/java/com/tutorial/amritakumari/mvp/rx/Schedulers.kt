package com.tutorial.amritakumari.mvp.rx

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class Schedulers {

    fun io() = Schedulers.io()

    fun computation() = Schedulers.computation()

    fun ui() = AndroidSchedulers.mainThread()

}