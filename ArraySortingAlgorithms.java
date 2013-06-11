/**
 * File: ArraySortingAlgorithms.java
 * Status: Not Completed
 * Created Date: June 04, 2013
 * Last Modified Date: June 10, 2013
 * Programmer: Ka-Son Chan
 * Description:
 */ 

public class ArraySortingAlgorithms {
  public void swap(int num1, int num2) {
    int temp = num1;
    num1 = num2;
    num2 = temp;
  }

  public void Swap(Node<Integer, String>[] nodeArray, int pos1, int pos2) {
    int temp = nodeArray[pos1].getIData();

    nodeArray[pos1].setIData(nodeArray[pos2].getIData());
    nodeArray[pos2].setIData(temp);
  }

  public void BubbleSort(Node<Integer, String>[] nodeArray, int arraySize, String order) {
    if (order.equalsIgnoreCase("ascend")) {
      for (int i = 0; i < arraySize - 1; i++) {
        for (int j = 0; j < arraySize - i - 1; j++) {
          if (nodeArray[j].getIData() > nodeArray[j + 1].getIData()) {
            Swap(nodeArray, j, j + 1);
          }
        }      
      }
    }
    else if (order.equalsIgnoreCase("descend")) {
      for (int i = 0; i < arraySize - 1; i++) {
        for (int j = 0; j < arraySize - i - 1; j++) {
          if (nodeArray[j].getIData() < nodeArray[j + 1].getIData()) {
            Swap(nodeArray, j, j + 1);
          }
        }      
      }
    }
  }
}