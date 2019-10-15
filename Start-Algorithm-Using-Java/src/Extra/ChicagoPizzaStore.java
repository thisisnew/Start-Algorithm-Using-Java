package Extra;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		 if ("cheese".equals(type)) {
	            return new ChicagoStyleCheesePizza();
	        } else if ("pepperoni".equals(type)) {
	            return new ChicagoStylePepperoniPizza();
	        }
	        return null;
	}

}
