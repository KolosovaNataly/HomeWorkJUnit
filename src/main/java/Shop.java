public class Shop {
    public static final String[] PRODUCT = {"Кофе", "Булочка", "Рис"};
    public static final String[] PRODUCT_SALE = {"Торт", "Яблоко", "Какао"};
    public static final String[] ALL_PRODUCT = new String[PRODUCT.length + PRODUCT_SALE.length];
    public static final int[] PRICE = {400, 30, 80};
    public static final int[] PRICE_SALE = {450, 75, 50};
    public static final int[] ALL_PRICE = new int[PRICE.length + PRICE_SALE.length];

    static {
        //заполнение всех продуктов
        System.arraycopy(PRODUCT, 0, ALL_PRODUCT, 0, PRODUCT.length);
        System.arraycopy(PRODUCT_SALE, 0, ALL_PRODUCT, PRODUCT_SALE.length, PRODUCT_SALE.length);

        //заполнение всех цен
        System.arraycopy(PRICE, 0, ALL_PRICE, 0, PRICE.length);
        System.arraycopy(PRICE_SALE, 0, ALL_PRICE, PRICE_SALE.length, PRICE_SALE.length);
    }

    public static void textOutput() {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < ALL_PRODUCT.length; i++) {
            System.out.printf("%d. %s %d руб/шт \n", i + 1, ALL_PRODUCT[i], ALL_PRICE[i]);
        }
    }
}
