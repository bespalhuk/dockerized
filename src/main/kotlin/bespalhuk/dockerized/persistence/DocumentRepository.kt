package bespalhuk.dockerized.persistence

import org.springframework.data.mongodb.repository.MongoRepository

interface DocumentRepository : MongoRepository<Document, String>
