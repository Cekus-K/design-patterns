package memento.lesson;

import memento.lesson.smart_app.SmartApp;
import memento.lesson.smart_app.SmartAppCaretaker;

class Main {

    public static void main(String[] args) {

        // memento pattern is used to save different versions of an object's state

        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.3);
        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);

        smartApp.load(smartAppCaretaker.getMemento(0));
    }
}
