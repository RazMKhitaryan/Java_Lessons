
public class Plane {

    private String name;
    private String country;
    private int year;
    private double hours;
    private boolean military;
    private double weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public  void task2(){
        if (military == true){
            System.out.println("Cost: " + cost);
            System.out.println("Top Speed: " + topSpeed);
        }else{
            System.out.println("Name: " + name);
            System.out.println("Country: " + country);


        }
    }

//    public void task3(){
//        if (plane1.setyear < plane2.setyear){
//            plane1.printPlaneInfo();
//        }else {
//            plane2.printPlaneInfo();
//
//        }
//    }


//        public void task4(){
//        if (plane1.setWingspan > plane2.setWingspan){
//            plane1.printPlaneInfo();
//        }else {
//            plane2.printPlaneInfo();
//
//        }
//    }


    public void  printPlaneInfo(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Hours: " + hours);
        System.out.println("Is Military: " + military);
        System.out.println("Weight: " + weight);
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Seats: " + seats);
        System.out.println("Cost: " + cost);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {

        return year;

    }

    public void setYear(int year) {
        if (year>= 1903 && year<=2020)
        this.year = year;
    }

    public double getHours() {

        return hours;

    }

    public void setHours(double hours) {
        if (hours >0 && hours <= 10000)
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWeight() {

        return weight;

    }

    public void setWeight(double weight) {
        if (weight >=1000 && weight<= 160000)
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan>=10 && wingspan<=45)
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {

        return topSpeed;

    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed>=0 && topSpeed<=3000)
        this.topSpeed = topSpeed;
    }

    public int getSeats() {

        return seats;

    }

    public void setSeats(int seats) {
        if (seats>=0 && seats <= 400)
        this.seats = seats;
    }

    public double getCost() {

        return cost;

    }

    public void setCost(double cost) {
        if (cost >0 && cost<=1000)
        this.cost = cost;
    }



}
