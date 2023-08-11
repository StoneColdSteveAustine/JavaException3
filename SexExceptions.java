package JavarException3;

public class SexExceptions extends Exceptions {
    public SexExceptions() {
    }

    public void sexExceptions(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Ошибка: Неправильный формат пола: %s", i);
        System.out.println();
    }
}
