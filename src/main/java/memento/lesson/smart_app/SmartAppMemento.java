package memento.lesson.smart_app;

class SmartAppMemento {

    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
