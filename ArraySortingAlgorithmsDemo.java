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
  private static int maxSizeOfArray = 5;

  public static void main (String[] args) {
    int i = 0;
    int maxNum = 10;
    Random random = new Random();

    ArraySortingAlgorithms ASA = new ArraySortingAlgorithms();

    // Node<Integer, String> newNode = new Node<Integer, String>(1, "Kason");

    // System.out.println(newNode.getIData());
    // System.out.println(newNode.getSData());

    // Node<Integer, String>[] nodeArray = new Node[maxSizeOfArray];
    Node<Integer, String>[] nodeArray = new Node[maxSizeOfArray];
    
    for (i = 0; i < maxSizeOfArray; i++) {
      // System.out.println(i + ": " + nodeArray[i]);
      nodeArray[i] = new Node<Integer, String>(i, "a");
      System.out.println(i + ": " + nodeArray[i].getNode().getIData());      
      System.out.println(i + ": " + nodeArray[i].getNode().getSData());      
    }

    System.exit(0);    
  }
}