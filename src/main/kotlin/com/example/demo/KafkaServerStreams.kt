//package com.example.demo
//
//import org.springframework.cloud.stream.annotation.Input
//import org.springframework.cloud.stream.annotation.Output
//import org.springframework.messaging.MessageChannel
//
//interface KafkaServerStreams {
//
//    @Output(PRODUCER_STREAM)
//    fun producerChannel(): MessageChannel
//
//    @Input()
//    fun listen(): Person
//
//    companion object {
//        const val PRODUCER_STREAM = "kafkatopic1"
//    }
//
//}