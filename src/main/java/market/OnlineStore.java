package market;

import market.exception.AmountException;
import market.exception.CustomerException;
import market.exception.ProductException;

import java.security.PublicKey;
import java.time.LocalDate;

public class OnlineStore {

    public enum Holiday{
        NO_HOLIDAY, NEW_YEAR, MARCH_8, FEBRUARY_28
    }

    public static Holiday determineTodayHoliday() {
        LocalDate today = LocalDate.now();
        if (today.getMonthValue() == 1 && today.getDayOfMonth() == 1) {
            return Holiday.NEW_YEAR;
        } else if (today.getMonthValue() == 3 && today.getDayOfMonth() == 8) {
            return Holiday.MARCH_8;
        } else if (today.getMonthValue() == 2 && today.getDayOfMonth() == 23) {
            return Holiday.FEBRUARY_28;
        } else {
            return Holiday.NO_HOLIDAY;
        }
    }

    public static void congratulations(Customer[] buyers, Holiday holiday){
        for (Customer c : buyers){
            switch (holiday){
                case NO_HOLIDAY -> {
                    System.out.println("Нет праздника " + c.getName());
                    break;
                }
                case NEW_YEAR -> {
                    System.out.println("С новым годом " + c.getName());
                    break;
                }
                case MARCH_8 -> {
                    if (c.getGender() == Customer.Gender.FEMALE){
                        System.out.println("С 8 мартом " + c.getName());
                    }
                    break;
                }
                case FEBRUARY_28 -> {
                    if (c.getGender() == Customer.Gender.MALE){
                        System.out.println("С 28 февралом " + c.getName());
                    }
                    break;
                }
                default -> {
                    System.out.println("Сегодня нет праздника!");
                    break;
                }
            }
        }
    }

    public Customer buyers[];
    public Product products[];

    public OnlineStore(Customer[] buyers, Product[] products) {
        this.buyers = buyers;
        this.products = products;
    }

    public Order makePurchase(String buyerName, String product, int count)
            throws CustomerException, ProductException, AmountException {

        if (count <= 0 || count > 100) {
            throw new AmountException("Количество товара не должно быть пустым!");
        }

        Customer customer = null;
        for (Customer c : buyers)
            if (c.name.equals(buyerName)) {
                customer = c;
                break;
            }
        if (customer == null) throw new CustomerException("Пустой покупатель!");

        Product product1 = null;
        for (Product p : products) {
            if (p.name.equals(product)) {
                product1 = p;
                break;
            }
        }
        if (product1 == null) throw new ProductException("Пустой продукт");

        return new Order(customer, product1, count);
    }


}
