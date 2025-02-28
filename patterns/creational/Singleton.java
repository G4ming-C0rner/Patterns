// patterns/creational/Singleton.java
package patterns.creational;

public class Singleton {
    // Единственный экземпляр класса
    private static Singleton instance;

    // Приватный конструктор, чтобы запретить создание экземпляров извне
    private Singleton() {}

    // Метод для получения экземпляра
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Пример метода
    public void doSomething() {
        System.out.println("Singleton is doing something!");
    }
}