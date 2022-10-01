public class Task3 {
    /* NOT READY!! Implement the method that takes two Strings and return the String that contain chars from
    the first string mixed through one with chars from other String
“abcd”, “qwer” -> “aqbwcedr”
“ab”, “qwer” -> “aqbwer”
“abcd”, “qw” -> “aqbwcd”   */
    public static void main(String[] args) {
        System.out.println(mixedStringReturn("abcd", "qwer"));
        System.out.println(mixedStringReturn("ab", "qwer"));
        System.out.println(mixedStringReturn("abcd", "qw"));
    }


    public static String mixedStringReturn(String str1, String str2) {
        String res = "";
        for (int i = 0; i < str1.length(); i++) {
            res = String.valueOf(str1.charAt(i));
            res.concat(String.valueOf(str1.charAt(i)));
            }
        return res;
        }
    }





    /*
    public static String mixedStringReturn(String str1, String str2) {
        int i = 0;
        String result = "";
        while (i < str1.length() && i < str2.length()) {
            result = result + str1.charAt(i) + str2.charAt(i);
            i++;
        }
        return result + str1.substring(i) + str2.substring(i);
    }
    */








