import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class ReadFromFile {
    public static void main(String[] args) {
        try{
            File readFile = new File("sabbir.txt");
            Scanner renderData = new Scanner(readFile);

            while(renderData.hasNextLine()){
                String fileData = renderData.nextLine();
                System.out.println(fileData);
            }
            renderData.close();

        }catch(FileNotFoundException exception) {
            System.out.println("Something went wrong!");
            exception.printStackTrace();
        }
    }
}