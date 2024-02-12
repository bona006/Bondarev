package Dz1;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category();
        category1.setName("Электроника");
        Product[] pr = new Product[2];
        category1.setProducts(pr);
        category1.getProducts().push(new Product("Смартфон", 500, 4));
        category1.getProducts().push(new Product( "Ноутбук", 1000, 5));

        Category category2 = new Category();
        category2.setName("Электроника");
        Product[] pr2 = new Product[2];
        category2.setProducts(new Product("Футболка", 20, 4));
        category2.setProducts(new Product("Джинсы", 50, 4));

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.basket.addProduct(category1.products[0]);
        user1.basket.addProduct(category2.products[1]);

        user2.basket.addProduct(category1.products[1]);
        user2.basket.addProduct(category2.products[0]);
        }
    }
