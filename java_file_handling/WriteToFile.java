import java.io.FileWriter;
import java.io.IOException;

class WriteToFile {
   public static void main(String[] args) {
       try {
           FileWriter fileWriter = new FileWriter("sabbir.txt");
           // writing the content into the sabbir.txt file
           fileWriter.write("Hello Sabbir, How are you?");
           fileWriter.write("Hello Sabbir, How are you? \nI'm here to help you. Sabbir");

           // close the stream
           fileWriter.close();
           System.out.println("Content is successfully wrote to the file.");
       }catch(IOException exception){
           System.out.println("Something went wrong!");
           exception.printStackTrace();
       }
   }
}