package com.company.com.company;

public class Speeding {

        public static void main(String[] args) {
            System.out.println(speeding(83, true));
        }

        public static int speeding(int speed, boolean bday) {
            int norm = 30;
            int a = 0;
            int b = 1;
            int c = 2;
            int d = 3;

            if ((speed <= norm + 10) && (!bday)) {
                return (a);
            }
            if ((speed >= 61) && (speed <= 80) && (!bday)) {
                return (b);
            }
            if ((speed >= 81) && (!bday)) {
                return (c);
            }
            if ((speed <= 65) && (bday)) {
                return (a);
            }
            if (speed >= 66 && speed <= 85 && bday) {
                return (b);
            }
            if ((speed >= 86) && (bday)) {
                return (c);
            } else {
                return 55;
            }

        }
    }
