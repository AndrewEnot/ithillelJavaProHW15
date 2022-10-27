package homework.fruitsboxes.model;

public class Fruit {

  private final String sort;
  private final float weight;

  public Fruit(String sort, float weight) {
    this.sort = sort;
    this.weight = weight;
  }

  public String getName() {
    return sort;
  }

  public float getWeight() {
    return weight;
  }
}
