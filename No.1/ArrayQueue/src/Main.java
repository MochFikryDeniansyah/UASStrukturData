public class Main {
    public static void main(String[] args) {

        Employee fikryaceng = new Employee("Fikry", "Aceng", 1);
        Employee fazryozil = new Employee("Fazry", "Ozil", 2);
        Employee fidyananda = new Employee("Fidya", "Nanda", 3);
        Employee safirarizqa = new Employee("Safira", "Nurrizqa", 4);
        Employee diannurdianni = new Employee("Dian", "Nurdianni", 5);

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(fikryaceng);
        queue.enqueue(fazryozil);
        queue.enqueue(fidyananda);
        queue.enqueue(safirarizqa);
        queue.enqueue(diannurdianni);

        System.out.println("\n");
        System.out.println("Show All");
        queue.printQueue();

        System.out.println("\n");
        System.out.println("After Deletion Queue");
        queue.dequeue();
        queue.printQueue();

        System.out.println("\n");
        System.out.println("Insert Rear Queue :");
        queue.printQueue();
        System.out.println(queue.peekRear());
        System.out.println("\n");
    }
}