package com.muhammad.tikbok.domain.model

import androidx.compose.runtime.Immutable
import kotlinx.serialization.Serializable

@Immutable
@Serializable
data class Theatre(
    val movieId: String,
    val seatNumber: Int,
    val dayNumber: Int,
    val dayLabel: String,
    val dayFullLabel: String,
    val time: String
)
