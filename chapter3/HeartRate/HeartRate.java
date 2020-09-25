//Program calculates a persons maximum heart rate an target heart rate
//@Oluwatobi 

    public class HeartRate
    {
        //Instance Variables
        private String firstName;
        private String lastName;
        private int month, day, year;
        private String dateOfBirth;
        private int maximumRate;
    public HeartRate(String name1, String name2, int month, int day, int year)
    {
        this.firstName = name1;
        this.lastName = name2;
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int calculateAge()
    {
        int age = 2019 - year;
        return age;
    }
    public int calculateMaxHeartRate()
    {
        int age = 2019 - year;
        int maxRate = 220 - age;
        this.maximumRate = maxRate;
        return maximumRate;
    }
    public double calculateTargetRate()
    {
        double target = (double)maximumRate * 0.5;
        
        return target;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setDateOfBirth(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        this.dateOfBirth = month + "/" + day + "/" + year;

    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String returnDOB()
    {
        dateOfBirth =  month +"/" + day + "/" + year;
        return dateOfBirth;
    }
    }
    