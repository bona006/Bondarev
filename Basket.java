package Dz1;

public class Basket {
    private Product[] items;

    public Basket(Product[] items) {
        this.items = items;
    }

    public void addProduct(Product product) {
        this.items.push(product);
    }

    public void removeProduct(Product product) {
    int index = this.items.indexOf(product);
        if (index != -1) {
            this.items.splice(index, 1);
        }
    }

    public Product[] getItems() {
        return items;
    }

    public void setItems(Product[] items) {
        this.items = items;
    }
}
