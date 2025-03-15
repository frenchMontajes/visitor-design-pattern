public class ShippingApp {
    public static void main(String[] args) {
        FurnitureDetail chair = new FurnitureDetail("Chair", "Lightweight", 50);
        FurnitureDetail sofa = new FurnitureDetail("Sofa", "Bulky", 150);
        FurnitureDetail table = new FurnitureDetail("Table", "Heavyweight", 100);
        FurnitureType furnitureType = new FurnitureType();
        ShippingCost shippingCost = new ShippingCost();

        System.out.println("Furniture: " + chair.getFurnitureName() + " is a " + chair.accept(furnitureType, chair.getFurnitureName()));
        System.out.println(chair.getFurnitureName() + " Shipping cost: " +
                chair.accept(shippingCost, chair.getFurnitureName(), chair.getWeight()) + "\n");

        System.out.println("Furniture: " + sofa.getFurnitureName() + " is a " + sofa.accept(furnitureType, sofa.getFurnitureName()));
        System.out.println(sofa.getFurnitureName() + " Shipping cost: " +
                sofa.accept(shippingCost, sofa.getFurnitureName(), sofa.getWeight()) + "\n");

        System.out.println("Furniture: " + table.getFurnitureName() + " is a " + table.accept(furnitureType, table.getFurnitureName()));
        System.out.println(table.getFurnitureName() + " Shipping cost: " +
                table.accept(shippingCost, table.getFurnitureName(), table.getWeight()) + "\n");
    }
}