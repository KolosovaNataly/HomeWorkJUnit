import java.util.Scanner;

public class Manager {
    private Scanner scanner = new Scanner(System.in);

    private Basket basket;

    public void start(Basket basket) {
        this.basket = basket;
        boolean loop = true;
        while (loop) {
            if (basket.getTotal() == 0) {
                Shop.textOutput();
            }
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();

            loop = endOfWork(input);
            if (loop) {
                String[] parts = input.split(" ");
                arrayDevision(parts);
                if (parseToInteger(parts)) {
                    productAvailability();
                    subtractionLot();
                }
            }
        }
        basket.printBasket();
    }

    public boolean parseToInteger(String[] parts) {
        try {
            basket.modifyNum(Integer.parseInt(parts[0]));
            basket.modifyLot(Integer.parseInt(parts[1]));
            return true;
        } catch (RuntimeException a) {
            System.out.println("Введена некорректная информация");
            return false;
        }
    }

    private void subtractionLot() {
        int saveValue;
        if (basket.getLot() == 0 || (basket.getLot() < 0 && Math.abs(basket.getLot()) >= basket.getQuantity()[basket.getNum() - 1])) {
            saveValue = basket.getQuantity()[basket.getNum() - 1];
            basket.getQuantity()[basket.getNum() - 1] = 0;
            basket.modifyTotal(basket.getTotal() - Shop.ALL_PRICE[basket.getNum() - 1] * saveValue);
        }
        if (basket.getLot() > 0 || (basket.getLot() < 0 && Math.abs(basket.getLot()) < basket.getQuantity()[basket.getNum() - 1])) {
            basket.getQuantity()[basket.getNum() - 1] += basket.getLot();
            basket.modifyTotal(basket.getTotal() + Shop.ALL_PRICE[basket.getNum() - 1] * basket.getLot());
        }
    }

    public boolean endOfWork(String input) {
        if ("end".equals(input)) {
            return false;
        }
        return true;
    }

    private void arrayDevision(String[] parts) {
        if (parts.length != 2) {
            System.out.println("Введите корректно: номер товара, пробел, количество товара");
            return;
        }
    }
    private void productAvailability(){
        if (basket.getNum() < 0 || basket.getNum() > Shop.ALL_PRODUCT.length) {
            System.out.println("Нет такого товара");
            return;
        }
    }
}
