package com.tutorial.amritakumari.mvp_architecture.data

import java.util.*

class DataGenerator {

    companion object {
        val mProductList = arrayOf("Product1","Product2","Product3","Product4","Product5")
        val mReviewList = arrayOf("Amazing product","Nice quality","Not worth","Too costly","Satisfactory")
    }

    fun getProduct() : String {
        val random = Random()
        return mProductList[random.nextInt(5)]
    }

    fun getReview() : String {
        val random = Random()
        return mReviewList[random.nextInt(5)]
    }

}