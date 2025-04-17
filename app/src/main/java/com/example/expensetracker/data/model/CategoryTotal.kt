package com.example.expensetracker.data.model

import androidx.room.ColumnInfo

data class CategoryTotal(
    @ColumnInfo(name = "categoryName")
    val name: String,
    @ColumnInfo(name = "totalAmount")
    val total: Double,

    @ColumnInfo(name = "transactionDate")
    val date: Long?= null
)