package CoreJavaSnippets;

public class ArrayExample {
    public static void main(String[] args) {

        System.out.println("******************************************* Arrays *******************************************");
        int numArray[]; // declaring array
        numArray = new int[20]; // allocating memory
        // Combining above two statements
        int[] numArrayCompact = new int[20];

        // Array Literal - when the size of array and its variables are known previously
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        // Cloning of Arrays - 1D. A "deep copy" is done for 1D arrays
        int intArray1D[] = {1,2,3};
        int clone1DArray[] = intArray1D.clone();
        System.out.println(intArray1D == clone1DArray); // will print false, since "deep-copy for 1D Array"
        for(int i=0; i<clone1DArray.length; i++){
            System.out.print(clone1DArray[i]+" ");
        }
        System.out.println();

        System.out.println("******************************************* Multi-Dimensional Arrays *******************************************");
        // Multidimensional Array, also called Jagged Arrays
        int[][] intArray2D = new int[10][20]; //a 2D array or matrix
        int[][][] intArray3D = new int[10][20][10]; //a 3D array

        // a 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
        for(int row=0; row<arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }

        // Cloning of multi-dimensional array, A "shallow copy" is done for multi-dimensional array
        int intArray2Dim[][] = {{1,2,3},{4,5}};
        int clone2DimArray[][] = intArray2Dim.clone();
        System.out.println(intArray2Dim == clone2DimArray); // will print false, since "shallow-copy for 2D Array"
    }
}