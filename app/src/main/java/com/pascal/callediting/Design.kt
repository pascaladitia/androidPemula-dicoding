package com.pascal.callediting

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Design(val imageSrc : Int, val imageTitle: String, val imageDesc : String) : Parcelable