package jingchen;

public class DecodeWays {
    public int numDecodings(String s) {
        if(s.length() == 0 || s.charAt(0) == '0')
            return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = dp[1] = 1;
        for(int i = 2;i < s.length()+1;i++){
        		int cur = s.charAt(i - 1) - '0'; 
        		int pre = (s.charAt(i - 2) - '0') * 10 + cur;
        		if (cur >= 1 && cur <= 9) {
                    dp[i] += dp[i - 1];
                }
        		if (pre >= 10 && pre <= 26) {
                    dp[i] += dp[i - 2];
                }
        }
        return dp[s.length()];
    }
}
