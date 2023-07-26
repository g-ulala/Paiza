package rank_d;

import java.util.Scanner;

public class D_0252 {

	public D_0252() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(calcMulti(sc));        
        sc.close();
	}
	
    // 4周した値を返却
    private static long calcMulti(Scanner aSc) {
        long retVal = 0;
        
        try {
        	long inpNum = Long.parseLong(aSc.next());
        	retVal = inpNum * 4;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }
}
