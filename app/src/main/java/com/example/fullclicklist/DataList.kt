package com.example.fullclicklist
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataList(val Image:Int, val txt: String?, val price: String?): Parcelable



val list = mutableListOf<DataList>(
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk"),
    DataList(R.drawable.food,"Food","30Tk")
)




