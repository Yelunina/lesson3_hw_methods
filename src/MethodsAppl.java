/*Задача 1
Написать аппликацию демонстрирующую работу стека
Метод main вызывает method1. method1 вызывает method2. method2 вызывает method3.
В каждом методе должно происходить следующее:
Печатает в консоль информацию, что метод такой-то стартовал
Вызывает следующий метод
Печатает в консоль, что метод такой-то финишировал
 */
public class MethodsAppl {
    public static void main(String[] args) {
        System.out.println(" MethodMain started");
        callsMethod1();
        System.out.println(" MethodMain finished");
    }

    private static void callsMethod1() {
        System.out.println(" Method1 started");
        callsMethod2();
        System.out.println(" Method1 finished");
    }

    private static void callsMethod2() {
        System.out.println(" Method2 started");
        callsMethod3();
        System.out.println(" Method2 finished");
    }

    private static void callsMethod3() {
        System.out.println(" Method3 started");
        System.out.println(" Method3 finished");
    }
}
