package com.company;

public class Main {

    public static void main(String[] args) {


        Employee fazry = new Employee("Fazry","Febrian", 1);
        Employee fidya = new Employee("Fidya","Nandameysa", 2);
        Employee fikry = new Employee("Fikry", "Deniansyah", 3);
        Employee safira = new Employee("Safira", "Rizqa", 4);
        Employee dian = new Employee("Dian", "Nurdiani", 5);

        LinkedStack stack = new LinkedStack();

        stack.push(fazry);
        stack.push(fidya);
        stack.push(fikry);
        stack.push(safira);
        stack.push(dian);

        System.out.println("============show all");
        stack.printStack();
        System.out.println("\n");
        System.out.println("============Insert");
        System.out.println(stack.peek());

        stack.pop();
        System.out.println("\n");
        System.out.println("=============After Deletion");
        stack.printStack();

        //System.out.println(stack.peek());

    }
}
