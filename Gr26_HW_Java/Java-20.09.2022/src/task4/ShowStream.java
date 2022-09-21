package task4;

import java.util.stream.Stream;

//4. Почему код не отработает?
public class ShowStream {
    public static void main(String[] args) {
        Stream str1 = Stream.of(1, 23, 24, 45, 2, 4, 4, 6, 77);
        System.out.println(str1.count());     //.count() is a terminal operation, can be invoked only once for a given stream
        System.out.println(str1.distinct().count());   //.count() is a terminal operation, can be invoked only once for a given stream
//we are getting the following error: Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed.

/*        Над потоком следует работать (вызывая операцию промежуточного или конечного потока) только один раз.
        Реализация Stream может вызвать исключение IllegalStateException, если обнаружит, что Stream используется повторно.
        Всякий раз, когда терминальная операция вызывается для объекта Stream, экземпляр потребляется и закрывается.
        Следовательно, нам разрешено выполнять только одну операцию, которая использует поток, в противном случае мы получим исключение,
        указывающее, что поток уже обработан или закрыт.*/


    }
}
