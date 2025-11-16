package test;
import org.junit.Test;
import ulitiy.DoublyLinkedList;


public class DoublyLinkedListTest {
    DoublyLinkedList<String> shop = new DoublyLinkedList<>();

    @Test // test the add methods
    public void add(){
        shop.addFirst("A");
        shop.addLast("B");
    }


    @Test // test the get method
    public void get(){
        shop.addFirst("A");
        shop.addLast("B");
        System.out.println("Element at index 1: " + shop.getData(0));
    }

    @Test  // test the remove methods
    public void remove(){
        shop.addFirst("A");
        shop.addLast("B");
        shop.removeFirst();
        shop.removeLast();

    }


    @Test// test the specific methods
    public void specific(){
        shop.addFirst("D");
        shop.addLast("E");
        shop.removeSpecific(1);

    }


}