package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.common.Pageable

/**
 * List of albums that could be paged.
 */
@JsonClass(generateAdapter = true)
data class AlbumList(

    @Json(name = "total")
    override val total: Int?,

    @Json(name = "page")
    override val page: Int?,

    @Json(name = "per_page")
    override val perPage: Int?,

    @Json(name = "paging")
    override val paging: Paging?,

    @Json(name = "data")
    override val data: List<Album>?

) : Pageable<Album>
