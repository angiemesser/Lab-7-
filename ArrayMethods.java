import java.util.Arrays;
/**
 * Class ArrayMethods provides various array manipulation and analysis methods.
 *
 * @author Angie Messer
 * @version v.1
 * @since 10/27/2026
 */
public class ArrayMethods{

    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Method using for each with counter to return number of elements
     * @return the number of elements in the array
     */
    public int count (){
        int count=0;
        for(int value:myArray){
            count++;
        }
        return count;
    }

    /**
     * Method using for each to sum elements in the myArray
     * @return sum of element value in myArray
     */
    public int sum (){
        int accumulator=0;
        for(int value:myArray){
            accumulator+=value;
        }
        return accumulator;
    }

    /**
     * Calculates and returns the average of the Array.
     * @return the average of the array as a double
     */
    public double average (){
        return (double) sum()/count();

    }

    /**
     * Finds and returns the maximum value in myArray.
     * @return max value
     */
    public int findMax(){
        int max;
        max = myArray[0];
        for(int value:myArray){
            if(value>max)
                max=value;
        }
        return max;
    }

    /**
    * Finds and returns the index of the maximum value in myArray.
    * @return the index of the max value
    */
    public int findIndexOfMax(){
        int max;
        int index=0; //index of largest value
        max = myArray[0];
        for(int i = 0;i<myArray.length;i++){
            if(myArray[i]>max){
                max=myArray[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Method to find right most index of key if not found return -1
     * @param key value to be assessed
     * @return right most index of key passed in
     */
    public int findLast (int key){
        int index = -1;
        for (int i = myArray.length-1;i>=0;i--){
            if(myArray[i]==key){
                index=i;
                return index;
            }
        }
        return index;
    }

    /**
     * Finds and returns all indices where key appears in myArray.
     * @param key value to search for in myArray
     * @return an array of indices matching key (empty array if none found)
     */
    public int [ ] findAll(int key) {
        int instances = 0;// Number of times the key is found
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]==key){
                instances++;
            }
        }
        int[] indices = new int[instances];
        int element = 0;
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]==key){
                indices[element]=i;
                element++;
            }
        }
        return indices; 
    }

    /**
     * Creates and returns a copy of myArray.
     * @return a copy of myArray
     */
    public int[] copyArray(){
        return Arrays.copyOf(myArray,myArray.length);
    }

    /**
     * Returns the myArray instance array. 
     * @return myArray
     */
    public int[] getArray(){
        return myArray;
    }
    
    /**
     * Creates and returns a new array with the elements of the given array in reverse order.
     * @param inArray the array to reverse
     * @return the reversed array
     */
    public int[] reverseArray(int[] inArray){
        // for (int left=0, right=inArray.length-1;left<right;left++,right--){
            // int temp= inArray[left];
            // inArray[left]=inArray[right];
            // inArray[right]=temp;
        // }
        // return inArray;
        
        int[] newArray = new int[inArray.length];
        int indexInArray=inArray.length-1;
        for(int i=0;i<newArray.length;i++){
            newArray[i]=inArray[indexInArray];
            indexInArray--;
        }
        return newArray;
    }
    
    /**
     * prints an int array, nicely formatted
     * @param inArray int array to print
     */
    public void print(int[ ] inArray){
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }
}
