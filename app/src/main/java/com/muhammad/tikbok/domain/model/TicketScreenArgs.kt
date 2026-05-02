package com.muhammad.tikbok.domain.model

import androidx.compose.runtime.Immutable
import kotlinx.serialization.Serializable

@Immutable
@Serializable
data class TicketScreenArgs(
    val movieId: String,
    val seatListString: String,
    val dayNumber: Int,
    val dayLabel: String,
    val dayFullLabel: String,
    val time: String,
)
