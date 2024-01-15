public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {2,8,3,7,8};
       
         //System.out.println(findMissingInt(array));  //test the missing int 
        System.out.println(secondMaxValue(array)); //test the secondMaxValue 
        //System.out.println(isSorted(array));//test the isSorted
        
    }
    
    public static int findMissingInt (int [] array) {
        int missNum = 0; // define a number for return a value
        
        for ( int i = 0; i < array.length; i++) {
            if ( array[i] != missNum) {// compare between the value in the array index to the missNum
                return missNum; 
             
            } else {
                missNum++;
            }
        }

        return missNum;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0; 
        int indexMax = 0;
        for ( int i = 0; i < array.length; i++) {
            int num = array[i];

            for ( int k = 0; k < array.length; k++) {
                int num2 = array[k]; 
                if ( num > num2 ) {
                    max = num; 
                    indexMax = i;
                } else if (num == num2) {
                    max = num;
                    indexMax = i;
                } else {
                    max = num2; 
                    indexMax = k;
                }
            }
        } 
    

        int sumMax = max + array[0]; 
        int secondMax = 0; 
       // System.out.println(indexMax);
       // System.out.println(indexOf(array, 5));

        for ( int i : array) {
            if ( i == max && indexOf(array, i) != indexMax ) {
                secondMax = i;
                
            } else if ( sumMax < ( i + max) && i != max ) {
                secondMax = i;
            } else {
                continue; 
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

    //for helping to find the index of variable
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    

}
