package app.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import app.entities.Product;

public class PgrPredicate {

	public static void main(String[] args) {
	    
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
	    list.add(new Product("TV", 900.00));
	    list.add(new Product("Mouse", 50.00));
	    list.add(new Product("Tablet", 350.50));
	    list.add(new Product("HD Case", 80.90));
	    
	    double min = 100.0;
	    
	    list.removeIf(p -> p.getPrice() >= min);
	    
	    
	    //list.forEach(System.out::println);
	    
	    for(Product p: list) {
	    	System.out.println(p);
	    }
	    
	    
	    
	}
	
	
	
}
