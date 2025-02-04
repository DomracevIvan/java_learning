package HomeWork.homeWork06;

import java.util.Objects;

public class Product {
    private int price;
    private String prodName;

    public Product(int price, String prodName) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной!");
        }
        if (prodName == null || prodName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя товара не может быть пустым!");
        }
        this.price = price;
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new RuntimeException("Цена не может быть отрицательной!");
        }
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        if (prodName == null || prodName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя товара не может быть пустым!");
        }
        this.prodName = prodName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, prodName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return price == product.price && Objects.equals(prodName, product.prodName);
    }

    @Override
    public String toString() {
        return "Название товара: " + prodName + ", Цена товара: " + price;
    }
}