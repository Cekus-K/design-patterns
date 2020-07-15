package observer.lesson.order;

import observer.lesson.notification.Observer;

interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
