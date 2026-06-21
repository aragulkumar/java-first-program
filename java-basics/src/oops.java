class Car{
    String model;
    int year;

    Car(String model, int year){
        this.model = model;
        this.year = year;}


    void display(){
        System.out.println(model + " " + year);
    }
}


public class oops {
    public static void main(String[] args){
        Car myCar = new Car("Toyoto",2025);
        myCar.display();
    }
}
