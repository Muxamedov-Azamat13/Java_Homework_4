package market;

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
                case NO_HOLIDAY -> System.out.println("Нет праздника " + c.getName());

                case NEW_YEAR -> System.out.println("С новым годом " + c.getName());

                case MARCH_8 -> {
                    if (c.getGender() == Customer.Gender.FEMALE){
                        System.out.println("С 8 мартом " + c.getName());
                    }
                }
                case FEBRUARY_28 -> {
                    if (c.getGender() == Customer.Gender.MALE){
                        System.out.println("С 28 февралом " + c.getName());
                    }
                }
                default -> System.out.println("Сегодня нет праздника!");

            }
        }
    }

    public Customer[] buyers;
    public Product[] products;

    public OnlineStore(Customer[] buyers, Product[] products) {
        this.buyers = buyers;
        this.products = products;
    }


}
