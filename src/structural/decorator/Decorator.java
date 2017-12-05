package structural.decorator;

public abstract class Decorator implements IPainter {

    IPainter painter;

    protected Decorator(IPainter painter) {
        this.painter = painter;
    }
}
