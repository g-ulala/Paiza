package rank_d;

import java.time.LocalDate;
import java.util.Scanner;

public class D_0109 {

	public D_0109() { }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sameMMDD(sc));
        sc.close();
	}
    // 月と日の比較
    private static String sameMMDD(Scanner aSc) {

        int inMonth = 0;
        int inDate = 0;

        try {
        	inMonth = Integer.parseInt(aSc.next());
        	inDate = Integer.parseInt(aSc.next());

        	LocalDate.now()
        			.withMonth(inMonth)
        			.withDayOfMonth(inDate);

        } catch (Exception e) {
            e.printStackTrace();
            return "No";
        }
        return compareResult(inMonth, inDate);
    }
    
    // 月と日の比較結果を返却
    private static String compareResult(int aMonth, int aDate) {

    	String strMonth = String.valueOf(aMonth);
    	String strDate = String.valueOf(aDate);

    	int[] checkYm = new int[4];
    	boolean blCheck = false;

    	checkYm[2] = aMonth % 10;			// 月2桁目
    	if (2 == strMonth.length()) {
    		checkYm[3] = aMonth / 10;		// 月1桁目
    	}

    	checkYm[0] = aDate % 10; 			// 日1桁目
    	if (2 == strDate.length()) {
    		checkYm[1] = aDate / 10;		// 日2桁目
    	}

    	for (int i = 1; i < checkYm.length; i++) {
    		if (0 == checkYm[0] || 0 == checkYm[2]) {	// 日と月の1桁目が0はあり得ない
    			blCheck = false;
    			break;
    		} else {
    			if (0 == checkYm[i]) {					// 日と月の2桁目が0の時は無視
    				continue;
    			} else {
    				if (checkYm[0] == checkYm[i]) {		// 日の1桁目と同一
    					blCheck = true;
    				}
    			}
    		}
    	}
    	return blCheck ? "Yes" : "No";
    }
}
