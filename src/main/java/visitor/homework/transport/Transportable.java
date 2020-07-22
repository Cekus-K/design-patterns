package visitor.homework.transport;

import visitor.homework.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor visitor);
}
