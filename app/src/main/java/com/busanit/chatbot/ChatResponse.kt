package com.busanit.chatbot

// ChatResponse 데이터 클래스 정의 (ChatResponse.kt)
data class ChatResponse(
    val choices: List<Choice>
) {
    data class Choice(
        val message: Message
    )

    data class Message(
        val role: String,
        val content: String
    )
}

