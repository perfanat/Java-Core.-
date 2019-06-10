package Lesson_1.Marafon.Obstacle;

import Lesson_1.Marafon.Competitor.Competitor;
import Lesson_1.Marafon.Competitor.Team;

// класс Полоса препятствий
public class Course {
    // массив препятствий
    Obstacle[] course = {new Cross(80), new Wall(2), new Water(10)};
    // метод старта
    public void doIt (Team team){
        for (Competitor c : team.competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
