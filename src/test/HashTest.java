package test;

import org.junit.jupiter.api.Test;
import ulitiy.Hash;

import static org.junit.jupiter.api.Assertions.*;

public class HashTest {

    @Test
    public void testPutAndGet() {
        Hash<String, Integer> hashTable = new Hash<>();

        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);

        assertEquals(1, hashTable.get("A"));
        assertEquals(2, hashTable.get("B"));
        assertEquals(3, hashTable.get("C"));
    }

    @Test
    public void testUpdateValue() {
        Hash<String, Integer> hashTable = new Hash<>();

        hashTable.put("A", 1);
        hashTable.put("A", 10);

        assertEquals(10, hashTable.get("A"));
    }

    @Test
    public void testGetNonExistentKey() {
        Hash<String, Integer> hashTable = new Hash<>();

        assertNull(hashTable.get("nonexistent"));
    }
}