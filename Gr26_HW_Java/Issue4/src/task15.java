public class task15 {
    /*Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
который вместо заданной строки с номером счета (например ”DE5128279087265”)
возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
засекреченных цифр) */
    public static void main(String[] args) {
        System.out.println(asterisk("DE5128279087265", 4));
        System.out.println(securedIBAN("DE5128279087265"));
    }

    public static String asterisk(String str1, int start) {
        char ast = '*';
        int astLenght = (str1.length() - 2) - start;
        StringBuilder sb = new StringBuilder(astLenght);
        for (int i = 0; i < astLenght; i++) {
            sb.append(ast);
        }
        return str1.substring(0, start) + sb.toString() + str1.substring(start + astLenght);
    }

    //*********variant form teacher
    public static String securedIBAN(String iban) {
        String result = "";

        for (int i = 0; i < iban.length(); i++) {
            //        result += (i < 4 || i > iban.length() - 3)? iban.charAt(i):'*';  //with ternary operator
            if (i < 4 || i > iban.length() - 3) {
                result += iban.charAt(i);
            } else {
                result += '*';
            }
        }
        return result;
    }
}

