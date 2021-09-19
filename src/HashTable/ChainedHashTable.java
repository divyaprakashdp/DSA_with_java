package HashTable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredProduct>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for(int i = 0;i<hashTable.length;i++){
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Products products){
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredProduct(key, products));
    }

    public Products get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredProduct> itr = hashTable[hashedKey].listIterator();
        StoredProduct product;
        while(itr.hasNext()){
            product = itr.next();
            if(product.key.equals(key)){
                return product.product;
            }
        }
        return null;
    }

    public Products remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredProduct> itr = hashTable[hashedKey].listIterator();
        StoredProduct product = null;
        int index = 0;
        while(itr.hasNext()){
            product = itr.next();
            index++;
            if(product.key.equals(key)){
                break;
            }
        }

        if(product==null && !product.key.equals(key)){
            return null;
        }else{
            hashTable[hashedKey].remove(index);
            return product.product;
        }
    }

    private int hashKey(String key){
        return key.length() % hashTable.length;
    }

    public void printCHainedHashTable(){
        for(int i=0;i<hashTable.length;i++){
            if(hashTable[i].isEmpty()){
                System.out.println("Empty");
            }else{
                ListIterator<StoredProduct> itr = hashTable[i].listIterator();
                while(itr.hasNext()){
                    System.out.println(itr.next().product);
                }

            }
        }
    }
}
