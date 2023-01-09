package com.project.cleanarchitecturenoteapp.feature_note.domain.util

//Sealed class means this class cannot be inherited

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}