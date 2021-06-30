package hw5;

public class hw5 {
    public static void main(String[] args) {
        Person[] person = {
                new Person("Иванов Иван", "Бухгалтер", "ivanov.i@list.ru",
                        "+3 495 290 77 11", 150000, 39),
                new Person("Сидоров Евгений", "Региональный директор", "sidorov.e@list.ru",
                        "+3 495 290 23 11", 350000, 43),
                new Person("Остап Бендер", "Технический директор", "bender.o@list.ru",
                        "+3 495 294 29 16", 530000, 45),
                new Person("Шура Балаганов", "Мастер участка", "balaganov.s@list.ru",
                        "+3 495 239 23 67", 50000, 35),
                new Person("Киса Воробянинов", "Специалист", "vorobianinov@list.ru",
                        "+3 495 200 45 99", 59350, 49),
        };
        System.out.printf("%-25s %-25s %-25s %-20s %-15s %-10s \n", "ФИО сотрудника", "Должность", "e-mail",
                "№ телефона", "Оклад", "Возраст");
        System.out.println("___________________________________________________________________________" +
                "___________________________________________________");
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].info();
            }
        }
    }
}
