package visitor.homework.visitor;

import visitor.homework.transport.Animal;
import visitor.homework.transport.Person;
import visitor.homework.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Kind of animal is: "
                + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Name of person is: "
                + person.getFirstName() + " "
                + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Prefix of shipment is: "
                + shipment.getPrefix() + " and serial number is: "
                + shipment.getSerialNumber());
    }
}
