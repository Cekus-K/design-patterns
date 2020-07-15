package observer.lesson;

import observer.lesson.notification.Email;
import observer.lesson.notification.MobileApp;
import observer.lesson.notification.TextMessage;
import observer.lesson.order.Order;
import observer.lesson.order.OrderStatus;

class Main {
    public static void main(String[] args) {
        /*
         * Observer main task: providing information about the change of the object's
         * condition to other interested objects
         */

        Order order = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();
        System.out.println("-----------------------------------");

        order.changeOrderStatus(OrderStatus.SHIPPED);
        System.out.println("-----------------------------------");

        order.unregisterObserver(email);
        order.changeOrderStatus(OrderStatus.RECEIVED);
    }
}
