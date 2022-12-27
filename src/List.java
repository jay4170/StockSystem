public class List<T> {
    private ListNode<T> head; // the constructor simply creates the class with a null value for "head"

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
    /**
     * Returns a string representation of the list.
     *
     * @return a string representation of the list in the form "[item1, item2, ...]"
     */

//    public String printReport() {
//        System.out.println("Report");
//    int i = 0;
//        ListNode<T> current = head;
//        while (current != null) {
//            System.out.println("Item: "+i +current.getData().);
//            current = current.getNext();
//        }
//       ;
//        return result;
//    }
}
