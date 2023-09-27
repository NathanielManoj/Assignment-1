public class Bananas implements GroceryProduct{

    private double price;

    @Override
    public void setPrice(double price) {
        this.price=price;
        System.out.print("Banana has been created, sale for: $");
        System.out.printf("%.2f",price);

        System.out.println();
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}


