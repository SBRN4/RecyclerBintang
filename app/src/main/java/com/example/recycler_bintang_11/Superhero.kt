package com.example.recycler_bintang_11

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descriptionSuperhero: String
) : Parcelable
