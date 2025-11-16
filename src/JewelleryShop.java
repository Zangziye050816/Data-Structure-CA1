import object.DisplayCase;
import ulitiy.Hash;

public class JewelleryShop {
    private final Hash<Integer, DisplayCase> JewelleryTable;

    public JewelleryShop() {
        JewelleryTable = new Hash<>();
    }

    public void addDisplayCase(DisplayCase newDisplayCase) {
        if (JewelleryTable.containsKey(newDisplayCase.getIdentifier().hashCode())){
            System.out.println("The id already exists.");
        }else {
            JewelleryTable.put(newDisplayCase.getIdentifier().hashCode(), newDisplayCase);
        }
    }

    public void removeDisplayCase(String id){
        if (!JewelleryTable.containsKey(id.hashCode())){
            System.out.println("The id already exists.");
        }else {
            JewelleryTable.remove(id.hashCode());
        }
    }

    public DisplayCase getDisplayCase(String id) {
        return JewelleryTable.get(id.hashCode());
    }
}
