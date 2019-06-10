package Lesson_1.Marafon.Obstacle;

import Lesson_1.Marafon.Competitor.Competitor;

// класс Кросс
public class Cross extends Obstacle {
    int length; // длина Кросса

    // конструктор Кросса
    public Cross(int length) {
        this.length = length;
    }

    // переопределение метода прохождения препятствия
    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}