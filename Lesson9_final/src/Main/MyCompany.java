package Main;

import Service.*;

import java.util.Arrays;
import java.util.Scanner;

public class MyCompany {

    public static void main(String[] args) throws Exception {
        Scanner sss = new Scanner(System.in);


        boolean isMenuActive = true;
        while (isMenuActive) {

            System.out.println("-----Hi,i am Smart Bot-----");
            System.out.println("-----Press 1.if you want to see information about me");
            System.out.println("-----Press 2.if you want to see information about MyCompany's workers ");
            System.out.println("-----Press 3. Exit");

            int command = sss.nextInt();
            switch (command) {


                case 1:
                    System.out.println("\n Hi i am a bot of the company.\n I was created in 2020 to improve the work of the company.\n " +
                            "I can add and provide information about all employees.");
                    System.out.println();
                    break;
//---------------------------------Page2---------------------------------------------
                case 2:


                    boolean isMenuActive2 = true;
                    while (isMenuActive2) {

                        System.out.println("-----Smart Bot-----");
                        System.out.println("-----Press 1.Ceo");
                        System.out.println("-----Press 2.Developer ");
                        System.out.println("-----Press 3.QA Specialist ");
                        System.out.println("-----Press 4.Support Specialist ");
                        System.out.println("-----Press 5.Previous Page");

                        int command2 = sss.nextInt();
                        switch (command2) {

//------------------------Ceo------------------------------
                            case 1:

                                String[] read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Ceo.txt");
                                String s = Arrays.toString(read);

                                StringBuffer y = new StringBuffer(s);

                                String t = y.delete(0, 1).toString();
                                String q = y.delete(y.length() - 1, y.length()).toString();


                                String[] split1 = q.split(",", q.length());
                                String f1 = " ";
                                int a = split1.length / 5;
                                String[] f2 = new String[a];
                                int count = 0;
                                for (int j = 0; j < split1.length; j++) {
                                    int x = j / 5;
                                    if (j % 5 == 4) {
                                        f1 = f1.concat(split1[j]);
                                        f2[x] = f1;
                                        f1 = "";
                                        count = 0;

                                    } else {
                                        f1 = f1.concat(split1[j] + ",");
                                        count++;

                                    }

                                }

                                if (q.isEmpty()) {
                                    CeoService.createCeo();


                                }

                                boolean isMenuActive3 = true;
                                while (isMenuActive3) {

                                    System.out.println("-----Smart Bot-----");
                                    System.out.println("1.Print Ceo information");
                                    System.out.println("2.Ceo skills");
                                    System.out.println("3.Personal life");
                                    System.out.println("4.Create new Ceo");
                                    System.out.println("5.Previous Page");

                                    int command3 = sss.nextInt();
                                    switch (command3) {
                                        case 1:
                                            CeoService.printAllWorkers(f2);
                                            break;
                                        case 2:
                                            new CeoService().javaCoding(true);
                                            new CeoService().c_PlusPlus(true);
                                            new CeoService().javaScript(true);
                                            new CeoService().englishKnowing(true);
                                            new CeoService().russianKnowing(true);
                                            new CeoService().armenianKnowing(true);

                                            break;
                                        case 3:
                                            new CeoService().beingMarried(true);
                                            new CeoService().havingFamili(true);
                                            new CeoService().ToDrive(true);
                                            new CeoService().havingCar(true);
                                            new CeoService().toGoToWork(true);

                                            break;
                                        case 4:
                                            CeoService.createCeo();
                                            break;
                                        case 5:
                                            isMenuActive3 = false;
                                            break;
                                        default:
                                            System.out.println("Invalid command");
                                    }
                                }

                                break;

//------------------------------------------------------------

//---------------------------Developer--------------------------------

                            case 2:

                                read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Developer.txt");
                                s = Arrays.toString(read);

                                y = new StringBuffer(s);

                                t = y.delete(0, 1).toString();
                                q = y.delete(y.length() - 1, y.length()).toString();


                                split1 = q.split(",", q.length());
                                f1 = " ";
                                a = split1.length / 5;
                                f2 = new String[a];
                                count = 0;
                                for (int j = 0; j < split1.length; j++) {
                                    int x = j / 5;
                                    if (j % 5 == 4) {
                                        f1 = f1.concat(split1[j]);
                                        f2[x] = f1;
                                        f1 = "";
                                        count = 0;

                                    } else {
                                        f1 = f1.concat(split1[j] + ",");
                                        count++;

                                    }

                                }
                                if (q.isEmpty()) {
                                    DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Developer.txt");
                                    DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Developer.txt");
                                    DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Developer.txt");


                                }


                                boolean isMenuActive4 = true;
                                while (isMenuActive4) {

                                    System.out.println("-----Smart Bot-----");
                                    System.out.println("1.Print all Developers");
                                    System.out.println("2.Print all male Developers");
                                    System.out.println("3.Print Developer who has experience less than 1 year  ");
                                    System.out.println("4.Print female Developer who has maximum experience");
                                    System.out.println("5.Print male Developers who are old 21");
                                    System.out.println("6.Print female Developers who are old 21");
                                    System.out.println("7.Print female smallest Developer");
                                    System.out.println("8.Print male smallest Developer");
                                    System.out.println("9.Developers skills");
                                    System.out.println("10. Create new Developer");
                                    System.out.println("11. Previous Page");

                                    int command4 = sss.nextInt();
                                    switch (command4) {

                                        case 1:
                                            DeveloperService.printAllWorkers(f2);

                                            break;

                                        case 2:
                                            DeveloperService.printAllMaleWorkers(f2);
                                            break;

                                        case 3:
                                            DeveloperService.printMinExpOfWorkers(f2);

                                            break;

                                        case 4:
                                            DeveloperService.printFemaleWorkersBiggestExp(f2);
                                            break;

                                        case 5:
                                            DeveloperService.printMaleWorkerGreatThan21(f2);
                                            break;


                                        case 6:
                                            DeveloperService.printFemaleWorkerGreatThan21(f2);

                                            break;


                                        case 7:
                                            DeveloperService.printFemaleSmallestWorker(f2);
                                            break;
                                        case 8:
                                            DeveloperService.printMaleSmallestWorkers(f2);
                                            break;

                                        case 9:
                                            new DeveloperService().javaCoding(true);
                                            new DeveloperService().c_PlusPlus(true);
                                            new DeveloperService().javaScript(true);
                                            new DeveloperService().englishKnowing(true);
                                            new DeveloperService().armenianKnowing(true);

                                            break;
                                        case 10:
                                            DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Developer.txt");

                                            break;

                                        case 11:

                                            isMenuActive4 = false;

                                            break;

                                        default:
                                            System.out.println("invalid command");
                                            break;

                                    }
                                }

                                break;

                            //------------------------------------------------------------------------

//-------------------------------------QA_Specialit--------------------------------
                            case 3:
                                read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\QA_specialist.txt");
                                s = Arrays.toString(read);

                                y = new StringBuffer(s);

                                t = y.delete(0, 1).toString();
                                q = y.delete(y.length() - 1, y.length()).toString();


                                split1 = q.split(",", q.length());
                                f1 = " ";
                                a = split1.length / 5;
                                f2 = new String[a];
                                count = 0;
                                for (int j = 0; j < split1.length; j++) {
                                    int x = j / 5;
                                    if (j % 5 == 4) {
                                        f1 = f1.concat(split1[j]);
                                        f2[x] = f1;
                                        f1 = "";
                                        count = 0;

                                    } else {
                                        f1 = f1.concat(split1[j] + ",");
                                        count++;

                                    }

                                }
                                if (q.isEmpty()) {
                                    QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\QA_specialist.txt");
                                    QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\QA_specialist.txt");
                                    QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\QA_specialist.txt");
                                }


                                boolean isMenuActive5 = true;
                                while (isMenuActive5) {


                                    System.out.println("-----Smart Bot-----");
                                    System.out.println("1.Print all QA_Specialists");
                                    System.out.println("2.Print all male QA_Specialists");
                                    System.out.println("3.Print QA_Specialist who has experience less than 1 year  ");
                                    System.out.println("4.Print female QA_Specialist who has maximum experience");
                                    System.out.println("5.Print male QA_Specialists who are old 21");
                                    System.out.println("6.Print female QA_Specialists who are old 21");
                                    System.out.println("7.Print female smallest QA_Specialist");
                                    System.out.println("8.Print male smallest QA_Specialist");
                                    System.out.println("9.QA_Specialists skills");
                                    System.out.println("10. Create new QA_Specialist");
                                    System.out.println("11. Previous Page");

                                    int command5 = sss.nextInt();
                                    switch (command5) {
                                        case 1:
                                            QA_SpecialistService.printAllWorkers(f2);

                                            break;

                                        case 2:
                                            QA_SpecialistService.printAllMaleWorkers(f2);
                                            break;

                                        case 3:
                                            QA_SpecialistService.printMinExpOfWorkers(f2);

                                            break;

                                        case 4:
                                            QA_SpecialistService.printFemaleWorkersBiggestExp(f2);
                                            break;

                                        case 5:
                                            QA_SpecialistService.printMaleWorkerGreatThan21(f2);
                                            break;


                                        case 6:
                                            QA_SpecialistService.printFemaleWorkerGreatThan21(f2);

                                            break;


                                        case 7:
                                            QA_SpecialistService.printFemaleSmallestWorker(f2);
                                            break;
                                        case 8:
                                            QA_SpecialistService.printMaleSmallestWorkers(f2);
                                            break;

                                        case 9:
                                            new QA_SpecialistService().doingTests(true);
                                            new QA_SpecialistService().javaCoding(true);
                                            new QA_SpecialistService().englishKnowing(true);
                                            new QA_SpecialistService().armenianKnowing(true);

                                            break;
                                        case 10:
                                            QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\QA_specialist.txt");
                                            break;

                                        case 11:

                                            isMenuActive5 = false;

                                            break;

                                        default:
                                            System.out.println("invalid command");
                                            break;

                                    }
                                }

                                break;

//---------------------------------------------------------------------------
//----------------------------------Support_Specialist-----------------------------
                            case 4:
                                read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Support.txt");
                                s = Arrays.toString(read);

                                y = new StringBuffer(s);

                                t = y.delete(0, 1).toString();
                                q = y.delete(y.length() - 1, y.length()).toString();


                                split1 = q.split(",", q.length());
                                f1 = " ";
                                a = split1.length / 5;
                                f2 = new String[a];
                                count = 0;
                                for (int j = 0; j < split1.length; j++) {
                                    int x = j / 5;
                                    if (j % 5 == 4) {
                                        f1 = f1.concat(split1[j]);
                                        f2[x] = f1;
                                        f1 = "";
                                        count = 0;

                                    } else {
                                        f1 = f1.concat(split1[j] + ",");
                                        count++;

                                    }

                                }
                                if (q.isEmpty()) {
                                    SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Support.txt");
                                    SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Support.txt");
                                    SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Support.txt");


                                }

                                boolean isMenuActive6 = true;
                                while (isMenuActive6) {


                                    System.out.println("-----Smart Bot-----");
                                    System.out.println("1.Print all Support Specialists");
                                    System.out.println("2.Print all male Support Specialists");
                                    System.out.println("3.Print Support Specialist who has experience less than 1 year");
                                    System.out.println("4.Print female Support Specialist who has maximum experience");
                                    System.out.println("5.Print male Support Specialists who are old 21");
                                    System.out.println("6.Print female Support Specialists who are old 21");
                                    System.out.println("7.Print female smallest Support Specialist");
                                    System.out.println("8.Print male smallest Support Specialist");
                                    System.out.println("9.Support Specialists skills");
                                    System.out.println("10. Create new Support Specialist");
                                    System.out.println("11. Previous Page");

                                    int command6 = sss.nextInt();
                                    switch (command6) {

                                        case 1:
                                            SupportService.printAllWorkers(f2);

                                            break;

                                        case 2:
                                            SupportService.printAllMaleWorkers(f2);
                                            break;

                                        case 3:
                                            SupportService.printMinExpOfWorkers(f2);

                                            break;

                                        case 4:
                                            SupportService.printFemaleWorkersBiggestExp(f2);
                                            break;

                                        case 5:
                                            SupportService.printMaleWorkerGreatThan21(f2);
                                            break;


                                        case 6:
                                            SupportService.printFemaleWorkerGreatThan21(f2);

                                            break;


                                        case 7:
                                            SupportService.printFemaleSmallestWorker(f2);
                                            break;
                                        case 8:
                                            SupportService.printMaleSmallestWorkers(f2);
                                            break;
                                        case 9:
                                            new SupportService().englishKnowing(true);
                                            new SupportService().russianKnowing(true);
                                            new SupportService().armenianKnowing(true);
                                            new SupportService().b_To_b(true);
                                            new SupportService().b_To_c(true);
                                            new SupportService().riskManagement(true);
                                            break;

                                        case 10:
                                            SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\Lesson9_final\\src\\Base\\Support.txt");
                                            break;

                                        case 11:

                                            isMenuActive6 = false;

                                            break;

                                        default:
                                            System.out.println("invalid command");
                                            break;
                                    }
                                }

                                break;
//--------------------------------------------------------------------------------------


                            case 5:
                                isMenuActive2 = false;
                                break;

                            default:
                                System.out.println("Invalid command");
                                break;


                        }

                    }


                    break;

//-------------------------------------------------------------------------------------------
                case 3:

                    isMenuActive = false;
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("invalid command");
                    break;
            }

        }
    }
}
