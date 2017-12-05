package structural.decorator;

public class AuthorDecorator extends Decorator {

    public AuthorDecorator(IPainter painter) {
       super(painter);
    }

    @Override
    public void draw() {
        painter.draw();
        System.out.println("Актор: " + painter.getClass().getSimpleName());
    }
}
