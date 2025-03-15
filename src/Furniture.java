public interface Furniture {
     String accept(FurnitureType furniture, String type);
     String accept(ShippingCost cost, String type, Integer weight);
}
