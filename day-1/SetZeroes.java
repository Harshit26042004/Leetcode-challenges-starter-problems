import java.util.ArrayList;

public class SetZeroes {
    public static void main(String[] args) {
        int matrix[][] = {{0,1}};
        int out[][] = setZeroes(matrix);
        for(int i=0;i<out.length;i++){
            for(int j=0;j<out[i].length;j++){
                System.out.print(out[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] setZeroes(int[][] matrix) {
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }

        for(int i: r){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        for(int i : c){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }
        return matrix;



    }
}
