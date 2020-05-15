package springhw.beanpostprocessors;

import java.util.LinkedList;
import java.util.List;

public class ManFactory {
    public static List<Man> getMans(int count) {
        List<Man> mans = new LinkedList<Man>();

        for (int i = 0; i < count; i++) {
            mans.add(new Man("firstName " + count, "lastName " + count));
        }

        return mans;
    }

}