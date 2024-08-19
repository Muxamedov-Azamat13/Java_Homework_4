package market;

public class Main {
    public static void main(String[] args) {
        Customer[] buyers = {
                new Customer("Alice", 30, 1, Customer.Gender.FEMALE),
                new Customer("Bob", 25, 2, Customer.Gender.MALE),
                new Customer("Charlie", 35, 3, Customer.Gender.MALE)
        };

        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Phone", 800),
                new Product("Tablet", 600)

        };

        OnlineStore.Holiday holiday = OnlineStore.determineTodayHoliday();
        OnlineStore.congratulations(buyers,holiday);


    }
}