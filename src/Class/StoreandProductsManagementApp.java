package Class;

import java.util.Arrays;

public class StoreandProductsManagementApp {
    public static void main(String[] args) {

        Product p1= new  Product("Watermelon",2,"Fruit",20);
        Product p2= new Product("car",55,"Toy",25);
        Product p3= new Product("screwdriver",5,"Tool",55);
        Product p4= new Product("shirt",65,"Clothes",17);

        String []product=new String[4];

        product[0]= String.valueOf(p1.name);
        product[1]= String.valueOf(p2.name);
        product[2]= String.valueOf(p3.name);
        product[3]= String.valueOf(p4.name);
        Store store=new Store("BazarStore","16/21 Azadlıq Prospekti",product);
        double []price=new double[4];
        price[0]= p1.price ;
        price[1]= p2.price ;
        price[2]= p3.price ;
        price[3]= p4.price;
        System.out.println(store);
        store.pplyDiscountToAll();


        String expensiveProduct= Store.printExpensiveProduct(price,product);
        System.out.println("expensive"+ ":"+expensiveProduct);
        double [] newprice=Store.applyDiscountToAll(price);
        System.out.println(Arrays.toString(newprice));

    }
}
