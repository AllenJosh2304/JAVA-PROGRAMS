public class MatrixMul {
    public static void main(String[] args) {
        int [][] a = {
                {1,2,3},
                {4,5,6}
        };
        int [][] b = {
                {1,5,3},
                {5,3,1},
                {7,1,3}
        };
        int rows1 = a.length;
        int cols1 = a[0].length;
        int rows2 = b.length;
        int cols2 = b[0].length;

        if(cols1!=rows2){
            System.out.println("not possible");
            return;
        }

        int [][] c = new int [rows1][cols2];

        for (int i = 0; i<rows1; i++){
            for (int j = 0;j<cols2; j++){
                for (int k = 0;k<cols1; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Result");
        for(int i = 0; i<rows1;i++){
            System.out.print("[");
            for (int j = 0; j<cols2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }

    }
}
