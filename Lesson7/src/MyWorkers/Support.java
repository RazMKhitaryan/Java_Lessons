package MyWorkers;

import Interfaces.CodeWriting;
import Interfaces.Languages;
import Interfaces.Movement;
import Interfaces.SupportSkils;
import Service.Worker;

public class Support extends Worker implements  SupportSkils {
    private String skils;
    private int room;
    private String languageKnowledge;

    public Support(String name, String surname, int year, boolean experience, String skils, int room, String languageKnowledge,char gender) {
        super(name, surname, year, gender, experience);
        this.skils = skils;
        this.room = room;
        this.languageKnowledge = languageKnowledge;

    }



    @Override
    public void b_To_b(boolean a) {

    }

    @Override
    public void b_To_c( boolean b) {

    }

    @Override
    public void riskManagment( boolean c) {

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
