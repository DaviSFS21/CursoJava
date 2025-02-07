package enumerator.applications;

import enumerator.entities.Order;
import enumerator.entities.enums.OrderStatus;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Order order = new Order(1080, OrderStatus.PENDING_PAYMENT, new Date());
        Order order2 = new Order(1081, OrderStatus.valueOf("SHIPPED"), new Date());

        System.out.println(order);
        System.out.println(order2);
    }
}
