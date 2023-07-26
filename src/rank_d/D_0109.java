package rank_d;

import java.time.LocalDate;
import java.util.Scanner;

public class D_0109 {

	public D_0109() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(sameMMDD(sc));
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
            throw e;
        }
        return compareResult(inMonth, inDate);
    }
    
    // 月と日の比較結果を返却
    private static String compareResult(int aMonth, int aDate) {
    	
    	String result = null;
    	String strMonth = String.valueOf(aMonth);
    	String strDate = String.valueOf(aDate);
    	
    	int monthTensPlace = 0;
    	int monthOnesPlace = 0;
    	int dateTensPlace = 0;
    	int dateOnesPlace = 0;

    	monthOnesPlace = aMonth % 10;
    	if (2 == strMonth.length()) {
    		monthTensPlace = aMonth / 10;
    	}

    	dateOnesPlace = aDate % 10;
    	if (2 == strDate.length()) {
    		dateTensPlace = aDate / 10;
    	}

    	if (0 != dateOnesPlace && 0 != monthOnesPlace) {	// 日付1の位は必ず0以外
    		if (dateOnesPlace == monthOnesPlace) {			// 月と日の1の位ゾロ目合わせ
    			if (0 == monthTensPlace) {					// 月の10の位が0時(1の位だけで判定)
    				if (0 == dateTensPlace) {				// 日の10の位なし
    					result = "Yes";
    				} else if (dateTensPlace == dateOnesPlace) {	// 日の1と10の位比較
    					result = "Yes";
    				}
    			} else {									// 月の10の位が0以外
    				if (0 == dateTensPlace) {
    					if (monthTensPlace == monthOnesPlace) {		// 月の1の位と10の位が同じ
    						result = "Yes";
    					} else {
    						result = "No";
    					}
    				} else {
    					if (dateTensPlace == monthTensPlace && dateTensPlace == monthOnesPlace) { // 日と月のゾロ目チェック
    						result = "Yes";
    					} else {
    						result = "No";
    					}
    				}
    			}
    		} else {
    			result = "No";
    		}
    	} else {
    		result = "No";
    	}

    	return result;
    }
}
