public class ApCalendar
{
    private static boolean isLeapYear(int year)
    {
        return(year%4 == 0);
    }

    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;

        for(int i = year1;i<=year2;i++)
        {
            if(isLeapYear(i))
            {
                count++;
            }
        }
        return count;
    }

    private static int firstDayYear(int year)
    {

    }

    private static int dayOfYear(int month, int day, int year)
    {

    }

    public static int dayOfMonth(int month,int day,int year)
    {

    }
}
