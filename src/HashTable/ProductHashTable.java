package HashTable;

public class ProductHashTable {
    private Products[] hashTable;

    public ProductHashTable() {
        hashTable = new Products[31];
    }

    private boolean occupied(int index){
        return hashTable[index] != null;
    }

    private int hashKey(String key){
        // Temp hashing method, we could use hashCode()
        return key.length() % hashTable.length;
    }

    public void put(String key, Products product){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashTable.length){
                hashedKey = 0;
            }else{
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey+1) % hashTable.length;
            }
        }
        if(hashTable[hashedKey] != null){
            System.out.println("There's already a product at position "+hashedKey);
        }else{
            hashTable[hashedKey] = product;
        }
    }

    public Products get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printHashTable(){
        for (Products products : hashTable) {
            System.out.println(products);
        }
    }
}
