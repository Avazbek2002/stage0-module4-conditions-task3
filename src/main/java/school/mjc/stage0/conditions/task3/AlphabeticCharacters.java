package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'A' || character == 'a' || character == 'E' || character == 'e' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U' || character == 'y' || character == 'Y')
            System.out.println("Vowel");
        else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
            System.out.println("Consonant");
        else
            System.out.println("wrong alphabet!");
    }
}
