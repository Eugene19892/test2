package HW2;

public class Exception2 extends NumberFormatException {
    public Exception2(int i, int j){
        super("Не удалось преобразовать элемент массива к числу (" + i + "," + j + ")");
    }
}