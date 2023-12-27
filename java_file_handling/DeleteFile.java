import java.io.File;

class DeleteFile {
    public static void main(String[] args) {
        File file = new File("sabbir.txt");

        if(file.delete()){
            System.out.println(file.getName()+ " file is deleted successfully.");
        }else {
            System.out.println("Unexpected error found in deletion of the file.");
        }
    }
}