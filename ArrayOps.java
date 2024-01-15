public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {2,8,3,7,8}; 
        int [] array2 = {1,2,3,-4,5};
        int [] array3 = {1,3,-4,5}; 
       
        //System.out.println(findMissingInt(array));  //test the missing int 

        //System.out.println(secondMaxValue(array)); //test the secondMaxValue 

        //System.out.println(isSorted(array));//test the isSorted

        boolean contain = containsTheSameElements(array2, array3);
        System.out.println(contain); // test the contain 
        
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
        boolean isContain = true; //default value

        //check the option which arrays get the short length for the Comparison
        if ( array1.length < array2.length ||  array1.length == array2.length ) {
            for ( int i = 0; i < array1.length; i++) {
                if ( indexOf(array2, array1[i]) != -1){
                    if ( indexOf(array1, array2[i]) == -1) {
                        isContain = false;
                        break; 
                    }
                    
                } else {
                    isContain = false;
                    break;
                }
            }

        } else {
            for ( int i = 0; i < array2.length; i++) {
                if ( indexOf(array1, array2[i]) != -1) {
                    if ( indexOf(array2, array1[i]) == -1) {
                        isContain = false; 
                        break; 
                    }
                }else {
                    isContain = false;
                    break; 
                }
            }
            
        }

        return isContain;
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
        return isSorted;
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
