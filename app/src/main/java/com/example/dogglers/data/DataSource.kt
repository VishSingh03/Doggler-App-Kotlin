package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.DogInfo

class DataSource {
    fun info() : List<DogInfo>{ return listOf(
        DogInfo(R.string.dog1, R.string.a1, R.drawable.dog1),
        DogInfo(R.string.dog2, R.string.a2, R.drawable.dog2),
        DogInfo(R.string.dog3, R.string.a3, R.drawable.dog3),
        DogInfo(R.string.dog4, R.string.a4, R.drawable.dog4),
        DogInfo(R.string.dog5, R.string.a5, R.drawable.dog5)
    )
    }
}