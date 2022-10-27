package homework.fruitsboxes.model;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

  private final List<T> list;

  public Box() {
    this.list = new ArrayList<>();
  }

  //this method adds one kind of fruit to the box
  public void addOne(T fruit) {
    if (fruit != null) {
      list.add(fruit);
    }
  }

  //this method adds list of fruits of one kind to the box
  public void addAll(List<T> fruits) {
    if (fruits != null) {
      list.addAll(fruits);
    }
  }

  //this method gives total weight of the box
  public float getWeight() {
    float result = 0.0F;
    for (T t : list) {
      result += t.getWeight();
    }
    return result;
  }

  //this method compares actual box with the box which got as an argument by its weight
  public boolean compare(Box<? extends Fruit> box) {
    if (box == null) {
      return false;
    }
    return box.getWeight() == this.getWeight();
  }

  /*this method adds fruits from the box which got as an argument to the actual box with the
  same kind of fruits*/
  public void merge(Box<T> box) {
    if (box != null) {
      addAll(box.getList());
    }
  }

  public List<T> getList() {
    return list;
  }
}
