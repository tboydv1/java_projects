//This program test Employee class capabilities
//@Oluwatobi

    public class EmployeeTest
    {
        public static void main(String[] args)
        {
            Employee profile1 = new Employee("Johnson", "Adubunmi", 500.0);
            Employee profile2 = new Employee("Ayomide", "Omotosho", 350.0);

            System.out.printf("Employee name is %s and yearly Salary is: %f%n%n", profile1.getFirstName(), profile1.calculateYearlySal());
            System.out.printf("Employee name is %s and Yearly Salary is: %f%n%n", profile2.getFirstName(), profile2.calculateYearlySal());

            System.out.printf("%s's Yearly Salary after 10 percent raise is: %f%n%n", profile1.getFirstName(), profile1.increaseBy10Percent());
            System.out.printf("%s's Yearly Salary after 10 percent raise is: %f%n%n", profile2.getFirstName(), profile2.increaseBy10Percent());

        }
    }
