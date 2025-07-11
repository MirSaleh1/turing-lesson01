package Class;

import java.util.Arrays;

public class Store {
    public String name;
    public String address;
    public String [] product;
    public Store(String name, String address, String[] product) {
        this.name = name;
        this.address = address;
        this.product = product;
    }
    public String toString(){
        return "Store(name=%s,address=%s,product=%s)".formatted(this.name, this.address, Arrays.toString(this.product));
    }
    public static double[] applyDiscountToAll(double[]prices) {

        for(int i=0;i<4;i++) {
            prices[i] = prices[i]-((prices[i] * 10) / 100);
        }
        return prices;


    }

    public void pplyDiscountToAll(){

        for(String p:product){
            System.out.println(p);
        }
    }
    public static String printExpensiveProduct(double[] price, String[] product){
        for(int j=0;j<product.length;j++){
            if(price[j]>50){
                return product[j];
            }

        }
        return null;
    }
}
