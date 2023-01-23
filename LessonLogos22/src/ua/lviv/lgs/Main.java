package ua.lviv.lgs;

public class Main {

    public static void main(String[] args) {
        // Task#1
        System.out.println("Task#1  \n");
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();
        cow.voice.makeVoice();
        cat.voice.makeVoice();
        dog.voice.makeVoice();

        // Task#2
        System.out.println("\nTask#2  \n");
        MathOperations add = (int a, int b, int c) -> a + b + c;
        System.out.println(operate(3, 4, 5, add));

        // Task#3
        System.out.println("\n Task#3 \n");
        Frog frog = new Frog();
        frog.eat.toDo();
        frog.sleep.toDo();
        frog.swim.toDo();

    }

    public static int operate(int a, int b, int c, MathOperations operation) {
        return operation.operation(a, b, c);
    }

}

interface MathOperations {
    int operation(int a, int b, int c);
}
