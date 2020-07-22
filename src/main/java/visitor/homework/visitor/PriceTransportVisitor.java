package visitor.homework.visitor;

import visitor.homework.transport.Animal;
import visitor.homework.transport.Person;
import visitor.homework.transport.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Price for kilometer for animal: "
                + (animal.getWeight() * 0.2) + "PLN");
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price /= 2;
        }
        System.out.println("Price for kilometer for person: "
                + price + "PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge()) {
            price *= 3;
        }
        System.out.println("Price for kilometer for shipment: "
                + price + "PLN");
    }
}
