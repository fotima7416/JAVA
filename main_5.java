public class main_5 {
    public static void main(String[] args){
        int [][] array={{1,2},{3,4,7,8},{5,6}};
        for(int i=0;i<array.length;i++){
           for (int j=0;j<array[i].length;j++){
               System.out.println(array[i][j]);
           }
        }

        int[][] matrix1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}; // namuna_1
        int[][] matrix2 = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}; // namuna_2
        int[][] matrix3 = new int[4][]; // namuna_3
        int[][] matrix4 = new int[4][6]; // namu

        int[][] matrix = {
                {7, 21, 43, 18, 51},
                {65, 93, 81, 12, 70}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
