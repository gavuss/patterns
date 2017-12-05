package structural.decorator;

public class ChristianArtDecorator extends Decorator {

    public ChristianArtDecorator(IPainter painter) {
        super(painter);
    }

    @Override
    public void draw() {
        System.out.println("Христианское искусство");
        painter.draw();
    }
}
