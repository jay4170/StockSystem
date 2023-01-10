import java.util.Objects;

public class List<T> {
    private ListNode<T> head;
    private String sortedBy = "date added";
    /**
     * Creates a new empty list.
     */
    public List() {
        head = null;
    }

    /**
     * Appends a new item with the given data to the end of the list.
     *
     * @param data the data to store in the new item
     */
    public void join(T data) {
        if (head == null) {
            head = new ListNode<>(null, data);
        } else {
            head.join(data);
        }
    }

    /**
     * Removes and returns the first item in the list.
     *
     * @return the data stored in the first item, or null if the list is empty
     */
    public T leave() {
        if (head == null) {
            return null;
        } else {
            T result = head.getData();
            head = head.getNext();
            return result;
        }
    }

    /**
     * Returns the data stored in the item at the given index.
     *
     * @param index the index of the item to retrieve
     * @return the data stored in the item at the given index
     * @throws ArrayIndexOutOfBoundsException if the index is negative or exceeds the size of the list
     */
    public T get(int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            return head.get(index);
        }
    }

    /**
     * Sets the data stored in the item at the given index.
     *
     * @param data  the new data to store in the item
     * @param index the index of the item to update
     * @throws ArrayIndexOutOfBoundsException if the index is negative or exceeds the size of the list
     */
    public void set(T data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            head.set(data, index);
        }
    }

    /**
     * Inserts a new item with the given data at the given index.
     *
     * @param data  the data to store in the new item
     * @param index the index at which to insert the new item
     * @throws ArrayIndexOutOfBoundsException if the index is negative or exceeds the size of the list
     */
    public void insert(T data, int index) {
        if (head == null) {
            join(data);
        } else {
            head = head.insert(data, index);
        }
    }
    public int findIndexByName(String name){
        ListNode<T> current = head;
        int index = 0;
        while (current != null) {
            SaleableItem d = (SaleableItem) current.getData();

            if (Objects.equals(d.getName(), name)){
                return index;
            }
            index++;
            current = current.getNext();
        }

    return -1;
    };
    /**
     * Removes the item at the given index from the list.
     *
     * @param index the index of the item to remove
     * @throws ArrayIndexOutOfBoundsException if the index is negative or exceeds the size of the list
     */
    public void delete(int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        head = head.delete(index);
    }

    /**
     * Returns a string representation of the list.
     *
     * @return a string representation of the list in the form "[item1, item2, ...]"
     */
    @Override
    public String toString() {
        String result = "";
        result += "[";
        ListNode<T> current = head;
        while (current != null) {
            result += current.getData();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }
        result += "]";
        return result;
    }

    ///////////////////////////////////////Sorting ////////////////////////////////////////////////////////////////////

    private void sortRecursiveQuantity(List<T> head, int low, int high) {
        if (low < high) {
            int pivot = sortPivotQuantity(head, low, high);
            sortRecursiveQuantity(head, low, pivot - 1);
            sortRecursiveQuantity(head, pivot + 1, high);
        }
    }

    private int sortPivotQuantity(List<T> head, int low, int high) {
        // pivot (Element to be placed at right position)
        SaleableItem pivot = (SaleableItem) head.get(high);
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            // If current element is smaller than the pivot
            SaleableItem current = (SaleableItem) head.get(j);
            if (current.getQuantity()<pivot.getQuantity()) {
                i++;
                this.swap(i, j);
            }
        }
        this.swap(i + 1, high);
        return (i + 1);
    }

    private void sortRecursiveProductNumber(List<T> head, int low, int high) {
        if (low < high) {
            int pivot = sortPivotProductNumber(head, low, high);
            sortRecursiveProductNumber(head, low, pivot - 1);
            sortRecursiveProductNumber(head, pivot + 1, high);
        }
    }

    private int sortPivotProductNumber(List<T> head, int low, int high) {
        // pivot (Element to be placed at right position)
        SaleableItem pivot = (SaleableItem) head.get(high);
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            // If current element is smaller than the pivot
            SaleableItem current = (SaleableItem) head.get(j);
            if (current.getProductNumber()<pivot.getProductNumber()) {
                i++;
                this.swap(i, j);
            }
        }
        this.swap(i + 1, high);
        return (i + 1);
    }

    private void sortRecursiveName(List<T> head, int low, int high) {
        if (low < high) {
            int pivot = sortPivotName(head, low, high);
            sortRecursiveName(head, low, pivot - 1);
            sortRecursiveName(head, pivot + 1, high);
        }
    }

    private int sortPivotName(List<T> head, int low, int high) {
        // pivot (Element to be placed at right position)
        SaleableItem pivot = (SaleableItem) head.get(high);
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            // If current element is smaller than the pivot
            SaleableItem current = (SaleableItem) head.get(j);
            if (current.getName().charAt(0)<pivot.getName().charAt(0)) {
                i++;
                this.swap(i, j);
            }
        }
        this.swap(i + 1, high);
        return (i + 1);
    }


    private void sortRecursiveType(List<T> head, int low, int high) {
        if (low < high) {
            int pivot = sortPivotType(head, low, high);
            sortRecursiveType(head, low, pivot - 1);
            sortRecursiveType(head, pivot + 1, high);
        }
    }

    private int sortPivotType(List<T> head, int low, int high) {
        // pivot (Element to be placed at right position)
        SaleableItem pivot = (SaleableItem) head.get(high);
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            // If current element is smaller than the pivot
            SaleableItem current = (SaleableItem) head.get(j);
            if (current.getType().charAt(0)<pivot.getType().charAt(0)) {
                i++;
                this.swap(i, j);
            }
        }
        this.swap(i + 1, high);
        return (i + 1);
    }



    ////////////////Reports for assignment/////////////////////////////
    /**
     Sorts the list based on the specified criterion.
     @param sortBy Valid values are "quantity", "name", "productNumber", and "type".
     If an invalid value is specified, a message is printed to the console indicating that the value is not valid.
     */
    public void sort(String sortBy) {
        if (Objects.equals(sortBy, "quantity")){
            sortRecursiveQuantity(this,0, this.length() - 1);
            this.sortedBy = sortBy;
        }else         if (Objects.equals(sortBy, "name")){
            sortRecursiveName(this,0, this.length() - 1);
            this.sortedBy = sortBy;

        }else         if (Objects.equals(sortBy, "productNumber")){
            sortRecursiveProductNumber(this,0, this.length() - 1);
            this.sortedBy = sortBy;

        }else         if (Objects.equals(sortBy, "type")){
            sortRecursiveType(this,0, this.length() - 1);
            this.sortedBy = sortBy;

        }
        else{ System.out.println("Not a valid search String");}
    }

    /**
     Prints all the SaleableItems in the list to the console.
     */
    public void printAll(){
        String result = "";
        System.out.println("All Items In Stock sorted by "+sortedBy+" :"); ;
        ListNode<T> current = head;
        while (current != null) {
            SaleableItem d = (SaleableItem) current.getData();
            result = "Name: "+d.getName()+", "+"Product ID: "+d.getProductNumber()+", "+"Type: "+d.getType()+", "+"Quantity: "+d.getQuantity();
            if (Objects.equals(d.getType(),"Tool" ) |Objects.equals(d.getType(), "Stationery" )){
                result += ", Check By: "+d.getSellByDate();
            }else{
                result += ", Sell By: "+d.getSellByDate();

            }
            System.out.println(result);
            current = current.getNext();
        }
        result += "]";

    }
    /**

     Deletes an item from the list by its name.
     @param name the name of the item to delete
     @throws ArrayIndexOutOfBoundsException if the item with the specified name is not found in the list
     */
    public void deleteItemByName(String name) {
        ListNode<T> current = head;
        int i = 0;
        while (current != null) {
            SaleableItem item = (SaleableItem) current.getData();
            if (Objects.equals(item.getName(), name)) {
                System.out.println("Deleted item: " + item.getName());
                this.delete(i);
                return;
            }
            i++;
            current = current.getNext();
        }
        System.out.println("Couldn't find an item with that name");

    }
    /**

     Deletes an item from the list based on the given product number.
     @param productNumber the product number of the item to delete
     */
    public void deleteItemByProductNumber(int productNumber) {
        ListNode<T> current = head;
        int i = 0;
        while (current != null) {
            SaleableItem item = (SaleableItem) current.getData();
            if (Objects.equals(item.getProductNumber(), productNumber)) {
                System.out.println("Deleted item: " + item.getName());
                this.delete(i);
                return;
            }
            i++;
            current = current.getNext();
        }
        System.out.println("Couldn't find an item with that product number");

    }
    /**

     Sorts and prints the list of items by name.
     */
    public void printByName(){
        sort("name");
        printAll();
    }
    /**

     Sorts and prints the list of items by type.
     */
    public void printByType(){
        sort("type");
        printAll();
    }
    /**

     Sorts and prints the list of items by product number.
     */
    public void printByProductNumber(){
        sort("productNumber");
        printAll();
    }
    /**

     Sorts and prints the list of items by quantity.
     */
    public void printByQuantity(){
        sort("quantity");
        printAll();
    }
    /**

     Finds a ListNode in the list by searching for an item with a given name.
     @param name the name to search for
     @return the ListNode containing the item with the given name, or null if no such item is found
     */
    public ListNode<T> findItemByName(String name) {
        ListNode<T> current = head;
        while (current != null) {
            SaleableItem item = (SaleableItem) current.getData();
            if (Objects.equals(item.getName(), name)) {
                System.out.println("Found one item with that name Product Number is:"+item.getProductNumber());
                return current;
            }
            current = current.getNext();
        }
        System.out.println("No item with that name found");
        return null;
    }
    /**

     Adds a new item or updates the quantity of an existing item with the same name.
     @param data the data of the new item to add or update
     */
    public void addItem(T data) {
        ListNode<T> current = head;
        SaleableItem newItem = (SaleableItem) data;
        int foundIndex = findIndexByName(newItem.getName());
        if (foundIndex > 0) {
            System.out.println("Found item, updating quantity");
            while (current != null) {
                SaleableItem item = (SaleableItem) current.getData();
                if (Objects.equals(item.getName(), newItem.getName())) {
                    ((SaleableItem) current.getData()).setQuantity(item.getQuantity() + newItem.getQuantity());


                    head.set(current.getData(),foundIndex);
                    return;
                }
                current = current.getNext();
            }
        } else {
            join(data);
        }
    }

public void specialSort(){
        sort("quantity");
        sort("type");
        printAll();
}



}
