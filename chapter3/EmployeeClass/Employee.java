//Employee class 
//@ author Oluwatobi 
    public class Employee 
    {
        //Initialization
        String firstName;
        String lastName;
        double monthlySalary;

        public Employee(String firstName, String lastName, double salary)
        {       
            this.firstName = firstName;
            this.lastName = lastName;

            if(salary > 0.0)
              this.monthlySalary = salary;

        }

        public void setFirstName(String name1)
        {
            this.firstName = name1;
        }
        public void setLastName(String name2)
        {
            this.lastName = name2;
        }
        public void setMonthlySalary(double salary)
        {
            if(salary > 0.0)
                 monthlySalary = salary;
        }
        public String getFirstName()
        {
            return firstName;
        }
        public String getLastName()
        {
            return lastName;
        }
        public double getMonthlySalary()
        {
            return monthlySalary;
        }
        public double calculateYearlySal()
        {
            double yearly = monthlySalary * 12;
            return yearly;
        }
        public double increaseBy10Percent()
        {
            double percent = monthlySalary * 1.1;
            double newYearly = percent * 12;
            return newYearly;
        }
        

        

       
    }