package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List<Category> categories;
	private Logger[] loggers;


	public CategoryManager(CategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category categoryx : categories) {
			if (categoryx.getName().equals(category.getName())) {
				throw new Exception("Kategori isimleri aynı olamaz.");
			}			
		}

		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		
	}

}
