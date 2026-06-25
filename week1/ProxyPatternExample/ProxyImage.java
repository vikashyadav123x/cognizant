package ProxyPatternExample;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private static final Map<String, RealImage> IMAGE_CACHE = new HashMap<>();
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        RealImage image = IMAGE_CACHE.get(fileName);
        if (image == null) {
            image = new RealImage(fileName);
            IMAGE_CACHE.put(fileName, image);
        }
        image.display();
    }
}
