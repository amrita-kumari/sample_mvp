package com.tutorial.amritakumari.mvp.rx

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

open class SchedulerProvider {

    open fun io() = Schedulers.io()

    open fun computation() = Schedulers.computation()

    open fun ui() = AndroidSchedulers.mainThread()

}