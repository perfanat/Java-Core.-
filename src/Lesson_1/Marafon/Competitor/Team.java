package Lesson_1.Marafon.Competitor;

// класс Команды
public class Team {
    // массив участников
    public Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
    // метод информации
    public void info (){
        for (Competitor c:competitors){
            c.info();
        }
    }
}
