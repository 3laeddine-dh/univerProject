package com.example.universeapp.dataclass

data class RoomChatData(
                        private var roomId  : String,
                        private var roomName : String,
                        private var message : messageData,
                        private var adminId : List<String>
                        )
