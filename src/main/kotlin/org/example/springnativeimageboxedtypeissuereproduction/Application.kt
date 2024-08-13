package org.example.springnativeimageboxedtypeissuereproduction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class NonNull(
    val isX: Boolean
)

data class Nullable(
    val isX: Boolean?
)

@SpringBootApplication
@RestController
@RequestMapping("/")
class Application {
    @GetMapping("/nonnull")
    fun nonnull() = NonNull(true)

    @GetMapping("/nullable")
    fun nullable() = Nullable(true)
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
