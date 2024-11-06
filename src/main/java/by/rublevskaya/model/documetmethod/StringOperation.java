package main.java.by.rublevskaya.model.documetmethod;

//"2525-Kat-1111-Abc-2A0B"
public class StringOperation {

    public static void printTwoBlock(String documentNumber){
        String[] twoBlock = documentNumber.split("-");
        System.out.println(twoBlock[0] + " " + twoBlock[2]);
    }

    public static void printMaskLetters(String documentNumber){
        String maskedNumber = documentNumber.substring(0,5) + "***" + documentNumber.substring(8, 14) + "***" + documentNumber.substring(17, 22);
        System.out.println(maskedNumber);
    }

    public static void updatedPrintMaskLetters(String documentNumber){
        String updatedMaskedNumber = documentNumber.replaceAll("[a-zA-Z]{3}", "***");//нашла на просторах класса красивый метод replace
        System.out.println(updatedMaskedNumber);
    }

    public static void printLetters(String documentNumber){
        String letters = documentNumber.substring(5, 8).toLowerCase() +
                             documentNumber.substring(14, 17).toLowerCase() +
                             documentNumber.substring(19, 20).toLowerCase() +
                             documentNumber.substring(21, 22).toLowerCase();

        System.out.println( letters.substring(0, 3) + "/" +
                            letters.substring(3, 6) + "/" +
                            letters.charAt(6) + "/" +
                            letters.charAt(7));
    }

    public static void printLettersPrefix (String documentNumber){
        String[] array = documentNumber.split("-");
        StringBuilder stringBuilder = new StringBuilder("Letters:");
        stringBuilder.append(array[1].toUpperCase());
        stringBuilder.append("/");
        stringBuilder.append(array[3].toUpperCase());
        stringBuilder.append("/");
        stringBuilder.append(array[4].toUpperCase().charAt(1));
        stringBuilder.append("/");
        stringBuilder.append(array[4].toUpperCase().charAt(3));

        System.out.println(stringBuilder);
    }

    public static void checkABCSubsequence(String documentNumber, String sequence) {
        if (documentNumber.toLowerCase().contains(sequence.toLowerCase())) {
            System.out.println("the document contains a sequence \"" + sequence + "\"");
        } else {
            System.out.println("the document does not contain a sequence \"" + sequence + "\"");
        }
    }

    public static void checkStartSubsequence(String documentNumber, String sequence) {
        if (documentNumber.startsWith(sequence)) {
            System.out.println("the document begins with a sequence \"" + sequence + "\"");
        } else {
            System.out.println("the document does not start with a sequence \"" + sequence + "\"");
        }
    }

    public static void checkEndsSubsequence(String documentNumber, String sequence) {
        if (documentNumber.endsWith(sequence)) {
            System.out.println("the document ends with the sequence \"" + sequence + "\"");
        } else {
            System.out.println("the document does not end with a sequence\"" + sequence + "\"");
        }
    }
}
