//This Program display squares and cubes of number from 1-10
//oluwatobi

    public class SquareCubes 
    {
    public static void main(String[] args)
    {

        System.out.printf("number\tsquare\tcubes\t%n%s%n", "0\t0\t0");

        int counter = 1;
        while(counter <= 10)
        {
            System.out.println(counter + "\t" + counter * counter + "\t" + counter * counter * counter);
            counter++;
        }
        
    }
}