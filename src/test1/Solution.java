/**
 * 
 */
/**
 * @author Hossain
 *
 */
package test1;

//This is a code for the 3rd problem from advanched auto parts



class Solution {

    public int solution(long N) {

 

              if (N > 0 && N < 99999) {

                      String s = String.valueOf(N);
                      System.out.println(s);
                      System.out.println(s.length());
                      return getStringCombiNumbers(s);
                      
              }
              return 0;
      }

 

      public int getStringCombiNumbers(String s) {

          boolean a [] = new boolean [s.length()];    
    	  int count = 1;
    	  int countzero = 0;
    	  int factzero = 0;
          for (int i = 0; i < s.length(); i++)			//for loop to count zero input
          {
        	  if (s.charAt(i)== '0')
        		  countzero++;
        	  
          }
          if (countzero > 0)
    	  factzero = factorial (s.length() - countzero);
    	  count = factorial (s.length());

    	  for (int i = 0; i<s.length(); i++)               // this is to asign value to a
    		  a[i]= false;
    	  		
              for (int i = 0; i < s.length(); i++)			// this for loop will find multiple input of same digit 
              {
            	  int countb = 1;
            	  for (int j = (i+1); j < s.length(); j++){
            		  if ( s.charAt(i) == s.charAt(j) && a[j] == false){
            			  countb++;
            			  a[j]= true;
            		  }
            		  
            	  }
            	  count = count/factorial(countb);
            	  if (countzero >0)
            	  factzero = factzero/factorial(countb);
              }
              count = count - factzero;
              
              return count;

      }
      
      public int factorial(int n)	//this function determine the factorial of a int value
      {
    	  int fact = 1;
    	  for (int i = 0 ; i< n; i++)
    		  fact = fact * (n-i);
    	  return fact;
      }

      

      public static void main(String[] args) {

              Solution s = new Solution();

            int ans = s.solution (1213);		// this is the input
            System.out.println(ans);

      }

}