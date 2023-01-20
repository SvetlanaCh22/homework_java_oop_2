/*
Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo();
Реализовать интерфейс в абстрактном классе. Создать два списка в классе main.
В каждый из списков добавить по десять экземпляров наследников BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут
быть в одном и Крестьянин, копейщик, арбалетчик и монах в другой. Реализовать метод step() для магов таким образом,
чтобы они могли лечить самого повреждённого из своих однополчан!
Удалить ненужные методы из абстрактного класса, если такие есть.

Автор: Чубченко Светлана
*/

import java.util.ArrayList;
import java.util.Random;

public class mainPro {

    private static ArrayList<Hero> getHeroes(boolean heroesType, int quantity) {
        final Random rand = new Random();
        ArrayList<Hero> heroes = new ArrayList<>();

        String[] namesList = {"Grigorii", "Lev", "Andrei", "Roman", "Arsenii", "Stepan", "Vladislav", "Nikita", "Gleb",
                "Mark", "David", "Iaroslav", "Evgenii", "Matvei", "Fyodor", "Nicolai", "Aleksei", "Andrei", "Artemii",
                "Victor", "Nikita", "Daniil", "Denis", "Egor", "Igor", "Lev", "Leonid", "Pavel", "Petr", "Roman",
                "Ruslan", "Sergey", "Semyon", "Timofei", "Stepan", "Vladimir", "Timofei", "Iaroslav", "Pavel", "Egor",
                "Sergey", "Vladislav", "Fedor", "Konstantin", "Maksim", "Artyom", "Nikita", "Iurii", "Platon", "Denis",
                "Iaroslav", "Miron", "Vasilii", "Lev", "Stepan", "Evgenii", "Savelii", "David", "Grigorii", "Timur",
                "Kirill", "Victor", "Fyodor", "Bogdan", "Konstantin", "Adam", "Leonid", "Roman", "Pavel", "Artemii",
                "Petr", "Aleksei", "Miron", "Vladimir"};
        int namesSize = namesList.length;

        for(int i=0; i<quantity; i++) {
            int type = rand.nextInt(4);
            if (heroesType) {
                switch (type) {
                    case 0 -> heroes.add(new Peasant(namesList[rand.nextInt(namesSize)]));
                    case 1 -> heroes.add(new Rogue(namesList[rand.nextInt(namesSize)]));
                    case 2 -> heroes.add(new Sniper(namesList[rand.nextInt(namesSize)]));
                    case 3 -> heroes.add(new Warlock(namesList[rand.nextInt(namesSize)]));
                }
            } else {
                switch (type) {
                    case 0 -> heroes.add(new Peasant(namesList[rand.nextInt(namesSize)]));
                    case 1 -> heroes.add(new Spearman(namesList[rand.nextInt(namesSize)]));
                    case 2 -> heroes.add(new Crossbowman(namesList[rand.nextInt(namesSize)]));
                    case 3 -> heroes.add(new Monk(namesList[rand.nextInt(namesSize)]));
                }
            }
        } return heroes;
    }

    static void callHealers(ArrayList<Hero> heroList) {
        for (Hero hero : heroList) {
            String role = hero.getRole();
            if (role.equals("Warlock") || role.equals("Monk")) {
                System.out.println(hero.getName() + " heals: ");
                hero.step(heroList);
            }
        }
    }

    public static void main(String[] args) {

        // заполним 50 рандомных героев
        ArrayList<Hero> heroes1 = getHeroes(true, 10);
        ArrayList<Hero> heroes2 = getHeroes(false, 10);

        // выводим созданные два набора из героев
        System.out.println("Heroes 1:");
        heroes1.forEach(n -> System.out.println(n.getName() + " (" + n.getInfo() + ")"));
        System.out.println();
        System.out.println("Heroes 2:");
        heroes2.forEach(n -> System.out.println(n.getName() + " (" + n.getInfo() + ")"));
        System.out.println();

        // делаем шаг, где из каждого списка Monk'и и Warlock'и лечат героев с самым низким уровнем здоровья
        System.out.println("Heroes 1 step:");
        callHealers(heroes1);
        System.out.println();
        System.out.println("Heroes 2 step:");
        callHealers(heroes2);

    }

}

