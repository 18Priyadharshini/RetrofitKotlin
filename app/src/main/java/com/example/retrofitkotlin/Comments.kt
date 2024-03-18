package com.example.retrofitkotlin

import android.provider.ContactsContract.CommonDataKinds.Email

data class Comments(
    val body: String,
    val email: String,
    val id: Int,
    val name: String,
    val postId: Int,
)
