import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestFilter {
    public static void main(String[] args) {

        streamFilter();
    }

    public static void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Kevin");
        names.add("Adam");
        names.add("Alex");
        names.add("Matt");

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
    }
}

