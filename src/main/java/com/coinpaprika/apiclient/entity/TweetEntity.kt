/*
 * Created by Piotr Kostecki on 13.12.18 10:35
 * kontakt@piotrkostecki.pl
 *
 * Last modified 13.12.18 10:35
 */

package com.coinpaprika.apiclient.entity

import com.google.gson.annotations.SerializedName

data class TweetEntity(val date: String,
                       @SerializedName("user_name") val userName: String,
                       val status: String,
                       @SerializedName("is_retweet") val isRetweet: Boolean,
                       @SerializedName("status_link") val statusLink: String,
                       @SerializedName("media_link") val mediaLink: String?)