public class BananasFactory implements GroceryProductFactory{

    @Override
    public GroceryProduct createProduct() {

        return new Bananas();
    }
}
