
class findingDay {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

       int century_code;
       int month_array[] = {0,1,4,4,0,2,5,0,3,6,1,4,6};
       
       String[] findDay = { "SUNDAY", "MONDAY","TUESDAY" ,"WEDNESDAY",    "THURSDAY" , "FRIDAY",  "SATURDAY" };
       
            int cent = year / 100;
           
            if(cent%4 == 0)
                    century_code = 6;
           else if(cent%4 == 1)
                    century_code = 4;        
            else if(cent%4 == 2)
                    century_code = 2;                
            else 
                    century_code = 0; 

           
           int month_code = month_array[month];
           if(month==2 && day==29)
           month_code=3;
           int year_code = year%100;
           
           int leap = year_code / 4;
           
           
        int week_day = ((day + month_code + year_code + leap + century_code ) % 7);
        
              
           if(week_day == 1)   
              return findDay[0];
              
           else if(week_day == 2)   
              return findDay[1];
              
           else if(week_day == 3)   
              return findDay[2];
              
           else if(week_day == 4)   
              return findDay[3];
              
              else if(week_day == 5)   
              return findDay[4];
              
          else if(week_day == 6)   
              return findDay[5];
                  
           else 
              return findDay[6];
                  
     
    }

}
