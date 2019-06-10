package Lesson_1.Marafon;

import Lesson_1.Marafon.Competitor.*;
import Lesson_1.Marafon.Obstacle.Course;
import Lesson_1.Marafon.Obstacle.Cross;
import Lesson_1.Marafon.Obstacle.Obstacle;
import Lesson_1.Marafon.Obstacle.Wall;

public class Main {
    // запуск
    public static void main(String[] args) {
//        // массив участников
//        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        // массив препятствий
//        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        // создание команды
        Team team = new Team();
        // создание Полосы препятствий
        Course course = new Course();
//        // прохождение участниками препятствий
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
        course.doIt(team); // старт
        team.info(); // инфо
//        // вывод инфо
//        for (Competitor c : competitors) {
//            c.info();
//        }
    }
}