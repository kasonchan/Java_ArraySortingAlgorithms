/**
 * File: ArraySortingAlgorithmsDemo.java
 * Status: Not Completed
 * Created Date: June 04, 2013
 * Last Modified Date: June 10, 2013
 * Programmer: Ka-Son Chan
 * Description:
 */ 

import java.util.Random;
import java.util.Arrays;

@SuppressWarnings({"unchecked"})
public class ArraySortingAlgorithmsDemo {
  private static int arraySize = 10;

  public static void main (String[] args) {
    int i = 0;
    int maxNum = 10;
    Random random = new Random();

    ArraySortingAlgorithms ASA = new ArraySortingAlgorithms();

    Node<Integer, String>[] nodeArray = new Node[arraySize];
    
    for (i = 0; i < arraySize; i++) {
      nodeArray[i] = new Node<Integer, String>();
      nodeArray[i].setIData(random.nextInt(maxNum)); // Generate random integer
      nodeArray[i].setSData((String)(random.nextInt(26) + "a")); // Generate random string            
      System.out.print("(" + nodeArray[i].getIData() + ", " + nodeArray[i].getSData() + ")");      
    }
    System.out.println();

    ASA.BubbleSort(nodeArray, arraySize, "ascend", "iData");

    for (i = 0; i < arraySize; i++) {
      System.out.print("(" + nodeArray[i].getIData() + ", " + nodeArray[i].getSData() + ")");      
    }
    System.out.println();

    ASA.BubbleSort(nodeArray, arraySize, "descend", "iData");

    for (i = 0; i < arraySize; i++) {
      System.out.print("(" + nodeArray[i].getIData() + ", " + nodeArray[i].getSData() + ")");      
    }
    System.out.println();

    ASA.BubbleSort(nodeArray, arraySize, "ascend", "sData");

    for (i = 0; i < arraySize; i++) {
      System.out.print("(" + nodeArray[i].getIData() + ", " + nodeArray[i].getSData() + ")");      
    }
    System.out.println();

    ASA.BubbleSort(nodeArray, arraySize, "descend", "sData");

    for (i = 0; i < arraySize; i++) {
      System.out.print("(" + nodeArray[i].getIData() + ", " + nodeArray[i].getSData() + ")");      
    }
    System.out.println();

    System.exit(0);    
  }
}