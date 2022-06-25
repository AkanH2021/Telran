public class Homework {

    public static void main(String[] args) {
//Практические задачи: какова временная сложность?
    }

    //1.
    void test1(int n) {
        if (n == 1)    //best O(1)
            return;   //O(1)
        for (int i = 1; i <= n; i++)   // O(n)
            for (int j = 1; j <= n; j++)  // O(n)    - two loops means bigO complexity as O(n^2)
                System.out.println("*"); //О(1)
        break; //O(1)
    }  // Total: 1 + 1 + O(n^2) + 1 + 1= do not take into account 1, so result is:  O(n^2)

    //2.
    void test2(int n) {
        int a = 0;   //O(1)
        for (i = 0; i < n; i++) O(n) // O(n)
        for (j = n; j > i; j--) // O(n)    - two loops means bigO complexity as O(n^2)
            a = a + i + j; //O(3)
    }   // Total: 1 + O(n^2) + 3= do not take into account 1 and 3, so result is:  O(n^2)

    //3.
    void test3(int n) {
        int i, j, a = 0; //O(3)
        for (i = n / 2; i <= n; i++)  // O(n/2)
            for (j = 2; j <= n; j = j * 2)   // O(n)    - two loops means bigO complexity as O(n^2)
                a = a + n / 2; //O(3)
        // Total: 3 + O((n/2)*n) + 3= do not take into account 3, so result is:  O((n/2)*n) -> O(n^2) as complexity;
    }

    //4 *.
    void test4(int n) {
        int a = 0, i = n; //O(2)
        while (i > 0) { // O(n log n)
            a += i; //O(2)
            i /= 2;  //O(2)
        }
    }//Total: 2 + O(n log n) + 2 + 2= do not take into account 23, so result is:  O(n log n);

}
