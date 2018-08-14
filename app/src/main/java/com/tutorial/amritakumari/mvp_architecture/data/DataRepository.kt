package com.tutorial.amritakumari.mvp_architecture.data

import io.reactivex.Single

class DataRepository(private val dataGenerator: DataGenerator) {

    fun loadProduct() = Single.just(dataGenerator.getProduct())

    fun loadReview() = Single.just(dataGenerator.getReview())

}