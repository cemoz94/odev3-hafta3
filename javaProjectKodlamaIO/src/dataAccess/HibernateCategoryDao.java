package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Hibernate ile kategori veritabanına eklendi.");
	}

}
