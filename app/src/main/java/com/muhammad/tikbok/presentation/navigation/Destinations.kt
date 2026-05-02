package com.muhammad.tikbok.presentation.navigation

import com.muhammad.tikbok.domain.model.Theatre
import com.muhammad.tikbok.domain.model.Ticket
import kotlinx.serialization.Serializable

interface Destinations{
    @Serializable
    data object HomeScreen : Destinations
    @Serializable
    data object DetailScreen : Destinations
    @Serializable
    data object BookingScreen : Destinations
    @Serializable
    data class TheatreScreen(val theatre: Theatre) : Destinations
    @Serializable
    data class TicketScreen(val ticket: Ticket) : Destinations
}