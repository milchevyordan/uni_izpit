package automated_parking;

public class Engine {
    private int quantity;
    private EngineType engineType;
    private int maxQuantity;

    public int getQuantity() {
        return quantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Engine(int maxQuantity, int quantity, EngineType engineType) {
        this.maxQuantity = maxQuantity;
        this.quantity = quantity;
        this.engineType = engineType;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }
}
