//Date class 
//author oluwatobi 

    public class Date
    {
        //initialization
        int month;
        int day;
        int year;

        public Date(int month, int day, int year)   //constructor method
        {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public void setMonth(int format)
        {
            this.month = format; 
        }
        public void setDay(int format2)
        {
            day = format2;
        }
        public void setYear(int format3)
        {
            year = format3;
        }
        public int getMonth()
        {
            return month;
        }
        public int getDay()
        {
            return day;
        }
        public int getYear()
        {
            return year;
        }
        public String displayDate()
        {
            String Date = month + "/" + day + "/" + year;
            return Date;
        }
    }