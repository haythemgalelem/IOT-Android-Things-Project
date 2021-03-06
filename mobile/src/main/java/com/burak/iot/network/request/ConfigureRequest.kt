package com.burak.iot.network.request

import com.google.gson.annotations.SerializedName

data class ConfigureRequest(

        @field:SerializedName("name")
        var name: String? = null,

        @field:SerializedName("active")
        var active: Boolean? = null

)