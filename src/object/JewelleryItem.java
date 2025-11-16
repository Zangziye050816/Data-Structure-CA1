package object;

import ulitiy.DoublyLinkedList;

public class JewelleryItem {
    private String description;
    private String type;
    private String gender;
    private String image;
    private double retailPrice;
    private final DoublyLinkedList<Material> materials;

    public JewelleryItem(String description, String type, String gender, String image, double retailPrice) {
        this.description = description;
        this.type = type;
        this.gender = gender;
        this.image = image;
        this.retailPrice = retailPrice;
        this.materials =new  DoublyLinkedList<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTargetGender() {
        return gender;
    }

    public void setTargetGender(String targetGender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return image;
    }

    public void setImgUrl(String image) {
        this.image = this.image;
    }

    public double getPrice() {
        return retailPrice;
    }

    public void setPrice(double retailPrice) {
        this.retailPrice= retailPrice;
    }

    public void addFirstMaterial(Material newMaterial) {materials.addFirst(newMaterial);}

    public void addLastMaterial(Material newMaterial) {
        materials.addLast(newMaterial);
    }

    public void removeFirstMaterial() {
        materials.removeFirst();
    }

    public void removeLastMaterial() {
        materials.removeLast();
    }

    public void getSpecificMaterial(int index) {
        materials.getSpecific(index);
    }

    public void removeSpecificMaterial(int index) {
        materials.removeSpecific(index);
    }

    public String printItems() {
        String material= null;
        for (int i = 0; i < materials.size(); i++) {
            Material current = materials.getData(i);
            material = material + current.printMaterial();
        }
        return "-Type: " + type+"-Target Gender: " + gender+"-Image URL: " + image+"-Retail price: " + retailPrice + "$"+"-The jewellery is composed of " + materials.size() + " materials: ";
    }






}
