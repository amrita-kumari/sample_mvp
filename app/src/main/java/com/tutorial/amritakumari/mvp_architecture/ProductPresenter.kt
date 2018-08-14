package com.tutorial.amritakumari.mvp_architecture

import com.tutorial.amritakumari.mvp.presenter.BasePresenter
import com.tutorial.amritakumari.mvp.rx.Schedulers
import com.tutorial.amritakumari.mvp_architecture.data.DataRepository
import io.reactivex.disposables.CompositeDisposable

class ProductPresenter(mView : ProductContract.View,
                       compositeDisposable: CompositeDisposable,
                       private val schedulers: Schedulers,
                       private val repo : DataRepository) :
        BasePresenter<ProductContract.View>(mView, compositeDisposable), ProductContract.Presenter<ProductContract.View> {

    override fun loadProduct() {
        compositeDisposable.add(repo.loadProduct()
                .subscribeOn(schedulers.computation())
                .observeOn(schedulers.io())
                .subscribe(mView!! :: displayProduct))
    }

    override fun loadReview() {
        compositeDisposable.add(repo.loadReview()
                .subscribeOn(schedulers.computation())
                .observeOn(schedulers.io())
                .subscribe(mView!! :: displayReview))
    }
}