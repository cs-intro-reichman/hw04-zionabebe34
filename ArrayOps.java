public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {7,5,4,3,2};
        //System.out.println(findMissingInt(array));
        //System.out.println(secondMaxValue(array));
        System.out.println(isSorted(array));
        
    }
    
    public static int findMissingInt (int [] array) {
        int missNum = 0; // define a number for return a value
        
        for ( int i = 0; i < array.length; i++) {
            missNum = i; // the value will be [0, array.length)
            if ( array[i] == missNum) {// compare between the value in the array index to the missNum
                continue; 
            } else { 
                return missNum; 
            }
        }

        return missNum;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0; 
        for ( int i = 0; i < array.length; i++) {
            int num = array[i];

            for ( int k = 0; k < array.length; k++) {
                int num2 = array[k]; 
                if ( num > num2 ) {
                    max = num; 
                } else if (num == num2) {
                    max = num;
                } else {
                    max = num2; 
                }
            }
        }

        int sumMax = max + array[0]; 
        int secondMax = 0; 
        

        for ( int q = 1; q  < array.length; q++) { // it start from 1 because i made the operation on index 0
            if ( sumMax > ( max + array[q])) {
                max = max;
            } else if ( sumMax < ( max + array[q])) {
                sumMax = max + array[q]; 
                secondMax = array[q];
            } 
            

         }

        
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        boolean isSorted = false; 
        int max = array[0];

        for ( int i = 1; i < array.length; i++) {
            if ( max > array[i]) {
                max = array[i]; 
                isSorted = true; 
            } else {
                isSorted = false;
                break;
            }
        }
        return false;
    }

}
