//Create a class Practice with following fields: String subject , Person trainee, Person tutor, MyDate dateStart, MyDate dateFinish.
//        a. Implement the constructor method.
//        b. Implement String toString() method, that returns the String info about Practice.

public class Practice {
    String subject;
    PracticePersons trainee;
    PracticePersons tutor;
    MyDate dateStart;
    MyDate dateFinish;

    public Practice(String topic, PracticePersons trainer, PracticePersons controller, MyDate start, MyDate finish) {
        subject = topic;
        trainee = trainer;
        tutor = controller;
        dateStart = start;
        dateFinish = finish;
    }

    public String toString() {
        String practice = "Education on subject: " + subject + " of the student: " + trainee + " started on: " + dateStart + " and finished on " + dateFinish + " with the tutor: " + tutor + " , who started on " + dateStart + " and finished on " + dateFinish;
        return practice;
    }
}