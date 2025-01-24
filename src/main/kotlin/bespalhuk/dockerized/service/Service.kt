package bespalhuk.dockerized.service

import bespalhuk.dockerized.persistence.DocumentRepository
import org.springframework.stereotype.Service

@Service
class Service(
    private val repository: DocumentRepository
) {

    fun isMongoUp(): Boolean {
        return try {
            return repository.count() >= 0
        } catch (e: Exception) {
            println(e.message)
            false
        }
    }
}
