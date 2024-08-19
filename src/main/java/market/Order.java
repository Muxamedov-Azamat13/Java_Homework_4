package market;

import market.exception.AmountException;
import market.exception.CustomerException;
import market.exception.ProductException;

import java.nio.Buffer;

public class Order {
    public Customer objectBuyer;
    public Product objectProduct;
    public int count;

    public Order(Customer objectBuyer, Product objectProduct, int count) {
        this.objectBuyer = objectBuyer;
        this.objectProduct = objectProduct;
        this.count = count;
    }


    @Override
    public String toString() {
        return "Order{" +
                "objectBuyer='" + objectBuyer + '\'' +
                ", objectProduct='" + objectProduct + '\'' +
                ", count=" + count +
                '}';
    }

}
