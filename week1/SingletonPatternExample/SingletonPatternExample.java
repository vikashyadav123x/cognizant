public class SingletonPatternExample {
    private static SingletonPatternExample instance;
    private final String message;

    private SingletonPatternExample() {
        this.message = "Singleton instance created successfully.";
    }

    public static synchronized SingletonPatternExample getInstance() {
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        SingletonPatternExample first = SingletonPatternExample.getInstance();
        SingletonPatternExample second = SingletonPatternExample.getInstance();

        System.out.println("Same instance: " + (first == second));
        System.out.println(first.getMessage());
    }
}
