package MyWorkers;

import Service.Worker;

public class QA_specialist extends Worker {
    private String skils;
    private int room;
    private String languageKnowledge;

    public QA_specialist(String name, String surname, int year, boolean experience, String skils, int room, String languageKnowledge,char gender) {
        super(name, surname, year, gender, experience);
        this.skils = skils;
        this.room = room;
        this.languageKnowledge = languageKnowledge;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Room: " + room);
        System.out.println("Skils: " + skils);
        System.out.println("Language Knowledge: " + languageKnowledge);
    }


    public String getSkils() {
        return skils;
    }

    public void setSkils(String skils) {
        this.skils = skils;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getLanguageKnowledge() {
        return languageKnowledge;
    }

    public void setLanguageKnowledge(String languageKnowledge) {
        this.languageKnowledge = languageKnowledge;
    }
}
