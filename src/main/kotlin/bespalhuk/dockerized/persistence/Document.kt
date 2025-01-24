package bespalhuk.dockerized.persistence

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("documents")
class Document {
    @Id
    val id: String? = ObjectId.get().toHexString()
}
