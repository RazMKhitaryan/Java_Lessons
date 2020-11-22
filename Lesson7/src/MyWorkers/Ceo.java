package MyWorkers;


import Service.Worker;

public class Ceo extends Worker  {
    private String budget;
    private int workers;
    private String skils;
    private int room;
    private String languageKnowledge;


    public Ceo(String name, String surname, int year, char gender, boolean experience, String budget, int workers, String skils, int room, String languageKnowledge) {
        super(name, surname, year, gender, experience);
        this.budget = budget;
        this.workers = workers;
        this.skils = skils;
        this.room = room;
        this.languageKnowledge = languageKnowledge;
    }



    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Room: " + room);
        System.out.println("Workers: " + workers);
        System.out.println("Budget:" + budget);
        System.out.println("Skils: " + skils);
        System.out.println("Language Knowledge: " + languageKnowledge);
    }


    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }


}
