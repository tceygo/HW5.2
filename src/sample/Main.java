package sample;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {


    
    File folderIn = new File("/home/Документи");

    File folderOut = new File("AAAA");
    folderOut.mkdirs();

    try {
      FileServis.folderCopy(folderIn, folderOut, "docx");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
 
}