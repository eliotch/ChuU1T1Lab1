import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;
    public UsedCarLot(){
        inventory=new ArrayList<>();
    }
    public ArrayList<Car> getInventory(){
        return inventory;
    }
    public void addCar(Car a){
        inventory.add(a);
    }
    public boolean swap(int idx1, int idx2){
        if(idx1>=inventory.size()||idx2>=inventory.size()||idx1<0||idx2<0){
            return false;
        }else{
            Car placeholder=inventory.set(idx1, inventory.get(idx2));
            inventory.set(idx2, placeholder);
        }
        return true;
    }
}
