
// participant: ConcreteCreator (ConcreteFactory)

public class BookStoreBroncho extends BookStore {

    private final int customerLocation;

    public BookStoreBroncho(int customerLocation) {
        this.customerLocation = customerLocation;
    }

    @Override
    public Distributor factoryMethod() {
        // internal logic on which distributor to return
        // Logic can be changed without changing the client code
        switch (customerLocation) {
            case LOCATION_EASTCOAST:
                return new EastCoastDistributor();
            case LOCATION_MIDWEST:
                return new MidWestDistributor();
            case LOCATION_WESTCOAST:
                return new WestCoastDistributor();
        }
        return null;
    }
}
