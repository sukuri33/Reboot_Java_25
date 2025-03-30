package Day4_loops;

public class NestedLoop {
    public static void main(String[] args) {

        String str = "aabcccd";
        String uniqueChar = "";


        for (int i = 0; i < str.length(); i++) {
            int frequancy = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    frequancy++;
                }
            }
            if(frequancy == 1){
                uniqueChar += str.charAt(i);
            }
        }
        System.out.println(uniqueChar);

        char[] chars = str.toCharArray();
        String uniqueCharCollection = "";
        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]){
                    counter++;
                }
            }
            if (counter == 1){
                uniqueCharCollection += chars[i];
            }

        }
        System.out.println(uniqueCharCollection);

    }


}
