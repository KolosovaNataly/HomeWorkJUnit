import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тест класса Manager")
class ManagerTest {

    @Test
    @DisplayName("Тест метода parseToInteger")
    void parseToInteger() {
        Manager manager = new Manager();
        Assertions.assertFalse(manager.parseToInteger(new String[]{"1", "3", "4"}));
    }

    @Test
    @DisplayName("Тест метода endOfWork")
    void endOfWorkFalse() {
        Manager manager = new Manager();
        Assertions.assertFalse(manager.endOfWork("end"));
    }

    @Test
    @DisplayName("Тест метода endOfWork")
    void endOfWorkTrue() {
        Manager manager = new Manager();
        Assertions.assertTrue(manager.endOfWork("Another word"));
    }

}