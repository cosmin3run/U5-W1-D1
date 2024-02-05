package epicode.u5d1.entities;

import epicode.u5d1.superclass.Element;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends Element {
    private String description;
    private List<Toppings> toppings;


    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
    }

    public Pizza(String name, int calories, double price, List<Toppings> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
        this. description = "tomato, cheese, " + toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "description=" + description +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} " +'\n';
    }
}
