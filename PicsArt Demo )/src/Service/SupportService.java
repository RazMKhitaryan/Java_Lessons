package Service;

import Interfaces.Languages;
import Interfaces.SupportSkils;

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


}
