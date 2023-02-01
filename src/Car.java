public class Car {
    private String model;
    private int miles;
    public Car(String model, int mi){
        this.model=model;
        miles=mi;
    }
    public String toString(){
        return model+ " "+ miles+"mi";
    }
}
