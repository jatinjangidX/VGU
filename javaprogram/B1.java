class Car{
    int year = 2005;
    String model = "GLC200";
    String make = "BMW";
    void display(){
    System.out.println("The car model is " + model + " made by " + make + " in the year " + year+ ".");
    }
    }
    class B1{
    public static void main(String[] args){
    Car car = new Car();
    car.display();
    }
}
    
