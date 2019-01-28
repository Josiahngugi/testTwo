import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String [] args){

        List collection = new ArrayList();
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the of number items you want to insert");
        int item= input.nextInt();

//        inserting items into collection
        for(int i=0;i<item;i++){
            Scanner obj= new Scanner(System.in);
            System.out.println("item"+i);
            int x=obj.nextInt();
            collection.add(x);
        }

        // Binary search from collection.
        Scanner key= new Scanner(System.in);
        System.out.println("please enter the key to search from this collection"+collection);
        int  ke=key.nextInt();

        if(collection.contains(ke)) {
            int index = Collections.binarySearch(collection, ke);
            System.out.println(index);
        }
        else {
            System.out.println("-1");
        }
    }
}
