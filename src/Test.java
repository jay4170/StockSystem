import java.util.Objects;

public class Test {
    private static boolean testPass = true;

    public static void main(String[] args) {
//        testSwap();
//        deleteByNameTest();
//        deleteByProductNumberTest();
//        testSort();
//        printByTests();
//        addItemTest();
        specialTest();
        if (testPass){
            System.out.println("All Tests Passed");
        }
        if (!testPass){
            System.out.println("One or more Tests failed");
        }
    }
    private static void testSort(){
        //Sort by name test
    List<SaleableItem> items = new List<>();
    items.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
    items.join(new Fruit("Orange", 34567, "Fruit", "20210601", 15));
    items.join(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
    items.sort("name");
    if(!Objects.equals(items.get(1).getName(), "Banana")){
        System.out.println("Sort by name failed");
        testPass = false;
    }
    //Sort by product number test
    List<SaleableItem> items2 = new List<>();
    items2.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
    items2.join(new Fruit("Orange", 34567, "Fruit", "20210601", 15));
    items2.join(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
    items2.sort("productNumber");
    if(!Objects.equals(items2.get(1).getName(), "Banana")){
        System.out.println("Sort by product number failed");
        testPass = false;
    }
    //Sort by product number test
    List<SaleableItem> items3 = new List<>();
    items3.join(new Tool("Hammer", 34567, "Tool", "20210601", 15));
    items3.join(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
    items3.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
    items3.sort("type");
    if(!Objects.equals(items3.get(2).getName(), "Hammer")){
        System.out.println("Sort by type failed");
        testPass = false;
    }
}
    private static void testSwap() {
        List<Integer> items = new List<>();
        List<Integer> itemsTest = new List<>();
        items.join(1);
        items.join(2);
        itemsTest.join(2);
        itemsTest.join(1);
        items.swap(0,1);
        if (!Objects.equals(items.get(0), itemsTest.get(0))){
            System.out.println("Item swap failed");
            testPass = false;
        }

    }
    private static void deleteByNameTest(){
        List<SaleableItem> items = new List<>();
        items.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
        items.join(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
        items.join(new Fruit("Orange", 34567, "Fruit", "20210601", 15));
        //Delete item Apple
         items.deleteItemByName("Apple");
        if (items.findItemByName("Apple") !=null){
            System.out.println("Delete by name failed");
            testPass = false;
        }

    }
    private static void deleteByProductNumberTest(){
        List<SaleableItem> items = new List<>();
        items.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
        items.join(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
        items.join(new Fruit("Orange", 34567, "Fruit", "20210601", 15));
        //Delete item Apple
        items.deleteItemByProductNumber(12345);

        if (items.findItemByName("Apple") !=null){
            System.out.println("Delete by product number failed");
            testPass = false;
        }

    }

    private static List<SaleableItem> stockList(){
        List<SaleableItem> items = new List<>();
        items.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
        items.join(new Sweet("Banana Sweets", 23456, "Sweets", "20210901", 20));
        items.join(new Fruit("Orange", 34567, "Fruit", "20210601", 15));
        items.join(new Fruit("Strawberry", 45678, "Fruit", "20210501", 25));
        items.join(new Fruit("Grape", 56789, "Fruit", "20210801", 30));
        items.join(new Fruit("Peach", 67890, "Fruit", "20210401", 35));
        items.join(new Fruit("Watermelon", 78901, "Fruit", "20210701", 40));
        items.join(new Sweet("Pineapple Sweets", 89012, "Sweets", "20210901", 45));
        items.join(new Fruit("Kiwi", 90123, "Fruit", "20210601", 50));
        items.join(new Fruit("Mango", 668, "Fruit", "20210501", 55));
        items.join(new Fruit("Lemon", 12340, "Fruit", "20210801", 60));
        items.join(new  Stationery("Pencil", 23401, "Stationery", "20210401", 65));
        items.join(new Fruit("Cherries", 34501, "Fruit", "20210701", 70));
        items.join(new Fruit("Blueberries", 45012, "Fruit", "20210901", 75));
        items.join(new Fruit("Blackberries", 60134, "Fruit", "20210501", 85));
        items.join(new Fruit("Raspberries", 50123, "Fruit", "20210601", 80));
        items.join(new Tool("Hammer", 70123, "Tool", "20210801", 1));


        return items;
    }
    public static void printByTests(){
        List<SaleableItem> items = stockList();
        items.printByQuantity();
        items.printByType();
        items.printByProductNumber();
        items.printByName();
    }
    public static void addItemTest(){

        List<SaleableItem> items = new List<>();
        items.join(new Fruit("Apple", 12345, "Fruit", "20210701", 10));
        items.join(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
        items.join(new Fruit("Orange", 34567, "Fruit", "20210601", 15));
        items.addItem(new Fruit("Banana", 23456, "Fruit", "20210901", 20));
        items.printAll();
    }
    public static void specialTest(){

        List<SaleableItem> items = stockList();
           items.specialSort();
    }
}
