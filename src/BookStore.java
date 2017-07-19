
// participant: Creator (Factory)
public abstract class BookStore {
    
    private Distributor distributor;

    public static final int LOCATION_EASTCOAST = 1;
    public static final int LOCATION_MIDWEST = 2;
    public static final int LOCATION_WESTCOAST = 3;
    
    public void createDistributor() {
        distributor = factoryMethod();
    }
    
    public Distributor getDistributor() {
        return distributor;
    }

    public abstract Distributor factoryMethod();

}
