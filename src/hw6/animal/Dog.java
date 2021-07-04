package hw6.animal;

public class Dog extends Animal {
    final int runLenght = 500;
    static int dogCount;

    public Dog(String name, int runLenght, int swimLenght) {
        super(name, runLenght, swimLenght);
        dogCount += 1;
    }

    public Dog() {
        dogCount += 1;
    }

    @Override
    public void run() {
        if (this.runLenght <= runLenght) {
            super.run();
        } else {
            System.out.println("Собака не можете бегать на такое расстояние.");
        }
    }

    public static void dogCount() {
        System.out.println("количество собак " + dogCount);
    }
}
