package com.tutorial.amritakumari.mvp_architecture

import com.tutorial.amritakumari.mvp.rx.SchedulerProvider
import io.reactivex.schedulers.Schedulers

class ImmediateSchedulerProvider : SchedulerProvider() {
    override fun io() = Schedulers.trampoline()

    override fun computation() = Schedulers.trampoline()

    override fun ui() = Schedulers.trampoline()

}