import java.util.LinkedList;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class CourseDBManager implements CourseDBManagerInterface {
  int size;
  private CourseDBStructure db;
  CourseDBManager(){
    size = 50;
    db = new CourseDBStructure(size);
  }
  /**
	 * add adds the elements to the list
   * @param id, crn, credits, roomNum, instructor
	 * @return ret
	 */
  public void add(String id, int crn, int credits, String roomNum, String instructor) {
    CourseDBElement el = new CourseDBElement(id, crn, credits, roomNum, instructor);
    db.add(el);
  }
  public CourseDBElement get(int crn) {
    // CourseDBElement el = new CourseDBElement();
    CourseDBElement ret = null;
    try {
     ret = db.get(crn);
    }
    catch(Exception e) {
    
    }
    return ret;
  }
  /**
	 * readFile reads the file
	 * @param input
	 */
  public void readFile(File input) throws FileNotFoundException {
    try {
      Scanner reader = new Scanner(input);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        String[] fields = data.split(" ");
        String COURSE_ID = fields[0];
        int CRN = Integer.parseInt( fields[1]);
        int NUM_OF_CREDITS = Integer.parseInt(fields[2]);
        String ROOM_NUMBER = fields[3];
        String INSTRUCTOR = fields[4];
        add(COURSE_ID, CRN, NUM_OF_CREDITS, ROOM_NUMBER, INSTRUCTOR);
      }
    }
    catch (FileNotFoundException e) {
      throw new FileNotFoundException("File was not found");
    }
  }
  /**
	 * showAll shows the list
	 * @return ret
	 */
  public ArrayList<String> showAll() {
    ArrayList<String> ret = new ArrayList<String>();
    
    for(int i = 0; i < db.getTableSize(); i++) {
      try {
        
        LinkedList<CourseDBElement> ll = db.hashTable.get(i);
        for (CourseDBElement el : ll) {
          
          String line = "\n";
          line += "Course:" + el.getCOURSE_ID() + " ";
          line += "CRN:" + Integer.toString(el.getCRN()) + " ";
          line += "Credits:" + Integer.toString(el.getNUM_OF_CREDITS()) + " ";
          line += "Instructor:" + el.getINSTRUCTOR() + " ";
          line += "Room:" + el.getROOM_NUMBER();
          ret.add(line);
          System.out.println(line);
        }
      }
      catch(Exception e) {
      
      }
      
    }    
    return ret;
  }
}