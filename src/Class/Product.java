package Class;

public class Product {

    public String name;
    public double price;
    public String category;
    public int stock;

    public Product(String name,double price,String category,int stock){

        this.name=name;
        this.price=price;
        this.category=category;
        this.stock=stock;

    }

    public String toString(){
        return "Store(name=%s,price=%s,category=%s,stock=%d)".formatted(this.name, this.price, this.category, this.stock);
    }

    public boolean isInStock(int stock){
        this.stock=stock;
        if(this.stock>0){
            return true;
        }
        else {
            return false;
        }

    }

}

