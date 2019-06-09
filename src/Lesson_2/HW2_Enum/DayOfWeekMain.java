package Lesson_2.HW2_Enum;

public class DayOfWeekMain {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.Th;
        // вариант 1
        System.out.println("Вариант 1:\n"+dayOfWeek.getRus()+" - остаётся "+getWorkingHours(dayOfWeek)+" ч.");
        // вариант 2
        System.out.println("Вариант 2:\n"+dayOfWeek.getRus()+" - остаётся "+getWorkingHours2(dayOfWeek)+" ч.");
    }

    public static int getWorkingHours (DayOfWeek dayOfWeek){
        return dayOfWeek.getWorkingHours();
    }

    public static int getWorkingHours2 (DayOfWeek dayOfWeek){
        if (dayOfWeek.ordinal()==5||dayOfWeek.ordinal()==6){
            return 0;
        }else {
            return 40-dayOfWeek.ordinal()*8;
        }
    }
}

enum DayOfWeek {
    Mon ("Понедельник", 40),
    Th ("Вторник", 32),
    Wen ("Среда", 24),
    Thur ("Четверг", 16),
    Fr ("Пятница", 8),
    Sut ("Суббота", 0),
    Sun ("Воскресенье", 0);

    private String rus;
    private int workingHours;

    DayOfWeek(String rus, int workingHours) {
        this.rus = rus;
        this.workingHours = workingHours;
    }
    public int getWorkingHours (){
        return workingHours;
    }

    public String getRus() {
        return rus;
    }
}
