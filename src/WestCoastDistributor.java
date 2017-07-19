
// participant: Concrete Product

public class WestCoastDistributor implements Distributor {

    @Override
    public void shipBook() {
        System.out.println("Book shipped by West Coast Distributor");
    }
    
}
