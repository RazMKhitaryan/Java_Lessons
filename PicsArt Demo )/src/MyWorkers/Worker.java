/**
 * Worker class is parent class of Ceo, Developer,QA, and Support classes
 */
package MyWorkers;

public class Worker {

    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double experience;

    public Worker(String o) {
        String[] split1 = o.split(",");
        this.firstName = split1[0];
        this.lastName = split1[1];
        this.year = Integer.parseInt(split1[2]);
        this.gender = split1[3].charAt(0);
        this.experience = Double.parseDouble(split1[4]);

    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getYear() {
        return year;
    }


    public char getGender() {
        return gender;
    }


    public double getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "\n"+
                "Lastname: " +  lastName + "\n"+
                "Year: " +  year + "\n"+
                "Gender: "+  gender + "\n"+
                "Experience: " + experience + "\n" ;

    }
}
