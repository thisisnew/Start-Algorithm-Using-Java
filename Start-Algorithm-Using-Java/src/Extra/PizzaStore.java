package Extra;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);    // factory method 사용
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    // factory method
    abstract Pizza createPizza(String type);
}
