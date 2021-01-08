package Service;

import Interfaces.Languages;
import Interfaces.SupportSkils;
import MyWorkers.Developer;
import MyWorkers.Worker;

import java.util.List;

public class SupportService extends WorkerService implements Languages, SupportSkils {


    @Override
    public void englishKnowing(boolean a) {
        System.out.println("English");
    }

    @Override
    public void russianKnowing(boolean b) {
        System.out.println("Russian");
    }

    @Override
    public void armenianKnowing(boolean c) {
        System.out.println("Armenian");
    }


    @Override
    public void b_To_b(boolean a) {
        System.out.println("Business to Business support");
    }

    @Override
    public void b_To_c(boolean b) {
        System.out.println("Business to Client support");
    }

    @Override
    public void riskManagement(boolean c) {
        System.out.println("Doing odds risk management");

    }
    /**
     * From Support.txt file read and set support members in supportList
     * @param read
     * @return supportList
     */
    public static List<Worker> setSupport(List<String> read, List<Worker> supportList) {
        for (int j = 0; j < read.size(); j++) {
            supportList.add(new Developer(read.get(j)));

        }


        return supportList;

    }

}
