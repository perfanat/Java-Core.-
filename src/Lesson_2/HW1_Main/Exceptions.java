package Lesson_2.HW1_Main;

public class Exceptions {
    private static String [][] mass = {
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"}
    };
    private static int num1;
    private static int num2;

    private static int calc(String[][] mass) throws MyArraySizeException {
        if(mass.length != 4) throw new MyArraySizeException("Массив должен быть размером 4х4");
        int res=0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(mass[i].length != 4) throw new MyArraySizeException("Массив должен быть размером 4х4");
                num1=i+1;
                num2=j+1;
                res += Integer.parseInt(mass[i][j]);
            }
        } return res;
    }

    public static void main(String[] args) throws MyArrayDataException {
        try {
            System.out.println(calc(mass));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (NumberFormatException e){
            throw new MyArrayDataException("Символ ["+num1+"/"+num2+"] не может быть преобразован в число");
        }
    }
}
