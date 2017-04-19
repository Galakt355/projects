//: object/HelloDateJavaDocTwelve.java
import java.util.*;

/**Первая программа - пример книги
 * Выводит строку и текущее число.
 * @author Геннадий Микишев
 * @version 1.0
 */
class HelloDateJavaDocTwelve
{
    /**
     * Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws exceptions Исключения не выдаются
     */
    public static void main(String[] args){
        System.out.print("Привет, сегодня: ");
        System.out.print(new Date());
    }
}/* Output: (55% match) Дата и время текущего дня *///:~