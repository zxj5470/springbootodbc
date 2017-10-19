package com.github.zxj5470

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
class SpringbootodbcApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringbootodbcApplication::class.java, *args)
        }
    }
}
