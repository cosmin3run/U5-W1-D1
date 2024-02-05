package epicode.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MenuList {
private List<Pizza> pizzas;
private List<Drinks> drinks;
private List<Toppings> toppings;

    public MenuList(List<Pizza> pizzas, List<Drinks> drinks, List<Toppings> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "MenuList{" +
                pizzas + '\n' +
                 drinks + '\n' +
                toppings +  '\n' +
                '}';
    }
}
