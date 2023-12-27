import java.io.File;

class FileInfo {
    public static void main(String[] args) {
        // Creating file object
        File file = new File("sabbir.txt");
        if (file.exists()) {
            // Getting file name
            System.out.println("The name of the file is: " + file.getName());

            // Getting path of the file
            System.out.println("The absolute path of the file is: " + file.getAbsolutePath());

            // Checking whether the file is writable or not
            System.out.println("Is file writeable?: " + file.canWrite());

            // Checking whether the file is readable or not
            System.out.println("Is file readable " + file.canRead());

            // Getting the length of the file in bytes
            System.out.println("The size of the file in bytes is: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}