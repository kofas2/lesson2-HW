public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsik", 5),
            new Cat("Murzik", 7),
            new Cat("Pushok", 3)
        };

        Plate plate = new Plate(20); // Создаем тарелку с начальным количеством еды

        System.out.println("Начальное состояние:");
        plate.info();

        // Кормим котов и проверяем сытость
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        System.out.println("\nПосле попыток поесть:");
        plate.info();

        // Выводим информацию о сытости котов
        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        // Добавляем еду в тарелку
        plate.addFood(10);
        System.out.println("\nПосле добавления еды:");
        plate.info();
    }
}