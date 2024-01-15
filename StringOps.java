public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       String capVowels =  capVowelsLowRest("One two tHRee world"); //test the capsVowels
       System.out.println(capVowels);


       //String camelCase = camelCase(" hello");  //test the camelCase 
       //System.out.println(camelCase); //test for camelCase


       //System.out.println(capVowels);
       /*int [] index = allIndexOf("hello", 'l'); //test the all  indexof
       for ( int i = 0; i < index.length; i++) {
           System.out.print(index[i] + " ");
       }*/
       
       
       


       

        
    }

    public static String capVowelsLowRest (String string) {
        String vowels = "aeiou"; // containing the vowels as one string 
        String s = ""; // empty string for store the new string 

        //loop that run on the string and check if the specific char is match what we looking for 
        for ( int i = 0; i < string.length(); i ++ ) {
            char ch = string.charAt(i); 
            if ( vowels.indexOf(ch) != -1) { // it mean its contain in vowel 
                    ch = (char) (ch - 32); // change from lower the uuper 
                    s += ch;
            } else {
                    s +=  (ch >= 'A'  && ch <= 'Z')?( (char) ( ch + 32 )):( (char) ch ) ; 
            } 
             
        }
    
        return s;
    }

    public static String camelCase (String string) {
        String s = ""; 
        char first = (string.charAt(0) > 'Z')?((string.charAt(0)) ):( ( char) (string.charAt(0) + 32)) ; 
        s+=first; // insert the first letter to the return string
        

        // create a string without space and after then change the first letter each word to uppercase 
        for ( int i = 1; i < string.length(); i++) {
            char c = string.charAt(i); 
            if ( c  >= 'A'  && c <= 'Z') {
                s+= (char) (string.charAt(i) + 32);
            } else if ( c > 'Z' && string.charAt(i-1) == ' ') {
                s+= (char) (c -32); 
            }else if ( c == ' ') {
                if ( string.charAt(0) == c) {

                }
                continue; 
            }else{
                s+=c; 
            }
            
        
        }

        return s;
    }

    public static int[] allIndexOf (String string, char chr) {
       int count = 0;  
       int counter = 0; 
    

       // for counting how much the char is appeared in the string and to set the length of the new array i will build
       for ( int i = 0; i < string.length(); i++) {
           if ( chr == string.charAt(i)) {
            count++; 
           }
       }

       int[] indexArr = new int[count]; // define a new array with the length of the amount of apearence of the cahr 
       

       // store the index in the array 
       for ( int i = 0; i < string.length(); i++) {
           if ( chr == string.charAt(i)) {
               indexArr[counter++] = i; 
               if ( counter == count) {
                  break;
               }
              
           }
       }
        return indexArr;
    }
}
