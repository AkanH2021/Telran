public class Main {

    /* 1.Write a program by creating an "Employee" class having the following methods and print the final salary.
    - constructor which accepts the salary, numbers of employee's working hours per day as parameters
    - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
    - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
    more than 6 hours
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee(450, 6);
        Employee employee2 = new Employee(800, 7);
        Employee employee3 = new Employee(300, 8);
        System.out.println(employee1.totalPaid());
        System.out.println(employee2.totalPaid());
        System.out.println(employee3.totalPaid());


        System.out.println(Calculator.plus(20, 5));
        System.out.println(Calculator.minus(20, 5));
        System.out.println(Calculator.multiply(20, 5));
        System.out.println(Calculator.divide(20, 5));
        System.out.println(Calculator.percent(4, 50));

        int[] testArr = new int[]{2, 6, 9, 32, 64, -8};
        MaxElement maxElement = new MaxElement(testArr);
        System.out.println(maxElement.findMax());
    }

}