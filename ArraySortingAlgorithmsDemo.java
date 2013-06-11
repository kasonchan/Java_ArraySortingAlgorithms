/**
 * File: ArraySortingAlgorithmDemo.java
 * Status: Not Completed
 * Created Date: June 04, 2013
 * Last Modified Date: June 10, 2013
 * Programmer: Ka-Son Chan
 * Description:
 */ 

import java.util.Random;
import java.util.Arrays;

public class ArraySortingAlgorithmDemo {
  public static int maxSizeOfArray = 10;
  
  public static void main (String[] args) {
    int i = 0;
    int maxNum = 10;
    int[] iArray = new int[maxNum];
    Random random = new Random();

    ArraySortingAlgorithm ASA = new ArraySortingAlgorithm();

    for (i = 0; i < maxSizeOfArray; i++) {
      iArray[i] =  random.nextInt(maxNum);
    }

    for (i = 0; i < maxSizeOfArray; i++) {
      System.out.print(iArray[i]);
      System.out.print(" ");
    }

    System.out.println();
    
    // ASA.swap(iArray[0], iArray[1]);
    Arrays.sort(iArray);


    for (i = 0; i < maxSizeOfArray; i++) {
      System.out.print(iArray[i]);
      System.out.print(" ");
    }

    System.out.println();

    System.exit(0);    
  }
}