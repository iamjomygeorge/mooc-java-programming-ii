public class Container {
    private int amount;

    public void addAmount(int amount) {
        if (amount > 0) {
            if (this.amount + amount > 99){
                this.amount = 100;
            } else {
                this.amount += amount;
            }
        }
    }

    public void moveAmount(int amount, Container container) {
        int toBeAdded = this.removeAmount(amount);
        container.addAmount(toBeAdded);
    }

    public int removeAmount(int amount) {
        int amountRemoved = 0;

        if (amount > 0) {
            if (this.amount - amount < 0) {
                amountRemoved = this.amount;
                this.amount = 0;
            } else {
                amountRemoved = amount;
                this.amount -= amount;
            }
        }

        return amountRemoved;
    }

    @Override
    public String toString() {
        return amount + "/100";
    }
}
