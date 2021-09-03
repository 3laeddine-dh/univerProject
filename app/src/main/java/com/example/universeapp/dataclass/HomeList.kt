package com.example.universeapp.dataclass

import java.sql.Blob
import java.sql.Date

data class HomeData(private var id : String,
                    private var picture : Blob,
                    private var title : String,
                    private var lastMessage : String,
                    private var date : Date)
