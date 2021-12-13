package sample;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {

    File in = new File("/home/www/Документи/fullstak/Java/oop лекції");

 //   File out = new File();

//    try {
//      FileServis.fileCopy(in, out);
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
    
    File folderIn = new File("/home/www/Документи/fullstak/Java/oop лекції");

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