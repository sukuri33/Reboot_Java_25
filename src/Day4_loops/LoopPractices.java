package Day4_loops;

public class LoopPractices {

    public static void main(String[] args) {

//        System.out.println(isPalindrome("A man, a plan, 1 a canal: Panama"));
//        System.out.println(reverseThis(123));
//        System.out.println(reverseThis("Abcd123? "));
        System.out.println(removeDuplicatedLetter("aabbbbcc"));
//        System.out.println(removeDuplicates("aaabbccc"));

//        int[] numbers = {1,2,10,99};
//        int max = numbers[0];
//        for(int i=0; i<numbers.length; i++){
//            if(max < numbers[i]){
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);



    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;

            // Check if currentChar already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // Append character only if it's not a duplicate
            if (!isDuplicate) {
                result += currentChar;
            }
        }

        return result;
    }



    private static String removeDuplicatedLetter(String str) {
        String collectUniqueLetters = "";
        for (int i = 0; i < str.length(); i++) {

            if (!collectUniqueLetters.contains(str.charAt(i) + "")) {
                collectUniqueLetters += str.charAt(i);
            }

//            if (collectUniqueLetters.contains(str.charAt(i) + "")) {
//                continue;//continue; statement being used approach
//            }
//            collectUniqueLetters += str.charAt(i);
        }
        return collectUniqueLetters;
    }

    private static int reverseThis(int iNum) {
        /* Logic behind reversing integer input
        int iNum = 5784283;
        System.out.println(i%10);
        System.out.println(0*10+(i%10));
        System.out.println(i = i/10);
        * */
        int iNumReversed = 0;
        while (iNum != 0) {
            int lastDigit = iNum % 10;
            iNumReversed = iNumReversed * 10 + lastDigit;
            iNum /= 10;
        }
        return iNumReversed;
    }

    //Method overloading example
    private static String reverseThis(String str) {
        return new StringBuilder(str.replaceAll("[^A-Za-z]", "")).reverse().toString();
    }

    //  Used StringBuilder to achieve the same result
/*    private static boolean isPalindrome(String str) {
        String temp = reverseThis(str);
        System.out.println(temp);
        return (temp.equalsIgnoreCase(str.replaceAll("[^A-Za-z]","")))?true:false;
    }*/
    private static boolean isPalindrome(String str) {
        str = str.replaceAll("[^A-Za-z]", "");
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        return (temp.equalsIgnoreCase(str)) ? true : false;
    }

}





