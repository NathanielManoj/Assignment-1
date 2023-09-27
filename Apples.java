

public class Apples implements GroceryProduct{

    private double price;

    @Override
    public void setPrice(double price) {

        this.price=price;
        System.out.print("Apple has been created, sale for: $");
        System.out.printf("%.2f",price);
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
