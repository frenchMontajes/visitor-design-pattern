public class FurnitureDetail implements Furniture {
    private String furnitureName;
    private String type;
    private Integer weight;

    public FurnitureDetail(String furnitureName, String type, Integer weight) {
        this.furnitureName = furnitureName;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String accept(FurnitureType furniture, String type) {
        this.type = type;
        return furniture.getType(type);
    }

    @Override
    public String accept(ShippingCost cost, String type, Integer weight) {
        return cost.calculate(type, weight).toString();
    }


    public String getFurnitureName() {
        return furnitureName;
    }

    public void setFurnitureName(String furnitureName) {
        this.furnitureName = furnitureName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
