package Lesson_1.Marafon.Competitor;

// интерфейс участника
public interface Competitor {
    void run(int dist); // метод бега
    void swim(int dist); // метод плавания
    void jump(int height); // метод прыжка
    boolean isOnDistance(); // на дистанции?
    void info(); // метод информации
}