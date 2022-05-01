package problemStatement_7;

class Ps7_2geNotWithInRangeException extends Exception
{
     public String toString()
     {
          return ("Age is not between 15 and 21. please ReEnter the Age");
     }
}