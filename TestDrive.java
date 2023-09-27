
public class TestDrive {

    public static void main(String[] args){

       //Create factories for products.
       GroceryProductFactory bananasFactory=new BananasFactory();
       GroceryProductFactory applesFactory=new AppleFactory();

       // Create the actual products.
       GroceryProduct banana= bananasFactory.createProduct();
       GroceryProduct apple=applesFactory.createProduct();




       banana.setPrice(DataReader.getPrice("Banana"));
       apple.setPrice(DataReader.getPrice("Apple"));



       }


    }

