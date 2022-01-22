package com.example.testtask.data.reviews.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = false)
data class ReviewsResponseDto(
        @Json(name = "status")
        val status: String,
        @Json(name = "copyright")
        val copyright: String,
        @Json(name = "has_more")
        val hasMore: Boolean,
        @Json(name = "num_results")
        val numResults: Int,
        @Json(name = "results")
        val reviews: List<ReviewDto>?
)

@JsonClass(generateAdapter = false)
data class ReviewDto(
        @Json(name = "display_title")
        val displayTitle: String,
        @Json(name = "byline")
        val byline: String,
        @Json(name = "summary_short")
        val summaryShort: String,
        @Json(name = "publication_date")
        val publicationDate: String,
        @Json(name = "date_updated")
        val dateUpdated: String,
        val link: Link,
        val multimedia: Multimedia?
)

@JsonClass(generateAdapter = false)
data class Link(
        val url: String
)

@JsonClass(generateAdapter = false)
data class Multimedia(
        val src: String?
)
