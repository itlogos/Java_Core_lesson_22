package ua.lviv.lgs;

@FunctionalInterface
interface Pet {
    abstract void makeVoice();
}

class Cat {
    AmphibiaToDo eat = () -> System.out.println("FROG: I eat.");

    Pet voice = () -> System.out.println("Я кіт- Мяууу-Мяууу");
}

class Cow {

    Pet voice = () -> System.out.println("Я кіт- Мяууу-Мяууу");
}

class Dog {

    Pet voice = () -> System.out.println("Я пес- Гаууу-Гаууу");
}
