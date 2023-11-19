package M2C6.classes;

import java.util.Collection;
import java.util.List;

public class Utilities {

    public <T> void printElements(List<T> elements) {
        elements.stream().forEach(ele -> System.out.println(ele));
    }

    public <T , U extends T> void copyElements(List<? extends T> elements, List<? super T> destination) {
        destination.addAll(elements);
    }
}
