package homework.fruitsboxes.model;

public class Orange extends Fruit {

  private final String country;

  public Orange(String sort, float weight, String country) {
    super(sort, weight);
    this.country = country;
  }

  public String getCountry() {
    return country;
  }
}
