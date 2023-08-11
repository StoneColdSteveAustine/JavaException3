package JavaException3;

public class DataExceptions extends Exceptions{
    public DataExceptions() {
    }

    public void dataExceptions(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Ошибка! Неверный формат данных: %s", i);
        System.out.println();
    }
}
