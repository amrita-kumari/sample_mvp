package com.tutorial.amritakumari.mvp_architecture

import com.tutorial.amritakumari.mvp.rx.SchedulerProvider
import com.tutorial.amritakumari.mvp_architecture.data.DataRepository
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class ProductPresenterTest {

    private lateinit var mView : ProductContract.View
    private lateinit var compositeDisposable: CompositeDisposable
    private lateinit var schedulerProvider: SchedulerProvider
    private lateinit var repo : DataRepository
    private lateinit var presenter: ProductPresenter

    @Before
    fun setUp(){
        mView = mock(ProductContract.View::class.java)
        compositeDisposable = CompositeDisposable()
        schedulerProvider = ImmediateSchedulerProvider()
        repo = mock(DataRepository::class.java)
        presenter = ProductPresenter(mView, compositeDisposable, schedulerProvider, repo)
    }

    @Test
    fun load_product(){
        val product = Single.just("Test Product")
        `when`(repo.loadProduct()).thenReturn(product)
        presenter.loadProduct()
        verify(mView).displayProduct("Test Product")
    }

    @Test
    fun load_review(){
        val review = Single.just("Test Review")
        `when`(repo.loadReview()).thenReturn(review)
        presenter.loadReview()
        verify(mView).displayReview("Test Review")
    }

}