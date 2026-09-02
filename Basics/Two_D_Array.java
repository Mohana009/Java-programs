public class Two_D_Array {
    public static void main(String[] args) {
        //datatype[][] arr_name = new int[r][c]; --> 2d
        //datatype[][][] arr_name = new int[x][y][z] --> 3d

        //Initializing of 2D array
        //               0   1     0   1     0   1
        int[][] arr = {{10, 20}, {30, 40}, {50, 60}};       //3 x 2 matrix
//                         0         1         2            3 rows & 2 colums
        for(int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
