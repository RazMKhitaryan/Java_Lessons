package Service;

import Interfaces.CodeWriting;
import Interfaces.Languages;
import MyWorkers.Ceo;
import MyWorkers.Developer;
import MyWorkers.Worker;

import java.util.List;


public class DeveloperService extends WorkerService implements CodeWriting, Languages {

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


    /**
     * From Developer.txt file read and set Developer members in devList
     * @param read
     * @param devList
     * @return
     */
    public static List<Worker> setDeveloper(List<String> read, List<Worker> devList){
        for (int j = 0; j < read.size(); j++) {
            devList.add(new Developer(read.get(j)));

        }


        return devList;

    }
}
