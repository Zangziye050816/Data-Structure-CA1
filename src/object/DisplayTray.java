package object;

import ulitiy.DoublyLinkedList;

public class DisplayTray {
    private String id;
    private String inlayColor;
    private int width;
    private int depth;
    private DoublyLinkedList<JewelleryItem> items; //

    public DisplayTray(String id, String inlayColor, int width, int depth) {
        this.id = id;
        this.inlayColor = inlayColor;
        this.width = width;
        this.depth = depth;
        this.items = new DoublyLinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterialColour() {
        return inlayColor;
    }

    public void setMaterialColour(String inlayColor) {
        this.inlayColor = inlayColor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // add method
    public void addFirstItem(JewelleryItem newItem) {
        items.addFirst(newItem);
    }

    public void addLastItem(JewelleryItem newItem) {
        items.addLast(newItem);
    }

    public void removeFirstItem() {
        items.removeFirst();
    }

    public void removeLastItem() {
        items.removeLast();
    }

    public void getSpecificItem(int index) {
        items.getSpecific(index);
    }

    public void removeSpecificItem(int index) {
        items.removeSpecific(index);
    }

    public String printTrays() {
        String jewellery = null;
        for (int i = 0; i < items.size(); i++) {
            JewelleryItem current = items.getData(i);
            jewellery = jewellery + current.printItems();
        }
        return "[" + id + "]   " + "Inlay_material_colour: " + inlayColor + "   " + width + "cm " + depth + "cm " + "This tray has " + items.size() + " pieces of jewelleries." + jewellery;
    }
}

