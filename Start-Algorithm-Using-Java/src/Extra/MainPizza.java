package Extra;

public class MainPizza {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
		Pizza chiPizza = chicagoPizzaStore.orderPizza("pepperoni");
	
	}
}	
