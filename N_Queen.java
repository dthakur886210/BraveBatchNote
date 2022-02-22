import java.util.Arrays;

public class N_Queen {
    public static void main(String[] args) {
     char chess [][] = new char[4][4];
     for ( int i = 0; i < chess.length; i++){
         Arrays.fill(chess[i], '.');
     }
     nQueens(chess, 0, 0,0);
    }
public static void   nQueens(char[][] chess, int r , int c, int queens){
        if (chess.length == queens){
            System.out.println(Arrays.deepToString(chess));
            return;
        }
        if ( c == chess.length) return;
        if ( canBePlaced(chess,r,c)){
            chess[r][c] = 'Q';
            nQueens(chess,r+1 ,0, queens+1);
            chess[r][c] = '.';
        }
        nQueens(chess, r, c+1, queens);
}
    public static boolean canBePlaced(char[][] chess, int r, int c){
        int [][] dir = {{-1,-1}, {-1,0}, {-1,1}};
        for ( int i = 0; i < dir.length; i++){
            int nr = r;
            int nc = c;
            int dirR = dir[i][0];
            int dirC = dir[i][1];
            while (nr >= 0  && nc >= 0 && nc < chess.length ){
                if ( chess[nr][nc] == 'Q') return false;
                nr += dirR;
                nc += dirC;
            }
        }
        return true;
    }
}
