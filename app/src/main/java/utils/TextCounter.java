package utils;

public class TextCounter {
    public static String getCharsCount(String input) {
        return String.valueOf(input.length());
    }
    public static String getWordsCount(String input){
        int wordCont = 0;

        int i = 0;
        char[] imputArray = input.toCharArray();
        boolean end = false;
        while (i < imputArray.length && !end) {

            /** ORIGINAL CODE
//            if (i < imputArray.length){
//                while (!end && imputArray[i] == ' ' || imputArray[i] == '.'
//                                        || imputArray[i] == ',') {
//                    if (i < imputArray.length-1)
//                        i++;
//                    else end=true;
//                }
//            }
             */
            if (i < imputArray.length){
                while (!end && !Character.isLetter(imputArray[i])) {
                    if (i < imputArray.length-1)
                        i++;
                    else end=true;
                }
            }

            /** ORIGINAL CODE
            if (i < imputArray.length && imputArray[i] != ' ' && imputArray[i] != '.'
                    && imputArray[i] != ',') {
                wordCont++;
            }
             */
            if (i < imputArray.length && Character.isLetter(imputArray[i])) {
                wordCont++;
            }

            /** ORIGINAL CODE
            if (i < imputArray.length) {
                while (!end && imputArray[i] != ' ' && imputArray[i] != '.'
                        && imputArray[i] != ',') {
                    if (i < imputArray.length-1)
                        i++;
                    else end=true;
                }
            }
             */
            if (i < imputArray.length) {
                while (!end && Character.isLetter(imputArray[i])) {
                    if (i < imputArray.length-1)
                        i++;
                    else end=true;
                }
            }
        }


        return String.valueOf(wordCont);
    }
}