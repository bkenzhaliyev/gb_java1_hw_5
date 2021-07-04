package hw6.animal;

public class Cat extends Animal {
    static int catCount;
    final int runMaxL = 200;

    public Cat(String name, int runLenght, int swimLenght) {
        super(name, runLenght, swimLenght);
        catCount += 1;
    }

    @Override
    public void run() {
        if ( runLenght <= runMaxL){
            super.run();
        } else {
            System.out.println("Кот " + this.name + " не может бегать на такое расстояние.");
        }

    }

    @Override
    public void swim() {
        System.out.println("Коты не умеют плавать...");
    }

    public static void catCount(){
        System.out.println("количество котов " + catCount);
    }
}
