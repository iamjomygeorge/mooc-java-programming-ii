public class Container {

    private int amountOfLiquid;

    public Container() {
        amountOfLiquid = 0;
    }

    public int contains() {
        return amountOfLiquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + amountOfLiquid > 100) {
                amountOfLiquid = 100;
            } else {
                amountOfLiquid += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amountOfLiquid - amount < 0) {
                amountOfLiquid = 0;
            } else {
                amountOfLiquid -= amount;
            }
        }
    }

    public void move(int amount, Container container) {
        int amountRemoved = 0;

        if (amount > 0) {
            if (amountOfLiquid - amount < 0) {
                amountRemoved = amountOfLiquid;
            } else {
                amountRemoved = amount;
            }
        }

        this.remove(amount);
        container.add(amountRemoved);
    }

    public String toString() {
        return amountOfLiquid + "/100";
    }
}
