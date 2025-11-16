package object;

import ulitiy.Hash;

import java.lang.reflect.Array;


public class DisplayCase {
    private String id;
    private String type;
    private boolean lit;
    private final Hash<Integer,DisplayTray> trays; //the hash table

    public DisplayCase(String id, String type, boolean lit) {
        this.id = id;
        this.type = type;
        this.lit = lit;
        this.trays = new Hash<>();
    }
    public String getIdentifier() {
        return id;
    }

    public void setIdentifier(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLighting() {
        return lit;
    }

    public void setLighting(boolean lit) {
        this.lit = lit;
    }

    public void addTray(DisplayTray newTray) {
        if(trays.containsKey(newTray.getId().hashCode())){
            System.out.println("The id already exists.");
        }
        else{
            trays.put(newTray.getId().hashCode(),newTray);
        }

    }

    public void removeTray(String id) {
        if(!trays.containsKey(id.hashCode())){
            System.out.println("The id doesn't exist.");
        }
        else{
            trays.remove(id.hashCode());
        }

    }

    public void printCase() {
        System.out.print("No." + id + "   " + type + "   ");
        if (lit) {
            System.out.println("LIT");
        } else {
            System.out.println("UNLIT");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Integer[] newKeysArray = trays.keys();
        int i = 0;
        while ( i < newKeysArray.length) {
            DisplayTray current = trays.get(newKeysArray[i]);
            System.out.println(current.printTrays());
            i++;
        }

    }

}


