public class Main {

    public static void main(String[] args) {
        char asciiChar = 'A';

        System.out.println("Character: " + asciiChar);

        int asciiCode = (int) asciiChar;
        System.out.println("Ascii Code: " + asciiCode);

        char koreanChar = '가';
        System.out.println("character: " + koreanChar);
        int unicodeCode = (int) koreanChar;
        System.out.println("Unicode Code: U+" + Integer.toHexString(unicodeCode)
                .toUpperCase());
    }
}