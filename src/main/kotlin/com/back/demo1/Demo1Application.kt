package com.back.demo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class Demo1Application

fun main(args: Array<String>) {
    runApplication<Demo1Application>(*args)
}
