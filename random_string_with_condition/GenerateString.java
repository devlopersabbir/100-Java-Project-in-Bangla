import java.util.Random;

class GenerateString {
    public static void main(String[] args){
        generator(10);
    }

    // generator method
    static void generator(int length){
        String numbers = "1234567890";
        String spacialChar = "~!@#$%^&*()_-+=\\|]}{[?/><";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // make a single string using concat
        String allCharacters = numbers + spacialChar + alphabet;


    }
}