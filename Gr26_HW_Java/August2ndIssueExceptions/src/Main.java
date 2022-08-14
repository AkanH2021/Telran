public class Main {
    //First level: У вас в программе создается User (User {String firstName, String lastName, int age,email}).
    // При этом, в конструктор приходит строка вида “John;Lennon;40;lennon@mail.com” Система должна либо
    // создавать объект, либо формировать Exception. При этом, должна быть возможность получить все ошибки,
    // которые привели к не созданию объекта.
    //Например: 1. Некорректный формат строки; 2. В строке не хватает данных;   3. Поле не задано (пустое);
    //4. email имеет неправильный формат: короче 4 символов или не содержит символ @ ;
    //5. Поле возраст некорректно;   6. В строке больше полей, чем необходимо;
    public static void main(String[] args) {
        Checkers checkers = new Checkers();
        User user = new User("John", "Lennon", 140, "lennon@mail.com");
        checkers.userControl(user);
    }

}





