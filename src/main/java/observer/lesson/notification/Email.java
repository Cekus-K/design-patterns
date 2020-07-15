package observer.lesson.notification;

import observer.lesson.order.Order;

public class Email implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Email - Order number: " + order.getOrderNumber() + " changed status to: " + order.getOrderStatus());
    }
}
