public class Stationery extends SaleableItem{
    /**
     * Creates a new SaleableItem with the given name, product number, type, and sell-by date.
     *
     * @param name          the name of the item
     * @param productNumber the product number of the item
     * @param type          the type of the item
     * @param sellByDate    the sell-by date of the item, in the format yyyyddmm
     * @param quantity
     */
    public Stationery(String name, int productNumber, String type, String sellByDate, int quantity) {
        super(name, productNumber, type, sellByDate, quantity);
    }
}
