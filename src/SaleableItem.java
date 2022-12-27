/**
 * A class representing a saleable item.
 */
public class SaleableItem {
    private String name;
    private int productNumber;
    private String type;
    private String sellByDate;

    /**
     * Creates a new SaleableItem with the given name, product number, type, and sell-by date.
     *
     * @param name the name of the item
     * @param productNumber the product number of the item
     * @param type the type of the item
     * @param sellByDate the sell-by date of the item, in the format yyyyddmm
     */
    public SaleableItem(String name, int productNumber, String type, String sellByDate) {
        this.name = name;
        this.productNumber = productNumber;
        this.type = type;
        this.sellByDate = sellByDate;
    }

    /**
     * Returns the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item.
     *
     * @param name the new name of the item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the product number of the item.
     *
     * @return the product number of the item
     */
    public int getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the product number of the item.
     *
     * @param productNumber the new product number of the item
     */
    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * Returns the type of the item.
     *
     * @return the type of the item
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the item.
     *
     * @param type the new type of the item
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the sell-by date of the item.
     *
     * @return the sell-by date of the item, in the format yyyyddmm
     */
    public String getSellByDate() {
        return sellByDate;
    }

    /**
     * Sets the sell-by date of the item.
     *
     * @param sellByDate the new sell-by date of the item, in the format yyyyddmm
     */
    public void setSellByDate(String sellByDate) {
        this.sellByDate = sellByDate;
    }
}
