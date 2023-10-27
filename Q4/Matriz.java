import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Matriz{
 

    public static int[][] Multiplica(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    	String path = "C:\\Users\\Afonso\\Desktop\\in.txt";
    	try(BufferedReader br = new BufferedReader(new FileReader(path))) {
    		String line = br.readLine(); 
    		 if (line != null) {
                 System.out.println(line);
                 
                 line = br.readLine(); 
                 int[][] matrixA = {line};
    		 }
	        if(line != null) {
	        	line = br.readLine();
	        	int[][] matrixB = {line};
	        }
	        int[][] result = Multiplica(matrixA, matrixB);
	
	        System.out.println("Resultado da multiplicação das matrizes:");
	        printMatriz(result);
        }
    	catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
    		
    	}
    	
    }
}
