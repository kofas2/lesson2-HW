class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Тарелка: " + food);
    }

    public boolean decreaseFood(int amount) {
        if (amount >= 0 && food >= amount) {
            food -= amount;
            return true; // Если удалось уменьшить количество еды
        }
        return false; // Если не удалось уменьшить количество еды
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
}