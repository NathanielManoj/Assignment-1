
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class DataReader {

public static float getPrice( String name){



    ArrayList<String> lineReader= new ArrayList();

    try  {

        File object = new File("C:\\Users\\hermo\\IdeaProjects\\Software Architecture and Designing Assignment 1\\src\\NameAndPrice");
;
        Scanner reader = new Scanner(object);

        while (reader.hasNextLine()){
            String data = reader.nextLine();
            lineReader.add(data);

        }


        reader.close();

    } catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }

    for (int i = 0; i<lineReader.size();i++){
        String[] parts = lineReader.get(i).split(" ");
        String productName = parts[0];
        double productValue = (double) Float.parseFloat((parts[1]));


        if (name.equals(productName)){

           return (float) productValue;
        }


    }
    return 0.0f;
}





}
