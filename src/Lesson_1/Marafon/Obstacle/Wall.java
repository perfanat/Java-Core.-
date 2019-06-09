package Lesson_1.Marafon.Obstacle;

import Lesson_1.Marafon.Competitor.Competitor;

// класс Стена
public class Wall extends Obstacle {
    int height; // высота

    // конструктор Стены
    public Wall(int height) {
        this.height = height;
    }

    // переопределение прохождения препятствия
    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}