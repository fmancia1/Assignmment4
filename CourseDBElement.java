/**
* This is the BasicDoubleLinkedList<T> class
*
*
* @author Fatima Mancia
*
*/
public class CourseDBElement implements Comparable<CourseDBElement> {
  private String COURSE_ID;
  private int CRN;
  private int NUM_OF_CREDITS;
  private String ROOM_NUMBER;
  private String INSTRUCTOR;
  CourseDBElement() {
    COURSE_ID = null;
    CRN = 0;
    NUM_OF_CREDITS = 0;
    ROOM_NUMBER = null;
    INSTRUCTOR = null;
  }
  CourseDBElement(String COURSE_ID_, int CRN_, int NUM_OF_CREDITS_, String ROOM_NUMBER_, String INSTRUCTOR_) {
    COURSE_ID = COURSE_ID_;
    CRN = CRN_;
    NUM_OF_CREDITS = NUM_OF_CREDITS_;
    ROOM_NUMBER = ROOM_NUMBER_;
    INSTRUCTOR = INSTRUCTOR_;
  }
  /**
	 * getCOURSE_ID gets the course ID
	 * @return the course ID
	 */
  public String getCOURSE_ID() {
    return COURSE_ID;
  }
  /**
	 * setCourse_ID sets the course ID
	 * @param COURSE_ID
	 */
  public void setCOURSE_ID(String COURSE_ID) {
    this.COURSE_ID = COURSE_ID;
  }
  /**
	 * getCRN gets the CRN
	 * @return the CRN
	 */
  public int getCRN(){
    return CRN;
  }
  /**
	 * setCRN sets the CRN
	 * @param CRN
	 */
  public void setCRN(int CRN) {
    this.CRN = CRN;
  }
  /**
	 * getNUM_OF_CREDITS gets the number of credits
	 * @return the number of credits
	 */
  public int getNUM_OF_CREDITS() { 
    return NUM_OF_CREDITS;
  }
  /**
	 * setNUM_OF_CREDITS sets the number of credits
	 * 
	 */
  public void setNUM_OF_CREDITS() {
    this.NUM_OF_CREDITS = NUM_OF_CREDITS;
  }
  /**
	 * getROOM_NUMBER gets the room number
	 * @return the room number
	 */
  public String getROOM_NUMBER() {
    return ROOM_NUMBER;
  }
  /**
	 * setROOM_NUMBER sets the ROOM_NUMBER
	 * 
	 */
  public void setROOM_NUMBER() {
    this.ROOM_NUMBER = ROOM_NUMBER;
  }
  /**
	 * getINSTRUCTOR gets the instructor's name
	 * @return the instructor's name
	 */
  public String getINSTRUCTOR() {
    return INSTRUCTOR;
  }
  /**
	 * setINSTRUCTOR sets the instructor's name
	 * 
	 */
  public void setINSTRUCTOR() {
    this.INSTRUCTOR = INSTRUCTOR;
  }
  /**
	 * hashCode HashTable
	 * @return CRN
	 */
  public int hashCode() {
    // int hash_size = 50;
    /*
    int accum = 0;
    for (int i = 0; i < COURSE_ID.length(); i++) {
      char ascii = COURSE_ID.charAt(i);
      accum += (int) ascii; 
    } */
    return CRN;
  }
  /**
	 * compareTo compares the object with the Course_ID
   * @param obj
	 * @return the comparison
	 */
  public int compareTo(CourseDBElement obj) {
    return obj.COURSE_ID.compareTo(COURSE_ID);
  }
}