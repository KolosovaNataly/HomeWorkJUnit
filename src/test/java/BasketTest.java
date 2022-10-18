import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Тестирование класса Basket")
class BasketTest {

    @Test
    @DisplayName("Тестирование метода modifyTotal")
    void modifyTotal() {
        Basket basket = new Basket();
        int number = 3;
        Assertions.assertEquals(number,basket.modifyTotal(number));
    }

    @Test
    @DisplayName("Тестирование метода modifyLot")
    void modifyLot() {
        Basket basket = new Basket();
        int lot = 4;
        Assertions.assertEquals(lot, basket.modifyLot(lot));

    }
}