package Service;

import Interfaces.CodeWriting;
import Interfaces.Languages;
import MyWorkers.Developer;
import MyWorkers.Worker;

import java.util.List;


public class QA_SpecialistService extends WorkerService implements CodeWriting, Languages {

    @Override
    public void javaCoding(boolean a) {
        System.out.println("Java");
    }

    @Override
    public void c_PlusPlus(boolean b) {
        System.out.println("C++");
    }

    @Override
    public void javaScript(boolean c) {
        System.out.println("JavaScript");
    }

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

    public void doingTests(boolean c) {
        System.out.println("Test automation");
        System.out.println("Write test cases ");
        System.out.println("TestComplete");
        System.out.println("AzureDevOps");
        System.out.println("Selenium & Appium");
    }
    /**
     * From QA_specialist.txt file read and set QA members in qaList
     * @param read
     * @return qaList
     */
    public static List<Worker> setQA(List<String> read, List<Worker> qaList) {
        for (int j = 0; j < read.size(); j++) {
            qaList.add(new Developer(read.get(j)));

        }


        return qaList;

    }

}
