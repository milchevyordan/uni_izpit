package farm;

public abstract class Milking extends Animal implements Milky {
    private double quantity;
    private double maxQuantity;
    private volatile boolean milking;
    private Thread milkingThread;

    public Milking(int maxPower, double maxQuantity) {
        super(maxPower); // this calls the Animal constructor
        this.maxQuantity = maxQuantity;
        this.quantity = 0;
    }

    protected void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getMaxQuantity() {
        return maxQuantity;
    }

    @Override
    public boolean start(){
        if (milking || quantity <= 0) return false;

        milking = true;
        milkingThread = new Thread(() -> {
            while (milking && quantity > 0) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                quantity -= quantity * 0.07; // Намаляваме с 7%
                if (quantity <= 0) {
                    quantity = 0;
                    milking = false;
                }
            }
        });
        milkingThread.start();
        return true;
    };

    @Override
    public boolean progress(){
        return milking;
    }

    @Override
    public boolean stop(){
        if (milking) {
            milking = false;
            return true;
        }

        return false;
    }
}
