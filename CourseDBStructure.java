import java.util.LinkedList;
import java.io.IOException;

public class CourseDBStructure implements CourseDBStructureInterface {
  private int size;
  LinkedList<LinkedList<CourseDBElement>> hashTable;
  CourseDBStructure(int size) {
    this.size = size;
    hashTable = new LinkedList<LinkedList<CourseDBElement>>();
    for (int i = 0; i < size; i++) {
      hashTable.add(i, new LinkedList<CourseDBElement>());
    }
  }
  CourseDBStructure(String label, int size) {
    this.size = size;
    hashTable = new LinkedList<LinkedList<CourseDBElement>>();
    for (int i = 0; i < size; i++) {
      hashTable.add(i, new LinkedList<CourseDBElement>());
    }
  }
  /**
	 * add adds the elements to the list
	 * @param element
	 */
  public void add(CourseDBElement element) {
    int i = element.getCRN() % size;
    hashTable.get(i).add(element);
  }
  /**
	 * get gets the crn
   * @param crn
	 * @return h
	 */
  public CourseDBElement get(int crn) throws IOException {
    CourseDBElement ret = null;
    int i = crn % size;
    if (hashTable.get(i) == null) {
      throw new IOException("The hashtable is empty"); 
    }
    for (CourseDBElement h : hashTable.get(i)) {
      if (h.getCRN() == crn) {
        return h;
      }
    }
    throw new IOException("Those not exist in hashtable");
    // return null;
  }
  public int getTableSize() {
    return size;
  }
}