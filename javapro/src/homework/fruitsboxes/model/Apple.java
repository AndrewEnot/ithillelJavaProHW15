package homework.fruitsboxes.model;

public class Apple extends Fruit {

  private final String colour;

  public Apple(String sort, float weight, String colour) {
    super(sort, weight);
    this.colour = colour;
  }

  public String getColour() {
    return colour;
  }
}
