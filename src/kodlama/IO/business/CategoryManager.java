package kodlama.IO.business;

import java.util.ArrayList;

import kodlama.IO.core.loggging.Logger;
import kodlama.IO.dataAccess.CategoryDao;
import kodlama.IO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private ArrayList<Category> categories;
	private	Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao,ArrayList<Category> categories,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception{
		for (Category category1 : categories) {
			if(category.getCategoryName() == category1.getCategoryName()) {
				throw new Exception("kategory ismi aynı olamaz"); 	

			}
			
		}
		
		for (Logger logger : loggers) {

			logger.log(category.getCategoryName());
		}
		
		categoryDao.add(category);
		categories.add(category);
		
	}

}
