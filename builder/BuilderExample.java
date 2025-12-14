class Pizza {
    String dough;
    String topping;

    public String toString() {
        return "Pizza with " + dough + " dough and " + topping;
    }
}

interface PizzaBuilder {
    void buildDough();
    void buildTopping();
    Pizza getResult();
}

class SimplePizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildDough() {
        pizza.dough = "thin";
    }

    public void buildTopping() {
        pizza.topping = "cheese";
    }

    public Pizza getResult() {
        return pizza;
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        PizzaBuilder builder = new SimplePizzaBuilder();
        builder.buildDough();
        builder.buildTopping();
        Pizza pizza = builder.getResult();
        System.out.println(pizza);
    }
}
