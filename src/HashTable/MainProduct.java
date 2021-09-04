package HashTable;

public class MainProduct {
    public static void main(String[] args) {
        Products product1 = new Products("TonedMilk", "Milk", 20);
        Products product2 = new Products("Curd", "Curd", 22);
        Products product3 = new Products("Butter", "Butter", 60);

        ProductHashTable hashTable = new ProductHashTable();

        hashTable.put(product1.getID(), product1);
        hashTable.put(product2.getID(), product2);

        hashTable.printHashTable();

        System.out.println(hashTable.get("Curd"));
    }
}
