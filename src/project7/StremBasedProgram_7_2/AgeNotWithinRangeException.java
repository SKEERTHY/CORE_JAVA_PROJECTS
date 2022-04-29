package project7.StremBasedProgram_7_2;

@SuppressWarnings("serial")
class AgeNotWithInRangeException extends Exception
{
     public String toString()
     {
          return ("Age is not between 15 and 21. please ReEnter the Age");
     }
}