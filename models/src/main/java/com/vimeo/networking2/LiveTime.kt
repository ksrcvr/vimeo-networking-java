package com.vimeo.networking2

data class LiveTime(

    /**
     * The amount of time per event that the user is allowed to live stream.
     */
    val eventMaximum: Int?,

    /**
     * The amount of time this month, in seconds, that the user can live stream.
     */
    val monthlyMaximum: Long?,

    /**
     * The amount of time remaining this month, in seconds, that the user can live stream.
     */
    val monthlyRemaining: Long?

)