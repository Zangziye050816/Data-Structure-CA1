package ulitiy;
public class Hash<K, V> {
    private static final int INITIAL_CAPACITY = 4;
    private final Entry<K, V>[] hashTable;
    private int size;

    // inner class
    public static class Entry<K, V> {
        public K key;
        public V value;
        public Entry<K, V> next;// For handling collisions (chaining)

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
        public void setKey(){
            this.key = key;
        }
        public K getKey(){
            return key;
        }

    }


    //the constructor
    public Hash() {
        this.hashTable = new Entry[INITIAL_CAPACITY];
        this.size = 0;
    }

    // hashcode
    public int hashFunction(K key) {
        return Math.abs(key.hashCode()) % hashTable.length;
    }

    // get method
    public V get(K key) {
        int home = hashFunction(key),loc = home;
        do {
            if (hashTable[loc] == null) {
                return null;//can't find
            }else if (hashTable[loc].key.equals(key)) {
                return hashTable[loc].value;
            }
            loc = (loc + 1) % hashTable.length;
        } while (loc != home);
        return null;
    }

    // add method
    public boolean put(K key, V value) {
        int home = hashFunction(key),loc = home;
        if (size >= hashTable.length) {
            System.out.println("the table has fulled");
            return false;
        }
        do {
            //if the table has space, add the linked list to the hashtable
            if (hashTable[loc] == null || hashTable[loc].key.equals(key)) {
                hashTable[loc] = new Entry<>(key, value);
                size++;
                return true;
            } else {
            //if not, change the original location
                loc = (loc + 1) % hashTable.length;
            }
        } while (loc != home); // if loc = home ,indicate that the table has no space

        return false;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    // remove method
    public V remove(K key) {
        int home = hashFunction(key),loc = home;
        do {
            if (hashTable[loc] == null) {
                return null; //can't find
            }
            if (hashTable[loc].key.equals(key)) {
                hashTable[loc] = null; //remove
                size--;
                return  hashTable[loc].value;
            }
            loc = (loc + 1) % hashTable.length;
        } while (loc != home);

        return null; // didn't have
    }

    // identify if key is contained
    public boolean containsKey(K key) {
        int home = hashFunction(key),loc = home;
        do {
            if (hashTable[loc] == null) {
                return false; // didn't find
            }
            if (hashTable[loc].key.equals(key)) {
                return true; // find
            }
            loc = (loc + 1) % hashTable.length;
        } while (loc != home);
        return false; // didn't find
    }

    // print the hash table
    public void printTable() {
        for (Entry<K, V> entry : hashTable) {
            while (entry != null) {
                System.out.println(entry.value);
                entry = entry.next;
            }
        }
    }

    public K[] keys() {
        K[] keysArray = (K[]) new Object[size];
        int index = 0;

        for (Entry<K, V> entry : hashTable) {
            if (entry != null) {
                keysArray[index++] = entry.key;
            }
        }
        return keysArray;
    }//get the all the key


    public int size(){
        return size;
    }
}