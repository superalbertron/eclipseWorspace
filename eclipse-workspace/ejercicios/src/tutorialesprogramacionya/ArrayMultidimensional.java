package tutorialesprogramacionya;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        ArrayList<String>[][] arraylist1 = new ArrayList[3][3];
        arraylist1[0][0] = new ArrayList<String>();
      
        arraylist1[0][0].add("String One");
        arraylist1[0][0].add("String Two");
        arraylist1[0][0].add("String Three");

        arraylist1[0][1] = new ArrayList<String>();
        arraylist1[0][1].add("String One");
        arraylist1[0][1].add("String Two");
        arraylist1[0][1].add("String Three");

        arraylist1[0][2] = new ArrayList<String >();
        arraylist1[0][2].add("String One");
        arraylist1[0][2].add("String Two");
        arraylist1[0][2].add("String Three");

        System.out.println(Arrays.deepToString(arraylist1));

    }
}