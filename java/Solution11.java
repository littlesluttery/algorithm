import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution11 {

    public static void main(String[] args) {
        // 最终结果保存为二维数组
        List<List<String>> res = new ArrayList<>();
        List<List<String>> lists = solveNQueens(4,res);
        System.out.println(lists);


    }
    public static List<List<String>> solveNQueens(int n,List<List<String>> res){
        char[][] chessboard = new char[n][n];
        for(char[] c: chessboard){
            Arrays.fill(c,'.');
        }
        backTrack(n,0,chessboard,res);
        return res;
    }

    public static void backTrack(int n,int row,char[][] chessboard,List<List<String>> res){
        if (row==n){
            res.add(Array2List(chessboard));
            return;
        }
        for (int col = 0; col <n ; ++col) {
            if(isValid(row,col,n,chessboard)){
                chessboard[row][col] = 'Q';
                backTrack(n,row+1,chessboard,res);
                chessboard[row][col] = '.';
            }
            
        }
    }

    public static boolean isValid(int row, int col, int n, char[][] chessboard) {
        // 检查列
        for (int i = 0; i <row ; ++i) { //相当于剪枝
            if (chessboard[i][col] == 'Q'){
                return false;
            }
            
        }
        // 检查45度对角线
        for (int i = row-1,j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        // 检查135度对角线
        for (int i = row-1,j=col+1; i>=0 && j<=n-1; i--,j++) {
            if(chessboard[i][j] == 'Q'){
                return false;
            }
            
        }
        return true;
    }

    public  static List<String> Array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();
        for(char[] c : chessboard){
            list.add(String.copyValueOf(c));
        }
        return list;

    }

}
