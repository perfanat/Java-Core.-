package Lesson_1.Marafon.Obstacle;

import Lesson_1.Marafon.Competitor.Competitor;

// класс Вода
public class Water extends Obstacle {
    int length; // длина

    // конструктор Воды
    public Water(int length) {
        this.length = length;
    }

    // переопределение метода прохождения препятствия
    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}