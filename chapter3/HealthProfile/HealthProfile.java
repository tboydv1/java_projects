import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

//Health profile program 
//oluwatobi 

     public class HealthProfile
     {
        // initilaizaation 
        String firstName;
        String lastName;
        String gender;
        String dateOfBirth;
        int year;
        int maximumRate;
        int weightInPounds;
        int heightInInches;
        public HealthProfile(String firstName, String lastName, String gender, int month,
         int day, int year, int weight, int height)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.dateOfBirth = month + "-" + day + "-" + year;
            this.year = year;
            this.weightInPounds = weight;
            this.heightInInches = height;
        }
        public void setFirstName(String name)
        {
            this.firstName = name;
        }
        public void setLastName(String name)
        {
            this.lastName = name;
        }
        public void setGender(String type)
        {
            this.gender = type;
        }
        public void setDateOfBirth(int month, int day, int year)
        {
            this.dateOfBirth = month + "-" + day + "-" + year;   
            this.year = year;
        }
        public String getFirstName()
        {
            return firstName;
        }    
        public String getLastName()
        {
            return lastName;
        }
        public String getGender()
        {
            return gender;
        }
        public String returnDOB()
        {
            return dateOfBirth;
        }
        public void setWeight(int weight)
        {
            weightInPounds = weight;
        }
        public int getWeight()
        {
            return weightInPounds;
        }
        public void setHeight(int height)
        {
            heightInInches = height;
        }
        public int getHeight()
        {
            return heightInInches;
        }
        public int calculateAge()
        {
        int age = 2019 - year;
        return age;
        }
        public int calculateMaxHeartRate() //Maximum heart rate
        {
        int age = 2019 - year;
        int maxRate = 220 - age;
        this.maximumRate = maxRate;
        return maximumRate;
        }
        public double calculateTargetRate() //Target Heart Rate 
        {
            double target = (double)maximumRate * 0.5;
            
            return target;
        }
        public int calculateBMI() //body max index
        {
            int BMI = (weightInPounds * 703) / heightInInches * heightInInches;
            return BMI;
        }



}