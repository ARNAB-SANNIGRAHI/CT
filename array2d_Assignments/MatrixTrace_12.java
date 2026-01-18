package array2d_Assignments;

public class MatrixTrace_12 {
static void printTrace(int[][] a) {
	int sum = 0;
	for(int i=0;i<a.length;i++) {
		sum += a[i][i];
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
	printTrace(m);
}
}
