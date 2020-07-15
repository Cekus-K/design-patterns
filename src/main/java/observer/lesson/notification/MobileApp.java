package observer.lesson.notification;

import observer.lesson.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Mobile App - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
