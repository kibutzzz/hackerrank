package challenges.problemsolving;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        s = s.replaceAll(" ", "");
        int numberOfRows = (int) Math.floor(Math.sqrt(s.length()));
        int numberOfColumns = (int) Math.ceil(Math.sqrt(s.length()));

        if(numberOfColumns * numberOfRows < s.length()) {
            numberOfRows ++;
        }
        char encryptionTable[][] = new char[numberOfRows][numberOfColumns];
        int charPosition = 0;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (charPosition < s.length()) {
                    encryptionTable[i][j] = s.charAt(charPosition++);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < numberOfColumns; j++) {
            for (int i = 0; i < numberOfRows; i++) {
                if (encryptionTable[i][j] != 0) {
                    result.append(encryptionTable[i][j]);
                }
                if (i == numberOfRows - 1) {
                    result.append(" ");
                }
            }

        }
        result.reverse().delete(0, 1).reverse();

        return result.toString();
    }


}
