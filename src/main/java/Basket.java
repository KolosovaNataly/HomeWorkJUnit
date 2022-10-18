public class Basket {
    private int[] quantity = new int[Shop.PRICE.length + Shop.PRICE_SALE.length];
    private int total = 0;
    private int num = 0;
    private int lot = 0;

    public int[] getQuantity() {
        return quantity;
    }

    public int getTotal() {
        return total;
    }

    public int getNum() {
        return num;
    }

    public int getLot() {
        return lot;
    }

    public int modifyTotal(int total) {
        return this.total = total;
    }

    public int modifyLot(int lot) {
        return this.lot = lot;
    }

    public int modifyNum(int num) {
        return this.num = num;
    }

    public void printBasket() {
        System.out.println("Ваша корзина:");
        int sale = 0;
        for (int i = 0; i < getQuantity().length; i++) {
            if (getQuantity()[i] != 0) {
                for (int j = 0; j < Shop.PRODUCT_SALE.length; j++) {
                    if (Shop.PRODUCT_SALE[j].equals(Shop.ALL_PRODUCT[i])) {
                        sale = sale + ((getQuantity()[i] / 3) * Shop.ALL_PRICE[i]);
                    }
                }
                System.out.println(Shop.ALL_PRODUCT[i] + " " + getQuantity()[i] + " шт " + Shop.ALL_PRICE[i] + " руб/шт " + (getQuantity()[i] * Shop.ALL_PRICE[i]) + " руб в сумме");
            }
        }
        System.out.println("Итого: " + (getTotal() - sale) + " руб");
        if (sale > 0) {
            System.out.println("Скидка : " + sale);
        }
    }
}
