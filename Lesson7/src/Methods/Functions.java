package Methods;

import Interfaces.CodeWriting;
import Interfaces.Languages;
import Interfaces.Movement;


public class Functions implements Movement, Languages, CodeWriting {


    @Override
    public int fibonachi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }


    @Override
    public int factorial(int x) {
        if (x == 0 || x == 1)
            return 1;
        return x * factorial(x - 1);
    }


    @Override
    public void javaCoding(boolean a) {
        if (a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    @Override
    public void c_PlusPlus(boolean b) {

    }

    @Override
    public void javaScript(boolean c) {

    }

    @Override
    public void englishKnowing(boolean a) {

    }

    @Override
    public void russianKnowing(boolean b) {

    }

    @Override
    public void armenianKnowing(boolean c) {

    }

    @Override
    public void toGoToWork(boolean a) {

    }

    @Override
    public void toGoToHome(boolean b) {

    }

    @Override
    public void ToDrive(boolean c) {

    }

    @Override
    public void beingMarried(boolean a) {

    }

    @Override
    public void havingFamili(boolean b) {

    }

    @Override
    public void havingCar(boolean c) {

    }


}
