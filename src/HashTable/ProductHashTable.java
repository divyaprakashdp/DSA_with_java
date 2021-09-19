package HashTable;

public class ProductHashTable {
    private StoredProduct[] hashTable;

    public ProductHashTable() {
        hashTable = new StoredProduct[31];
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
            //linear probing
            int stopIndex = hashedKey;
            if(hashedKey == hashTable.length-1){
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
            hashTable[hashedKey] = new StoredProduct(key, product);
        }
    }

    public Products get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }else{
            return hashTable[hashedKey].product;
        }

    }

    public Products remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }else{
            Products product = hashTable[hashedKey].product;
            hashTable[hashedKey] = null;
            return product;
        }

    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)){
            return  hashedKey;
        }

        //linear probing
        int stopIndex = hashedKey;
        if(hashedKey == hashTable.length-1){
            hashedKey = 0;
        }else{
            hashedKey++;
        }

        while(hashedKey != stopIndex && hashTable[hashedKey] != null &&
                !hashTable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey+1) % hashTable.length;
        }

        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)){
            return hashedKey;
        }else{
            return -1;
        }
    }

    public void printHashTable(){
        for (StoredProduct products : hashTable) {
            if(products == null){
                System.out.println("empty");
            }else{
                System.out.println(products.product);
            }

        }
    }
}
