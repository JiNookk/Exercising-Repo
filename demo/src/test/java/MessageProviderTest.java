import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageProviderTest {

    @Test
    void defaultMessage() {
        MessageProvider messageProvider = new MessageProvider();

        assertEquals("Hello, world!", messageProvider.message());

    } // 아무것도 안썼을 떈 이거여야 되

    @Test
    void messageToYou() {
        MessageProvider messageProvider = new MessageProvider("Ashal");

        assertEquals("Hello, Ashal!", messageProvider.message());
    } // 인자 전달했을 땐 이거여야 해
}