package com.company;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();

        Animal[] animals = {shark,turtle,eagle};

        for (int i = 0; i < animals.length; i++) {
            if (i == 0) {
                shark.sharks[i] = (Shark) animals[i];
                System.out.println(shark.sharks[i] .attack("") +"\n"+ shark.getClass().getName() +"\n\n");
            } else if (i  == 1) {
                turtle.turtles[i] = (Turtle) animals[i];
                System.out.println(turtle.turtles[i].swim("") + "\n" + turtle.getClass().getName() + "\n\n");
            }else {
                eagle.eagles[i] = (Eagle) animals[i];
                System.out.println(eagle.eagles[i].fly("") +"\n\n"+ eagle.getClass().getName() +"\n\n");
                break;
            }
        }
        }
    }
