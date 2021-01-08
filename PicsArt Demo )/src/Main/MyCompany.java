/**
 * Smart Bot
 * Smart Bot is only for Company`s founder
 * Smart bot improving work in the company, with which you can easily work with workers of the company,
 * see male or female workers, experience , skills, and all information about workers
 * the program inputs are scanners
 * this bot works with Ceo.txt ,Developer.txt ,QA_Specialist.txt ,Support.txt ,Base.txt: text files
 * languages English or Armenian, 1 or 2
 * @author Razmik Mkhitaryan
 * @version 2.0
 * @since 2021-01-07
 */
package Main;
import MyWorkers.Worker;
import Service.*;
import Users.User;
import Users.UserService;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MyCompany {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        String language = "";
        System.out.println("----Smart Bot----");
        System.out.println(" Press 1.For English");
        System.out.println(" Press 2.For Armenian");
        int lang = sss.nextInt();
        switch (lang) {
            case 1:
                language = "true";
                break;
            case 2:
                language = "false";
                break;
            default:
                System.out.println("Wrong Input");
                System.out.println("Default language is English");
                break;

        }

        boolean isMenuActive = true;
        while (isMenuActive) {
            if (language == "true") {
                System.out.println("-----Hi,i am Smart Bot-----");
                System.out.println("-----Press 1.if you want to see information about me");
                System.out.println("-----Press 2.if you want to work with me ");
                System.out.println("-----Press 3. Exit");

            } else {
                System.out.println("-----Բարև ես Սմարթ Բոտն եմ-----");
                System.out.println("-----Սեղմել 1.Ինձ հետ ծանոթանալու համար-----");
                System.out.println("-----Սեղմել 2.Ինձ հետ աշխատելու համար -----");
                System.out.println("-----Սեղմել 3.Ծրագիրը փակելու համար -----");
            }

            int command = sss.nextInt();
            switch (command) {
                case 1:
                    if (language == "true"){
                    System.out.println("\n Hi i am a bot of the company.\n I was created in 2020 for only  company`s founder \n " + "I am using for to make your work easily \n" +
                            " I can add and provide information about all employees.");
                    System.out.println();}
                    else{
                        System.out.println("\n Բարև ես կազմակերպության բոտն են և ստեղծվել եմ 2020թ,\n Ես կօգնեմ Քեզ հեշտությամբ աշխատել բոլոր աշխատակիցների տվյալների հետ \n"+
                                " Ես կարող եմ աշխատանքի ընդունել և հեռացնել աշխատողների:");
                        System.out.println();
                    }
                    break;
//---------------------------------Page2--------Login-------------------------------------
                case 2:

                    boolean stop = true;
                    while (stop) {
                        if (language == "true"){
                        System.out.println("Press 1. for Sign In");
                        System.out.println("Press 2. for Create Account");
                        System.out.println("Press 3. Previous Page");}
                        else{
                            System.out.println("-----Սեղմել 1.Ծրագիր մուտք գործելու համար  -----");
                            System.out.println("-----Սեղմել 2.Ծրագիրում գրանցվելու համար  -----");
                            System.out.println("-----Սեղմել 3.Նախորդ էջ -----");

                        }
                        Scanner scanner = new Scanner(System.in);
                        int comman = scanner.nextInt();
                        List<String> st = new LinkedList<>();
                        List<User> userList = new LinkedList<>();
                        switch (comman) {
                            case 1:
                               if (language == "true"){
                                System.out.println("Input Login");}
                               else{
                                   System.out.println("Մուտքագրիր Լոգին");
                               }
                                String login = scanner.next();


                                if (language == "true"){
                                System.out.println("Input Password");}
                                else{
                                    System.out.println("Մուտքագրել Գաղտնաբառ");
                                }
                                String password = scanner.next();
                                List<User> userList1 = UserService.setUser(st, userList);
                                boolean b = UserService.logIn(login, password, userList1,language);
                                if (b) {

                                    boolean isMenuActive2 = true;
                                    while (isMenuActive2) {
                                        if (language == "true"){
                                        System.out.println("-----Smart Bot-----");
                                        System.out.println("-----Press 1.Ceo");
                                        System.out.println("-----Press 2.Developer ");
                                        System.out.println("-----Press 3.QA Specialist ");
                                        System.out.println("-----Press 4.Support Specialist ");
                                        System.out.println("-----Press 5.Previous Page");}
                                        else{
                                            System.out.println("-----Սմարթ Բոտ -----");
                                            System.out.println("-----Սեղմել 1.Տնօրեն");
                                            System.out.println("-----Սեղմել 2.Ծրագրավորող");
                                            System.out.println("-----Սեղմել 3.Թեստավորող");
                                            System.out.println("-----Սեղմել 4.Աջակցության թիմ");
                                            System.out.println("-----Սեղմել 5.Նախորդ էջ");
                                        }

                                        int command2 = sss.nextInt();
                                        switch (command2) {
//------------------------Ceo------------------------------
                                            case 1:
                                                List<String> read = null;
                                                try {
                                                    read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Ceo.txt");
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                                List<Worker> ceoList = new LinkedList<>();
                                                CeoService.setCeo(read, ceoList);
                                                if (ceoList.isEmpty()) {
                                                    CeoService.createCeo(language);
                                                }

                                                boolean isMenuActive3 = true;
                                                while (isMenuActive3) {
                                                    if (language == "true"){
                                                    System.out.println("-----Smart Bot-----");
                                                    System.out.println("1.Print Ceo information");
                                                    System.out.println("2.Ceo skills");
                                                    System.out.println("3.Create new Ceo");
                                                    System.out.println("4.Previous Page");}
                                                    else{
                                                        System.out.println("-----Սմարթ Բոտ -----");
                                                        System.out.println("Սեղմել 1.Տնօրենի մասին տեղեկություն");
                                                        System.out.println("Սեղմել 2.Տնօրենի հմտություններ");
                                                        System.out.println("Սեղմել 3.Ստեղծել նոր տնօրեն");
                                                        System.out.println("Սեղմել 4.Նախորդ էջ");

                                                    }
                                                    int command3 = sss.nextInt();
                                                    switch (command3) {
                                                        case 1:
                                                            WorkerService.printAllWorkers(ceoList,language);
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
                                                            CeoService.createCeo(language);
                                                            break;
                                                        case 4:
                                                            isMenuActive3 = false;
                                                            break;
                                                        default:
                                                            if (language == "true"){
                                                                System.out.println("Invalid command");}
                                                            else{
                                                                System.out.println("Սխալ հրաման");
                                                            }
                                                    }
                                                }
                                                break;
//------------------------------------------------------------

//---------------------------Developer--------------------------------
                                            case 2:
                                                read = null;
                                                try {
                                                    read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Developer.txt");
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                                List<Worker> devList = new LinkedList<>();
                                                DeveloperService.setDeveloper(read, devList);
                                                if (devList.isEmpty()) {
                                                    DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Developer.txt",language);
                                                    DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Developer.txt",language);
                                                    DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Developer.txt",language);
                                                }

                                                boolean isMenuActive4 = true;
                                                while (isMenuActive4) {
                                                    if (language == "true"){
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
                                                    System.out.println("11. Delete Developer");
                                                    System.out.println("12. Previous Page");}
                                                    else{
                                                        System.out.println("-----Սմարթ Բոտ -----");
                                                        System.out.println("Սեղմել 1.Տպել բոլոր ծրագրավորողներին");
                                                        System.out.println("Սեղմել 2.Տպել բոլոր արական սեռի ծրագրավորողներին");
                                                        System.out.println("Սեղմել 3.Տպել բոլոր ծրագրավորողներին ովքեր 1 տարուց պակաս են աշխատել ");
                                                        System.out.println("Սեղմել 4.Տպել իգական սեռի ամենաերկար աշխատած մարդուն");
                                                        System.out.println("Սեղմել 5.Տպել արական սեռի 21-ից բարձր ծրագրավորողներին");
                                                        System.out.println("Սեղմել 6.Տպել իգական սեռի 21-ից բարձր ծրագրավորողներին");
                                                        System.out.println("Սեղմել 7.Տպել իգական սեռի ամենափոքր ծրագրավորողին");
                                                        System.out.println("Սեղմել 8.Տպել արական սեռի ամենափոքր ծրագրավորողին");
                                                        System.out.println("Սեղմել 9.Ծրագրավորողների հմտություններ");
                                                        System.out.println("Սեղմել 10.Ընդունել նոր Ծրագրավորող");
                                                        System.out.println("Սեղմել 11.Հեռացնել աշխատանքից ծրագրավորողին");
                                                        System.out.println("Սեղմել 12.Նախորդ էջ");
                                                    }
                                                    int command4 = sss.nextInt();
                                                    switch (command4) {
                                                        case 1:
                                                            WorkerService.printAllWorkers(devList,language);
                                                            break;
                                                        case 2:
                                                            WorkerService.printAllMaleWorkers(devList,language);
                                                            break;
                                                        case 3:
                                                            WorkerService.printMinExpOfWorkers(devList,language);
                                                            break;
                                                        case 4:
                                                            WorkerService.printFemaleWorkersBiggestExp(devList,language);
                                                            break;
                                                        case 5:
                                                            WorkerService.printMaleWorkerGreatThan21(devList,language);
                                                            break;
                                                        case 6:
                                                            WorkerService.printFemaleWorkerGreatThan21(devList,language);
                                                            break;
                                                        case 7:
                                                            WorkerService.printFemaleSmallestWorker(devList,language);
                                                            break;
                                                        case 8:
                                                            WorkerService.printMaleSmallestWorkers(devList,language);
                                                            break;
                                                        case 9:
                                                            new DeveloperService().javaCoding(true);
                                                            new DeveloperService().c_PlusPlus(true);
                                                            new DeveloperService().javaScript(true);
                                                            new DeveloperService().englishKnowing(true);
                                                            new DeveloperService().armenianKnowing(true);
                                                            break;
                                                        case 10:
                                                            DeveloperService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Developer.txt",language);
                                                            break;
                                                        case 11:
                                                            WorkerService.deleteWorker("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Developer.txt", devList,language);
                                                            break;
                                                        case 12:
                                                            isMenuActive4 = false;
                                                            break;
                                                        default:
                                                            if (language == "true"){
                                                                System.out.println("invalid command");
                                                            }else{
                                                                System.out.println("Սխալ հրաման");
                                                            }

                                                            break;
                                                    }
                                                }
                                                break;
                                            //------------------------------------------------------------------------

//-------------------------------------QA_Specialit--------------------------------
                                            case 3:
                                                read = null;
                                                try {
                                                    read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\QA_specialist.txt");
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                                List<Worker> qaList = new LinkedList<>();
                                                QA_SpecialistService.setQA(read, qaList);
                                                if (qaList.isEmpty()) {
                                                    QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\QA_specialist.txt",language);
                                                    QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\QA_specialist.txt",language);
                                                    QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\QA_specialist.txt",language);
                                                }

                                                boolean isMenuActive5 = true;
                                                while (isMenuActive5) {
                                                    if (language == "true"){
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
                                                    System.out.println("11. Delete QA_Specialist");
                                                    System.out.println("12. Previous Page");}
                                                    else{
                                                        System.out.println("-----Սմարթ Բոտ -----");
                                                        System.out.println("Սեղմել 1.Տպել բոլոր թեստովորողներին");
                                                        System.out.println("Սեղմել 2.Տպել բոլոր արական սեռի թեստովորողներին");
                                                        System.out.println("Սեղմել 3.Տպել բոլոր թեստովորողներին ովքեր 1 տարուց պակաս են աշխատել ");
                                                        System.out.println("Սեղմել 4.Տպել իգական սեռի ամենաերկար աշխատած մարդուն");
                                                        System.out.println("Սեղմել 5.Տպել արական սեռի 21-ից բարձր թեստովորողներին");
                                                        System.out.println("Սեղմել 6.Տպել իգական սեռի 21-ից բարձր թեստովորողներին");
                                                        System.out.println("Սեղմել 7.Տպել իգական սեռի ամենափոքր թեստովորողին");
                                                        System.out.println("Սեղմել 8.Տպել արական սեռի ամենափոքր թեստովորողին");
                                                        System.out.println("Սեղմել 9.Թեստովորողների հմտություններ");
                                                        System.out.println("Սեղմել 10.Ընդունել նոր թեստովորող");
                                                        System.out.println("Սեղմել 11.Հեռացնել աշխատանքից թեստովորողին");
                                                        System.out.println("Սեղմել 12.Նախորդ էջ");
                                                    }
                                                    int command5 = sss.nextInt();
                                                    switch (command5) {
                                                        case 1:
                                                            WorkerService.printAllWorkers(qaList,language);
                                                            break;
                                                        case 2:
                                                            WorkerService.printAllMaleWorkers(qaList,language);
                                                            break;
                                                        case 3:
                                                            WorkerService.printMinExpOfWorkers(qaList,language);
                                                            break;
                                                        case 4:
                                                            WorkerService.printFemaleWorkersBiggestExp(qaList,language);
                                                            break;
                                                        case 5:
                                                            WorkerService.printMaleWorkerGreatThan21(qaList,language);
                                                            break;
                                                        case 6:
                                                            WorkerService.printFemaleWorkerGreatThan21(qaList,language);
                                                            break;
                                                        case 7:
                                                            WorkerService.printFemaleSmallestWorker(qaList,language);
                                                            break;
                                                        case 8:
                                                            WorkerService.printMaleSmallestWorkers(qaList,language);
                                                            break;
                                                        case 9:
                                                            new QA_SpecialistService().doingTests(true);
                                                            new QA_SpecialistService().javaCoding(true);
                                                            new QA_SpecialistService().englishKnowing(true);
                                                            new QA_SpecialistService().armenianKnowing(true);
                                                            break;
                                                        case 10:
                                                            QA_SpecialistService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\QA_specialist.txt",language);
                                                            break;
                                                        case 11:
                                                            WorkerService.deleteWorker("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\QA_specialist.txt", qaList,language);
                                                            break;
                                                        case 12:
                                                            isMenuActive5 = false;
                                                            break;
                                                        default:
                                                            if (language == "true"){
                                                                System.out.println("invalid command");
                                                            }else{
                                                                System.out.println("Սխալ հրաման");
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
//---------------------------------------------------------------------------
//----------------------------------Support_Specialist-----------------------------
                                            case 4:
                                                read = null;
                                                try {
                                                    read = FileService.read("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Support.txt");
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                }
                                                List<Worker> supportList = new LinkedList<>();
                                                SupportService.setSupport(read, supportList);

                                                if (supportList.isEmpty()) {
                                                    SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Support.txt",language);
                                                    SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Support.txt",language);
                                                    SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Support.txt",language);
                                                }
                                                boolean isMenuActive6 = true;
                                                while (isMenuActive6) {
                                                    if (language == "true"){
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
                                                    System.out.println("11. Delete Support Specialist");
                                                    System.out.println("12. Previous Page");}
                                                    else{
                                                        System.out.println("-----Սմարթ Բոտ -----");
                                                        System.out.println("Սեղմել 1.Տպել բոլոր աջակցության թմի աշխատակիցներին");
                                                        System.out.println("Սեղմել 2.Տպել բոլոր արական սեռի աջակցության թմի աշխատակիցներին");
                                                        System.out.println("Սեղմել 3.Տպել բոլոր աջակցության թմի աշխատակիցներին ովքեր 1 տարուց պակաս են աշխատել ");
                                                        System.out.println("Սեղմել 4.Տպել իգական սեռի ամենաերկար աշխատած մարդուն");
                                                        System.out.println("Սեղմել 5.Տպել արական սեռի 21-ից բարձր աջակցության թմի աշխատակիցներին");
                                                        System.out.println("Սեղմել 6.Տպել իգական սեռի 21-ից բարձր աջակցության թմի աշխատակիցներին");
                                                        System.out.println("Սեղմել 7.Տպել իգական սեռի ամենափոքր աջակցության թմի աշխատակցին");
                                                        System.out.println("Սեղմել 8.Տպել արական սեռի ամենափոքր աջակցության թմի աշխատակցին");
                                                        System.out.println("Սեղմել 9.Աջակցության թմի աշխատակիցների հմտություններ");
                                                        System.out.println("Սեղմել 10.Ընդունել նոր աջակցության թմի աշխատակից");
                                                        System.out.println("Սեղմել 11.Հեռացնել աշխատանքից աջակցության թմի աշխատակից");
                                                        System.out.println("Սեղմել 12.Նախորդ էջ");
                                                    }
                                                    int command6 = sss.nextInt();
                                                    switch (command6) {
                                                        case 1:
                                                            WorkerService.printAllWorkers(supportList,language);
                                                            break;
                                                        case 2:
                                                            WorkerService.printAllMaleWorkers(supportList,language);
                                                            break;
                                                        case 3:
                                                            WorkerService.printMinExpOfWorkers(supportList,language);
                                                            break;
                                                        case 4:
                                                            WorkerService.printFemaleWorkersBiggestExp(supportList,language);
                                                            break;
                                                        case 5:
                                                            WorkerService.printMaleWorkerGreatThan21(supportList,language);
                                                            break;
                                                        case 6:
                                                            WorkerService.printFemaleWorkerGreatThan21(supportList,language);
                                                            break;
                                                        case 7:
                                                            WorkerService.printFemaleSmallestWorker(supportList,language);
                                                            break;
                                                        case 8:
                                                            WorkerService.printMaleSmallestWorkers(supportList,language);
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
                                                            SupportService.createPerson("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Support.txt",language);
                                                            break;
                                                        case 11:
                                                            WorkerService.deleteWorker("D:\\Desktop\\Lessons\\Lessons\\PicsArt Demo )\\src\\Base\\Support.txt", supportList,language);
                                                            break;
                                                        case 12:
                                                            isMenuActive6 = false;
                                                            break;
                                                        default:
                                                            if (language == "true"){
                                                                System.out.println("invalid command");
                                                            }else{
                                                                System.out.println("Սխալ հրաման");
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 5:
                                                isMenuActive2 = false;
                                                break;
                                            default:
                                                if (language == "true"){
                                                    System.out.println("invalid command");
                                                }else{
                                                    System.out.println("Սխալ հրաման");
                                                }
                                                break;
                                        }
                                    }
                                }
                                break;
//---------------------------------------Page 2-------Login--------------------------------------------------
                            case 2:
                                List<User> users = UserService.setUser(st, userList);
                                UserService.createUser(users,language);
                                break;
                            case 3:
                                stop = false;
                                break;
                            default:
                                if (language == "true"){
                                    System.out.println("invalid command");
                                }else{
                                    System.out.println("Սխալ հրաման");
                                }
                                break;
                        }
                    }
                    break;
//------------------------------------Page 1-------------------------------------------------------
                case 3:
                    if (language == "true"){
                        System.out.println("Bye");
                    }else{
                        System.out.println("Հաջողություն");
                    }
                    isMenuActive = false;
                    break;
                default:
                    if (language == "true"){
                        System.out.println("invalid command");
                    }else{
                        System.out.println("Սխալ հրաման");
                    }
                    break;
            }
        }
        language = "";
    }
}

