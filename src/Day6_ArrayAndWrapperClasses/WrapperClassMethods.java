package Day6_ArrayAndWrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        //parse method: returns primitive type, converts String to primitive type
        String str = "10";
        int intNum = Integer.parseInt(str);
        System.out.println(intNum);

        //valueOf method: returns wrapper class objects. converts String to wrapper class type
        String numericStr = "123.12";
        Double number = Double.valueOf(numericStr);
        System.out.println(number +0.88);

        //More examples with different data types
        String trueOrFalse = "false";
        Boolean yesOrNo = Boolean.parseBoolean(trueOrFalse);
        System.out.println(yesOrNo);

    }
}
