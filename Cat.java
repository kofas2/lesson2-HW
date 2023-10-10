class Cat {
    private String name;
    private int appetite;
    private boolean fullness; // Флаг сытости кота

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false; // Начально кот голоден
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            fullness = true;
            System.out.println(name + " поел!");
        } else {
            System.out.println(name + " не может поесть, в тарелке недостаточно еды.");
        }
    }

    public boolean isFull() {
        return fullness;
    }

    public String getName() {
        return name;
    }
}