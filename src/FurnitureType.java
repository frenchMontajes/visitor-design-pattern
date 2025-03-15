import java.util.HashMap;
import java.util.Map;

public class FurnitureType implements FurnitureInterface {
    private static Map<String, String> furnitureTypes = new HashMap<>();

    static {
        furnitureTypes.put("Chair", "Lightweight");
        furnitureTypes.put("Sofa", "Bulky");
        furnitureTypes.put("Table", "Heavyweight");
    }

    @Override
    public String getType(String type) {
        return furnitureTypes.get(type);
    }
}
