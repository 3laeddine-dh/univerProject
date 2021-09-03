package com.example.universeapp.dataclass

import android.graphics.Bitmap
import java.security.interfaces.RSAMultiPrimePrivateCrtKey
import java.sql.Blob

data class statusData(
    public var message_content : String,
    public var message_file : Blob? = null,
    var message_picture: Bitmap? = null,
    var file_desc : String?=null
)
