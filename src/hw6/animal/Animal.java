package hw6.animal;

public class Animal {
    String name;
    int runLenght;
    int swimLenght;
    static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount += 1;
    }

    public Animal(String name, int runLenght, int swimLenght) {
        this.name = name;
        this.runLenght = runLenght;
        this.swimLenght = swimLenght;
        animalCount += 1;
    }

    public Animal() {
        animalCount += 1;
    }

    public void run(){
        System.out.println(name + " пробежал " + runLenght + " м.");
    }

    public void swim(){

        System.out.println(name + " проплыл " + swimLenght + " м.");
    }

    public static void animalCount(){
        System.out.println("Количество животных " + animalCount);
    }
}
