package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] ints = {{1, 4, 6, 18}, {2, 4, 5, 8, -19}, {12, 1, 15, 8}};
        int[] arr = {7, 42, 11, 7, 1, 42};
        int[][] numbers = {{1, 2, 3, 1}, {-9, 0, 0}, {7, 8, 9, 9}};

        System.out.println(sumOfNSubArray(ints, 1));
        print2Dim(ints);
        task3(ints);
        System.out.println(taskHard(arr, 7, 42));
        System.out.println(noNegatives(numbers));
        System.out.println(sum1(numbers));
        System.out.println(elementPair(numbers));
    }

    //1.Найти сумму всех значений n-го подмассива двумерного массива
    //public static int sumOfNSubArray(int[][] ints, int n)
    public static int sumOfNSubArray(int[][] ints, int n) {
        int sum = 0;
        for (int i = 0; i < ints[n].length; i++) {
            sum += ints[n][i];
        }
        return sum;
    }

    //2.вывести на экран все значения двумерного массива
    //public static void print2Dim(int[][] array)
    public static void print2Dim(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //3.Вывести на экран номер строки (подмассива) двумерного массива сумма всех элементов которого равна нулю
    // int[][] ints = {{1,4,6,18}, {2,4,5,8}, {12,1,15,8}};
    public static int task3(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sumSubarray = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumSubarray += array[i][j];  //sumSubarray = sumSubarray+array[i][j]
                if (sumSubarray == 0)
                    System.out.println(i + "\t");
            }
        }
        return 0;
    }

    //4* Есть обычный(одномерный) массив целых чисел больше нуля. Вася и Петя задумывают по одному числу.
    // Найти наибольшую длину подмассива этого массива, такого что этот подмассив содержит поровну любимого
    // числа Васи и Пети. Если такого подмассива не существует, вернуть 0. Подмассив имеется в виду часть
    // массива от нулевого элемента и дальше.
    //например: (7, 42)-> {6,42,11,7,1,42}-> 5, (7,42)-> {7,42,11,7,1,42}-> 6
    public static int taskHard(int[] array, int a, int b) {
        int result = 0;
        int countVasya = 0;
        int countPetia = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == a)
                countVasya++;

            if (array[i] == b)
                countPetia++;

            if (countPetia == countVasya)
                result = i + 1;
        }
        return result;
    }

    //int [][]numbers = {{1,2,3}, {-9,0,0}, {7,8,9}};
    //5.Метод принимает двумернъй массив  и возвращает количество срок (подмассивов) , в
    // которъх нет отрицателънъх елементов (continue с меткой)
    public static int noNegatives(int[][] array) {
        int sum = 0;
        point:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    continue point;
                }
            }
            sum++;
        }

        return sum;
    }


    //6. сложитъ числа в двумерном массиве толъко из тех подмассивов где нет отрицателънъх елементов
    //continue с меткой
    public static int sum1(int[][] array) {
        int sum = 0;
        point:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    continue point;
                }
                sum += array[i][j];
            }
        }
        return sum;
    }

    //from teacher
    public static int sum(int[][] array) {
        int sum = 0;
        outerFor:
        for (int i = 0; i < array.length; i++) {
            int sumSubarray=0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0)
                    continue outerFor;
                    sumSubarray+= array[i][j];
                }
                sum += sumSubarray;
            }
        return sum;
    }



    // 7. Метод принимает целочисленнъй массив, в котором все елементъ парнъе кроме одного. Возвращает не парнъй елемент
    // {2,2,5,1,5} {3,3,3,3,2}
    public static int elementPair(int[][] array) {
        int nonPaired = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[i][j]) {
                    nonPaired+= array[i][j];
                }
            }
        }
        return nonPaired;
    }


    }