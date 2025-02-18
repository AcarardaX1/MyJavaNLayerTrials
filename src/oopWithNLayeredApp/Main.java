package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductService;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JDBCProductDao;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Product p1 = new Product(91, "Alfa Romeo Stelvio", 60000);
		
		//Same also goes for ProductService productService = new ProductService(new JDBCProductDao());
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductService productService = new ProductService(new HibernateProductDao(),loggers);

		productService.add(p1);

	}

}
