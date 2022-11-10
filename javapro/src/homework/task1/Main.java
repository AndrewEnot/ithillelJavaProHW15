package homework.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println(toList(new String[]{"asd", "qwe", "rty"}));
  }

  /**This method takes array of some objects and convert it to the list of the same objects. */
  public static <T> List<T> toList(T[] array) {
    List<T> result = new ArrayList<>();
    if (array != null) {
      Collections.addAll(result, array);
    }
    return result;
  }
}