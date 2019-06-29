package jianzhioffer;
//二维数组的查找
public class Q01 {
	public static boolean Find(int target, int [][] array) {
		int row =0;
		int col=array[0].length-1;
		while(row<array.length&&col>=0) {
			if(array[row][col]<target) {
				row++;
			}else if(array[row][col]>target) {
				col--;
			}else {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		int t=10;
		System.out.println(Find(t,matrix));
	}
}
