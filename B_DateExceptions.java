package JavaException3;

public class DateExceptions extends Exceptions {
    public B_DateExceptions() {
    }

    public void dataExceptions(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Ошибка: неверный формат даты %s", i);
        System.out.println();
    }
}
