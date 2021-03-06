//package com.example.demo
//
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
//import org.springframework.messaging.MessageHeaders
//import org.springframework.messaging.support.MessageBuilder
//import org.springframework.stereotype.Service
//import org.springframework.util.MimeTypeUtils
//
//@Service
//class KafkaService(private val producerStream: KafkaServerStreams) {
//
//    private val log: Logger = LoggerFactory.getLogger(KafkaService::class.java)
//
//    fun helloService(): String {
//        return "hello service"
//    }
//
//    fun sendMessage(person: Person) {
//        log.info("Sending person {}", person)
//        val messageChannel = producerStream.producerChannel()
//        messageChannel.send(MessageBuilder
//                .withPayload(person)
//                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
//                .build())
//    }
//}