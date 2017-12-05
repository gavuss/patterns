package structural.decorator;

public class LeonardoDaVinci implements IPainter {

    String picture;

    public LeonardoDaVinci(String picture) {
        this.picture = picture;
    }

    @Override
    public void draw() {
        System.out.println("Фреска \"" + picture + "\"");
    }
}
