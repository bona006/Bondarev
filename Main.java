package Dz1;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Электроника");
        category1.setProducts(new Product("Смартфон", 500, 4));
        category1.setProducts(new Product( "Ноутбук", 1000, 5));

        Category category2 = new Category("Одежда");
        category2.products.push(new Product("Футболка", 20, 4.0));
        category2.products.push(new Product("Джинсы", 50, 4.1));

User user1 = new User("user1", "password1");
User user2 = new User("user2", "password2");

        user1.basket.addProduct(category1.products[0]);
        user1.basket.addProduct(category2.products[1]);

        user2.basket.addProduct(category1.products[1]);
        user2.basket.addProduct(category2.products[0]);
        }
    }
