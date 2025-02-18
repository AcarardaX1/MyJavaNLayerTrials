package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JDBCProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductService {
	
	private ProductDao productDao;
	private Logger[] loggers;
	

	public ProductService(ProductDao productDao, Logger[] loggers ) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		
		if(product.getnPrice()<50) {
			
			throw new Exception("Unit Price must be superior than €49");
			
		}
		
		//Primitive Usages 
		//ProductDao productDao = new HibernateProductDao();
	    //Also same goes for ProductDao productDao = new JDBCProductDao();

	productDao.add(product);	
	
	for (Logger logger : loggers) {
		logger.log(product.getName());
	}
	
	}
	
}
