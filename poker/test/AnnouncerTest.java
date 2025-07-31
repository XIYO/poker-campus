import announcer.Announcer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AnnouncerTest {

    @Test
    @DisplayName("게임 시작: 예외 없이 실행된다.")
    void shouldStartNewGameWithoutException() {
        assertDoesNotThrow(() -> {
            Announcer.newGame(() -> {});
        });
    }

    @Test
    @DisplayName("게임 종료: 예외 없이 실행된다.")
    void shouldEndGameWithoutException() {
        assertDoesNotThrow(() -> {
            Announcer.endGame(() -> {});
        });
    }
}
