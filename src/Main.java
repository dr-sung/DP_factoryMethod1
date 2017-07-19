/*
 * The example code is adopted from the following site:
 * http://www.codeproject.com/Articles/184765/Factory-Method-Design-Pattern
 */

public class Main {

    public static void main(String[] args) {
        System.out.print("East Coast Customer: ");
        BookStore bookstore = new BookStoreBroncho(BookStore.LOCATION_EASTCOAST);
        bookstore.createDistributor();
        bookstore.getDistributor().shipBook();

        System.out.print("Mid West Customer: ");
        bookstore = new BookStoreBroncho(BookStore.LOCATION_MIDWEST);
        bookstore.createDistributor();
        bookstore.getDistributor().shipBook();

        System.out.print("West Coast Customer: ");
        bookstore = new BookStoreBroncho(BookStore.LOCATION_WESTCOAST);
        bookstore.createDistributor();
        bookstore.getDistributor().shipBook();

    }
}
