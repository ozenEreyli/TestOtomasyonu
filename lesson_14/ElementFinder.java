package org.rd.ta.sample.lesson_14;

import java.util.Collection;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;

public class ElementFinder {
   public static <T> T findElement(Collection<T> collection, T elementToFind) {
        Optional<T> result = collection.stream()
                .filter(element -> element.equals(elementToFind))
                .findFirst();
        return result.orElse(null);
    }

    public static void main(String[] args) {
        // Example usage
        List<String> winterMonths = Arrays.asList("December","January","February");

        String element = findElement(winterMonths, "January");
        System.out.println("Element found: " + element);

        element = findElement(winterMonths, "May");
        System.out.println("Element found: " + element); // Output: Element found: null
    }

}
