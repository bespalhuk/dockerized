package bespalhuk.dockerized.web

import bespalhuk.dockerized.service.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val service: Service,
) {

    @GetMapping("ae")
    fun ae(): String {
        return "oe"
    }

    @GetMapping("mongo")
    fun isMongoUp(): Boolean {
        return service.isMongoUp()
    }
}
