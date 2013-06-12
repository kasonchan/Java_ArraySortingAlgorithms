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
    Node<Integer, String> tempNode = nodeArray[pos1].getNode();

    nodeArray[pos1] = nodeArray[pos2];
    nodeArray[pos2] = tempNode;
  }

  public void BubbleSort(Node<Integer, String>[] nodeArray, int arraySize, String order, String data) {
    /**
     * Sorts in ascending order
     */
    if (order.equalsIgnoreCase("ascend")) {
      if (data.equalsIgnoreCase("iData")) {
        for (int i = 0; i < arraySize - 1; i++) {
          for (int j = 0; j < arraySize - i - 1; j++) {
            if (nodeArray[j].getIData() > nodeArray[j + 1].getIData()) {
              Swap(nodeArray, j, j + 1);
            }
          }      
        }        
      }
      else if (data.equalsIgnoreCase("sData")) {
        for (int i = 0; i < arraySize - 1; i++) {
          for (int j = 0; j < arraySize - i - 1; j++) {
            if (nodeArray[j].getSData().compareToIgnoreCase(nodeArray[j + 1].getSData()) > 0) {
              Swap(nodeArray, j, j + 1);
            }
          }      
        }                
      }    
    }

    /**
     * Sorts in descending order
     */
    else if (order.equalsIgnoreCase("descend")) {
      if (data.equalsIgnoreCase("iData")) {
        for (int i = 0; i < arraySize - 1; i++) {
          for (int j = 0; j < arraySize - i - 1; j++) {
            if (nodeArray[j].getIData() < nodeArray[j + 1].getIData()) {
              Swap(nodeArray, j, j + 1);
            }
          }      
        }        
      }
      else if (data.equalsIgnoreCase("sData")) {
        for (int i = 0; i < arraySize - 1; i++) {
          for (int j = 0; j < arraySize - i - 1; j++) {
            if (nodeArray[j].getSData().compareToIgnoreCase(nodeArray[j + 1].getSData()) < 0) {
              Swap(nodeArray, j, j + 1);
            }
          }      
        }                
      }    
    }
  }
}