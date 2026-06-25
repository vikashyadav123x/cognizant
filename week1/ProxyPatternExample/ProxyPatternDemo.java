package ProxyPatternExample;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo1.jpg");

        image1.display();
        image2.display();
    }
}
