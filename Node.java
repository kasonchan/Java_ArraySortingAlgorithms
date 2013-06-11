/**
 * File: Node.java
 * Status: Not Completed
 * Created Date: June 10, 2013
 * Last Modified Date: June 10, 2013
 * Programmer: Ka-Son Chan
 * Description:
 */ 

public class Node<I, S> {
  private I iData;
  private S sData;

  public Node() {
    iData = null;
    sData = null;    
  }

  public Node(final I newIData, final S newSData) {
    iData = newIData;
    sData = newSData;
  }

  public void setIData(final I newIData) {
    iData = newIData;
  }

  public void setSData(final S newSData) {
    sData = newSData;
  }

  public I getIData() {
    return this.iData;
  }

  public S getSData() {
    return this.sData;
  }

}