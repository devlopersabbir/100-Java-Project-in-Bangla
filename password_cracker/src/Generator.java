import java.util.Random;
import java.util.HashSet;

public class Generator {
    private final boolean isNumber;
    private final boolean isSmAlpha;
    private final boolean isUpAlpha;
    private final boolean isSpacial;
    private final int passLength;

    // check with only unique string
    HashSet<String> generatedStrings = new HashSet<String>();

    Random random;
    StringBuilder stringBuilder;

    Generator(boolean isNumber, boolean isSmAlpha, boolean isUpAlpha, boolean isSpacial, int passLength){
        this.isNumber = isNumber;
        this.isSmAlpha = isSmAlpha;
        this.isUpAlpha = isUpAlpha;
        this.isSpacial = isSpacial;
        this.passLength = passLength;
    }
    public String generate(){
        // our generatedPassword
        String generated;
        // combine string
        String combineString = combine();
        random = new Random();
        stringBuilder = new StringBuilder();
        // generate random string
        do{
            for(int i = 0; i <= this.passLength; i++){
                int randomIndex = random.nextInt(combineString.length());
                char randomChar = combineString.charAt(randomIndex);
                stringBuilder.append(randomChar);
            }
            generated = stringBuilder.toString();
        }while(generatedStrings.contains(generated));
        generatedStrings.add(generated);

        return generated;
    }
    private String combine(){
        String numbers = "1234567890";
        String alphabet = "abcdefghijklmnopqurstuvwxyz";
        String spacial = "!@#$%^&*";

        String combineText;
        stringBuilder = new StringBuilder();

        stringBuilder.append(this.isNumber ? numbers : "");
        stringBuilder.append(this.isSmAlpha ? alphabet : "");
        stringBuilder.append(this.isUpAlpha ? alphabet.toUpperCase() : "");
        stringBuilder.append(this.isSpacial ? spacial : "");

        combineText = stringBuilder.toString().trim();
        return combineText;
    }
}
