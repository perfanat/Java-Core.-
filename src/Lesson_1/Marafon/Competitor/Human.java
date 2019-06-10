package Lesson_1.Marafon.Competitor;

// класс Человека
public class Human implements Competitor {
    String name; // имя

    int maxRunDistance; // макс длина бега
    int maxJumpHeight; // макс высота прыжка
    int maxSwimDistance; // макс длина плавания

    boolean active; // на дистанции

    // на дистанции?
    @Override
    public boolean isOnDistance() {
        return active;
    }

    // конструктор человека
    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    // переопределение метода бега
    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " хорошо справился с кроссом");
        } else {
            System.out.println(name + " не справился с кроссом");
            active = false;
        }
    }

    // переопределение метода прыжка
    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену");
            active = false;
        }
    }

    // переопределение метода плавания
    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " отлично проплыл");
        } else {
            System.out.println(name + " не смог проплыть");
            active = false;
        }
    }

    // переопределение метода информации
    @Override
    public void info() {
        System.out.println(name + " - " + active);
    }
}