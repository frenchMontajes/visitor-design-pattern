import java.util.HashMap;
import java.util.Map;

public class ShippingCost implements ShippingCostInterface{
    FurnitureType type;

    private final Map<String, Integer> furnitureCost = new HashMap<>();
    {
        furnitureCost.put("Chair",50);
        furnitureCost.put("Sofa",150);
        furnitureCost.put("Table",100);
    }

    @Override
    public Integer calculate(String type, Integer weight) {
        Integer ratePerWeight = 100;
        return (ratePerWeight * weight) + furnitureCost.get(type);
    }
}