package jianzhioffer;
import java.util.ArrayList;
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
public class Q17 {

	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList<Integer> printlist=new ArrayList<>();
	        int tR=0;
	        int tC=0;
	        int dR=matrix.length-1;
	        int dC=matrix[0].length-1;
	        while(tR<=dR&&tC<=dC){
	            if(tR==dR){
	                for(int i=tC;i<=dC;i++){
	                    printlist.add(matrix[tR][i]);
	                }
	            }else if(tC==dC){
	                for(int i=tR;i<=dR;i++){
	                    printlist.add(matrix[i][tC]);
	                }
	            }else{
	                int curC=tC;
	                int curR=tR;
	                while(curC!=dC){
	                     printlist.add(matrix[tR][curC]);
	                    curC++;
	                }
	                while(curR!=dR){
	                     printlist.add(matrix[curR][dC]);
	                    curR++;
	                }
	                while(curC!=tC){
	                     printlist.add(matrix[dR][curC]);
	                    curC--;
	                }
	                while(curR!=tR){
	                     printlist.add(matrix[curR][tC]);
	                    curR--;
	                }
	            }
	            tR++;
	            tC++;
	            dR--;
	            dC--;
	        }
	        return printlist;
	    }
}
