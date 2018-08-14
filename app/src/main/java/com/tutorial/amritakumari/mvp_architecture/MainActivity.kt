package com.tutorial.amritakumari.mvp_architecture

import android.os.Bundle
import android.view.View
import com.tutorial.amritakumari.mvp.rx.SchedulerProvider
import com.tutorial.amritakumari.mvp.view.BaseActivity
import com.tutorial.amritakumari.mvp_architecture.data.DataGenerator
import com.tutorial.amritakumari.mvp_architecture.data.DataRepository
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ProductContract.Presenter<ProductContract.View>>(), ProductContract.View {

    override fun initializePresenter(): ProductContract.Presenter<ProductContract.View>
            = ProductPresenter(this, CompositeDisposable(), SchedulerProvider() ,DataRepository(DataGenerator()))

    override fun displayProduct(product: String) {
        productName.text = product
    }

    override fun displayReview(review: String) {
        productReview.text = review
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getProduct(view : View){
        mPresenter?.loadProduct()
        mPresenter?.loadReview()
    }
}
