package com.vimeo.networking2

import java.util.*

data class CategoryFollowInteraction(

    /**
     * Whether the authenticated user has followed this category.
     */
    val added: Boolean?,

    /**
     * Whether the authenticated user has followed this category.
     */
    val addedTime: Date?,

    /**
     * The URI for following or unfollowing this category: PUT to this URI to follow the category,
     * or DELETE to this URI to unfollow the category.
     */
    val uri: String?

)