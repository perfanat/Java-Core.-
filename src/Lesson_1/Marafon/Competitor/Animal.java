package Lesson_1.Marafon.Competitor;

// создание класса Животное
public class Animal implements Competitor {
    String type; // тип Ж
    String name; // имя Ж

    int maxRunDistance; // макс длина бега
    int maxJumpHeight; // макс высота прыжка
    int maxSwimDistance; // макс длина плавания

    boolean onDistance; // параметр На дистанции

    @Override
    public boolean isOnDistance() {
        return onDistance;
    } // переопределение На дистанции

    // конструктор класса Ж
    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    // переопределение метода бега
    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " хорошо справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не справился с кроссом");
            onDistance = false;
        }
    }

    // переопределение метода прыжка
    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть стену");
            onDistance = false;
        }
    }

    // переопределение метода плавания
    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " отлично проплыл");
        } else {
            System.out.println(type + " " + name + " не смог проплыть");
            onDistance = false;
        }
    }

    // переопределение метода Информации
    @Override
    public void info() {
        System.out.println(type + " " + name + " - " + onDistance);
    }
}