package homework.fruitsboxes;

import homework.fruitsboxes.model.Apple;
import homework.fruitsboxes.model.Box;
import homework.fruitsboxes.model.Orange;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    var apple1 = new Apple("Golden", 1.0F, "yellow");

    List<Apple> apples = new ArrayList<>();
    apples.add(new Apple("Golden", 1.0F, "yellow"));
    apples.add(new Apple("Champion", 1.0F, "red"));
    apples.add(new Apple("Semerenko", 1.0F, "green"));

    var orange1 = new Orange("Tikaua", 1.5F, "Tanzania");

    List<Orange> oranges = new ArrayList<>();
    oranges.add(new Orange("Conchita", 1.5F, "Brazil"));
    oranges.add(new Orange("Kleopatra", 1.5F, "Egypt"));
    oranges.add(new Orange("Tikaua", 1.5F, "Tanzania"));

    Box<Apple> appleBox = new Box<>();
    Box<Apple> appleBox2 = new Box<>();
    Box<Orange> orangeBox = new Box<>();

    appleBox.addOne(apple1);
    appleBox.addAll(apples);
    appleBox2.addAll(apples);

    orangeBox.addOne(orange1);
    orangeBox.addAll(oranges);

    System.out.println(appleBox.getWeight());
    System.out.println(appleBox2.getWeight());
    System.out.println(orangeBox.getWeight());
    System.out.println();

    System.out.println(appleBox2.compare(orangeBox));
    System.out.println();

    appleBox.merge(appleBox2);
    System.out.println(appleBox.getWeight());
  }
}
