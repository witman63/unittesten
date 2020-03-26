package nl.martin.prive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MessageServiceTest {

	@DisplayName("Test MessageService.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", MessageService.get());
    }

}
