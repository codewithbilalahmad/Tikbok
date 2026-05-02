package com.muhammad.tikbok.domain.model

import androidx.compose.runtime.Immutable
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.*

@Immutable
@Serializable
data class Ticket(
    val id: String,
    val movieId: String,
    val movieTitle: String,
    val posterUrl: String,
    @Contextual
    val showTime: LocalTime,
    @Contextual
    val showDate: LocalDate,
    val seats: List<String>,
    val row : Int,
    val screenNumber : Int,
    val seatCount : Int,
    val price : Float,
    @Contextual
    val bookedAt: LocalDateTime,
)
