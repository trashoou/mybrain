package practice;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeAll
    void setup() {
        cart = new ShoppingCart();
    }

    @BeforeEach
    void init() {
    }

    @AfterEach
    void tearDown() {
        cart.empty();
    }

    @Test
    @DisplayName("Тест добавления товара в корзину")
    void testAddItem() {
        cart.addItem(2.50);
        assertEquals(1,cart.getItemCount());

    }

    @Test
    @DisplayName("Тест очистки корзины")
    void testEmptyCart() {
        cart.addItem(2.50);
        assertEquals(1,cart.getItemCount());
        cart.empty();
        assertEquals(0,cart.getItemCount());
    }

    @Test
    @DisplayName("Тест расчета общей стоимости")
    void testTotalPriceCalculation() {
        cart.addItem(2.50);
        cart.addItem(2.50);
        assertEquals(5,cart.getTotalPrice()); // 2.50 + 2.50 = 5
    }

    // Добавьте дополнительные тестовые методы по мере необходимости
}

