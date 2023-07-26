package rank_d;

import java.util.Scanner;

public class D_0179 {

	public D_0179() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(calcMod(sc));        
        sc.close();
	}
	
    // 余りを返却する
    private static long calcMod(Scanner aSc) {

        long rightSide = 0;
        long leftSide = 0;
        long retVal = 0;

        try {
        	rightSide = Long.parseLong(aSc.next()); // 右辺(1回目取出)
        	leftSide = Long.parseLong(aSc.next()); // 左辺(2回目取出)
        	retVal = leftSide % rightSide;
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return retVal;
    }
}
