public class Car {
    private String model;
    private int year;
    private int price;

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        if (year <= 2000 || year > 2024) {
            System.out.println("შეცდომა: თარიღი უნდა იყოს 2000-დან 2024 წლამდე!");
        }
        this.price = price;
        if (price < 0) {
            System.out.println("შეცდომა: ფასი უნდა იყოს დადებითი რიცხვი!");;
        }
    }
    //მეორე ტასკის მიხედვით შექმნილი კონსტრუქტორი
    public Car(String model) {
        this(model, 2001, 13000);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 1989, 34000);
        System.out.println(car1.model + " არის " + car1.year + "-წლიანი და მისი ფასია " + car1.price + " ლარი.");
        System.out.println();

        Car car2 = new Car("Mercedes", 2001, -7);
        System.out.println(car2.model + " არის " + car2.year + "-წლიანი და მისი ფასია " + car2.price + " ლარი.");
        System.out.println();

        Car car3 = new Car("Chevrolet", 1998, -10);
        System.out.println(car3.model + " არის " + car3.year + "-წლიანი და მისი ფასია " + car3.price + " ლარი.");
        System.out.println();

        Car car4 = new Car("Honda", 2014, 5000);
        System.out.println(car4.model + " არის " + car4.year + "-წლიანი და მისი ფასია " + car4.price + " ლარი.");
        System.out.println();

        //ობიექტები მეორე კონსტრუქტორისთვის
        Car car5 = new Car("BMW");
        System.out.println(car5.model + " არის " + car5.year + "-წლიანი და მისი ფასია " + car5.price + " ლარი.");
        System.out.println();

        Car car6 = new Car("Toyota");
        System.out.println(car6.model + " არის " + car6.year + "-წლიანი და მისი ფასია " + car6.price + " ლარი.");
        System.out.println();
    }
}