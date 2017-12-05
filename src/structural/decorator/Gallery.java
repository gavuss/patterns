package structural.decorator;

public class Gallery {

    public static void main(String[] args) {
//        IPainter painter = new LeonardoDaVinci("Тайная вечеря");
//        IPainter painter = new AuthorDecorator(new LeonardoDaVinci("Тайное вече"));
        IPainter painter = new ChristianArtDecorator (new AuthorDecorator(new LeonardoDaVinci("Тайное вече")));
        painter.draw();
    }
}
