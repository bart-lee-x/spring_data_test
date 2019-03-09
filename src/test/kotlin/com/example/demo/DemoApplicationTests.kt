package com.example.demo

import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringRunner::class)
@SpringBootTest
//@SpringApplicationConfiguration(classes = DemoApplication::class)
@WebAppConfiguration
@DirtiesContext
class DemoApplicationTests {

    @Autowired
    lateinit var sink: Sink

    @Test
    fun contextLoads() {
        assertNotNull(this.sink.input())
    }

}
