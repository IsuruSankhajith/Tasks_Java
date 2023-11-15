/**
 * Class that does File IO for Myfriends
 
 *
 */
import java.io.*;
import java.util.*;

public class FileIO
{
  /* write list to file */
  public void writeFile(String pathName,String fileName,AllMyfriends contacts) {
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter(pathName + "/" + fileName));
      out.write(contacts.toString());
      out.close();
    } 
    catch (Exception e) {
      System.err.println("FileNotFoundException: " + e.getMessage());
    } 

    /* Assumes contacts (of type AllMyfriends) has been created */
  }

  /* read a list from a file */
  public void readFile(String pathName,String fileName,AllMyfriends contacts) {
    String line;
    try {
      BufferedReader in = new BufferedReader(new FileReader(pathName + "/" + fileName));
      while ((line = in.readLine()) != null) {
	// process the line - assume 3 strings separated by 2 blanks
	// The first blank is at pt1
	// The second blank is at pt2
	int pt1=line.indexOf(" ");
	int pt2=line.lastIndexOf(" ");
	contacts.add(line.substring(0,pt1-1),line.substring(pt1+1,pt2-1),line.substring(pt2+1));
	in.close();
      }
    }
    catch (Exception e) {
      System.err.println("File opening problems");
    }
  }
}
