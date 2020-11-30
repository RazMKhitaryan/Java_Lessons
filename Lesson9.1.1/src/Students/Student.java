package Students;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Student(String o) {
        String[] split1 = o.split(",");
        this.firstName = split1[0];
        this.lastName = split1[1];
        this.year = Integer.parseInt(split1[2]);
        this.gender = split1[3].charAt(0);
        this.mark = Double.parseDouble(split1[4]);

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }


}
