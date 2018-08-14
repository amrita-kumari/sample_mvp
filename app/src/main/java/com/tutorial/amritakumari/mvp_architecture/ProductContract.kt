package com.tutorial.amritakumari.mvp_architecture

import com.tutorial.amritakumari.mvp.presenter.IPresenter
import com.tutorial.amritakumari.mvp.view.IView

interface ProductContract {

    interface View : IView{
        fun displayProduct(product : String)
        fun displayReview(review : String)
    }

    interface Presenter<V : View> : IPresenter<V>{
        fun loadProduct()
        fun loadReview()
    }

}