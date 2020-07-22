package visitor.homework;

import visitor.homework.transport.Animal;
import visitor.homework.transport.Person;
import visitor.homework.transport.Shipment;
import visitor.homework.transport.Transportable;
import visitor.homework.visitor.NameTransportVisitor;
import visitor.homework.visitor.PriceTransportVisitor;
import visitor.homework.visitor.TransportVisitor;

import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        TransportVisitor nameTransportVisitor = new NameTransportVisitor();
        TransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(element -> element.accept(nameTransportVisitor));
        System.out.println("--------------------------");
        transportableList.forEach(element -> element.accept(priceTransportVisitor));
    }
}
