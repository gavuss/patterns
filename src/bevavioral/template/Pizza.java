package bevavioral.template;

public abstract class Pizza {

    public void cookPizza() {
        makeDough();
        addIngredients();
        bake();
        cut();
        box();
    }

    public void makeDough() {
        System.out.println("Готовим тесто");
    }

    public abstract void addIngredients();

    public void bake() {
        System.out.println("Выпекаем пиццу 15 мин при температуре 200 градусов");
    }

    public void cut() {
        System.out.println("Нарезаем пиццу");
    }

    public void box() {
        System.out.println("Упаковываем пиццу");
    }
}
