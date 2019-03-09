package com.example.demo

import org.springframework.boot.runApplication
import org.apache.commons.logging.LogFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Processor
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.context.annotation.Bean
import org.springframework.integration.annotation.InboundChannelAdapter
import org.springframework.integration.annotation.Poller
import org.springframework.integration.core.MessageSource
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel
import org.springframework.messaging.support.GenericMessage
import reactor.core.publisher.Flux
import java.time.Duration
import java.util.concurrent.atomic.AtomicBoolean
import org.springframework.kafka.support.Acknowledgment
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.Message
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component
import org.synchronoss.cloud.nio.multipart.MultipartUtils.getHeaders




// https://github.com/spring-cloud/spring-cloud-stream-samples/blob/master/processor-samples/reactive-processor/src/main/java/reactive/kafka/ReactiveProcessorApplication.java

@SpringBootApplication
@EnableBinding(Sink::class)
class DemoApplication

data class Greetings(
		val timestamp: Long,
		val message: String
)

@Component
class ConverseListener {

	@StreamListener(Sink.INPUT)
	fun handle(@Payload greetings: Greetings) {
		println("RCV -> $greetings")
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
