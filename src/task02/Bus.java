package task02;

public class Bus extends Vehicle{

    private int capacity;
    private boolean isDoubleDecker;
    public Bus(String brand, String model, String plateNumber,boolean isAvailable,int capacity, boolean isDoubleDecker){
        super(brand,model,plateNumber,isAvailable);
        this.capacity = capacity;
        this.isDoubleDecker = isDoubleDecker;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean getDoubleDecker() {
        return isDoubleDecker;
    }
    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }
    @Override
    public void drive(){
        System.out.println("Tutumu:"+ capacity+ " olan avtobus hərəkət edir.");

    }

    @Override
    public String toString() {
        return super.toString() +
                "capacity=" + capacity +
                ", isDoubleDecker=" + isDoubleDecker +
                '}';
    }
}
