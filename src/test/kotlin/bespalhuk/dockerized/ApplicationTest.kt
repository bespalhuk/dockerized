package bespalhuk.dockerized

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTest {

    @Test
    fun randomCrashTest() {
        val random = (1..100).random()
        assertThat(random).isEven()
    }
}
