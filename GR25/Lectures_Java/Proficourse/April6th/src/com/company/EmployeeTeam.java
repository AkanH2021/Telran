package com.company;

import java.util.Arrays;

public class EmployeeTeam {
    private Employee[]

    Employee[] team;
    private int capacity=2;
    private int currentIndex=0;

    public void addToTeam(Employee e){
        if (team==null){
            team= new Employee[capacity];
            currentIndex=0;
        }
        if (currentIndex>=capacity){
            capacity*=2;
            team= Arrays.copyOf(team,capacity);

           /*
            Employee[] temp= new Employee[capacity*2];
            for (int i = 0; i < capacity; i++) {
                temp[i]=team[i];
            }
            capacity*=2;
            team = temp;
         */
        }
        team[currentIndex++]=e;

        //System.out.println(Arrays.toString(team));
    }

    public void printTeam(){
        System.out.print("Team: ");
        for (int i = 0; i <currentIndex ; i++) {
            System.out.print(team[i] + "   ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "EmployeeTeam{" +
    Arrays.toString(team) +
    '}';
    }
}
