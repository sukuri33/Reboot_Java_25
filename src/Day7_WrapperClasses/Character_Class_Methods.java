package Day7_WrapperClasses;

public class Character_Class_Methods {
    public static void main(String[] args) {

        char ch = '*';

        boolean isDigit =Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isDigit = " + isDigit);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isSpecialChar = " + isSpecialChar);

        //Given a string "hd31hjfg098" and you need to filter the digits within the string and return the sum of them.
        findSumInString("hd31hjfg098");
    }

    public static void findSumInString (String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
            {
                sum += Integer.parseInt(""+str.charAt(i));
            }
        }
        System.out.println("sum = " + sum);
    }
}
