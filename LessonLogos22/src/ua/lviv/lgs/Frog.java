package ua.lviv.lgs;

@FunctionalInterface
interface AmphibiaToDo {
    void toDo();
}

class Frog {

    AmphibiaToDo eat = () -> System.out.println("FROG: I eat.");

    AmphibiaToDo sleep = () -> System.out.println("FROG: I sleep.");

    AmphibiaToDo swim = () -> System.out.println("FROG: I swim.");

    AmphibiaToDo walk = () -> System.out.println("FROG: I walk.");

}
