public class AirportTest {
    public static void main(String[] args) {
        System.out.println("--------Task1---------");
        Plane plane1 = new Plane();

        plane1.setName("ArmFly");
        plane1.setCountry("Armenia");
        plane1.setYear(2005);
        plane1.setHours(5834);
        plane1.setMilitary(false);
        plane1.setWeight(2500);
        plane1.setWingspan(25);
        plane1.setTopSpeed(900);
        plane1.setSeats(150);
        plane1.setCost(532.1);

        plane1.printPlaneInfo();

        System.out.println("--------Task2---------");
        plane1.task2();

        System.out.println("--------Task3---------");
        Plane plane2 = new Plane();

        plane2.setName("RusFly");
        plane2.setCountry("Russia");
        plane2.setYear(1998);
        plane2.setHours(6871);
        plane2.setMilitary(true);
        plane2.setWeight(2400);
        plane2.setWingspan(30);
        plane2.setTopSpeed(700);
        plane2.setSeats(250);
        plane2.setCost(458.3);




    }
}
