package task2;

public class Main {
    //"Linux", "Windows", "Mac" - даны такие слова
//Объединение нескольких строк в одну
    public static void main(String[] args) {
        String str1 = "Linux";
        String str2 = "Windows";
        String str3 = "Mac";

        String[] arr = {str1, str2, str3};

        System.out.println(task2(arr));
    }

    public static String task2(String[] arr) {
        return String.join("", arr);
    }
}

