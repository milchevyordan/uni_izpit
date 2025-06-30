package automated_parking;

public abstract class Vehicle implements Charging, Volume {
    private Dimensions dimension;
    private Engine engine;

    public Vehicle(double width, double length, Engine engine) {
        this.dimension = new Dimensions(width, length);
        this.engine = engine;
    }

    public abstract String klaxon();

    @Override
    public String onCharging(){
        if (engine.getEngineType() == EngineType.ICE){
            return "ICE no Charging";
        }

        int quantityOfCharge = engine.getQuantity();

        if (quantityOfCharge >= 75 && quantityOfCharge <= 99){
            setToMaxQuantity();

            return "Charging 300ms";
        } else if (quantityOfCharge >= 55 && quantityOfCharge <= 74){
            setToMaxQuantity();

            return "Charging 450ms";
        } else if (quantityOfCharge >= 0 && quantityOfCharge <= 54){
            setToMaxQuantity();

            return "Charging 900ms";
        } else {
            return "Already fully charged";
        }
    }

    private void setToMaxQuantity(){
        engine.setQuantity(engine.getMaxQuantity());
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public double calculate(){
        return dimension.getLength() * dimension.getWidth();
    }
}
