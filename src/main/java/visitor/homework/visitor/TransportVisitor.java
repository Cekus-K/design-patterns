package visitor.homework.visitor;

import visitor.homework.transport.Animal;
import visitor.homework.transport.Person;
import visitor.homework.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
