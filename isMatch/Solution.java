package isMatch;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        int sIdx = 0, pIdx = 0;
        int starIdx = -1, sTmpIdx = -1;
        while (sIdx < sLen) {
            if (pIdx < pLen && (p.charAt(pIdx) == '?' || p.charAt(pIdx) == s.charAt(sIdx))){
                ++sIdx;
                ++pIdx;
            }
            else if (pIdx < pLen && p.charAt(pIdx) == '*') {
                //记录p中出现*号的位置，
                // 并记录此时sIdx的位置，
                // 让pIdx向下走
                starIdx = pIdx;
                sTmpIdx = sIdx;
                ++pIdx;
            }
            else if (starIdx == -1) {
                //判断在此之前又没有遇到过*号
                return false;
            }
            else {
                //在此之前已经碰到了*号
                //回到第一次遇到*号的位置
                //让pIdx和sIdx同时向下走一步
                pIdx = starIdx + 1;
                sIdx = sTmpIdx + 1;
                sTmpIdx = sIdx;
            }
        }
        //如果p还没有遍历完，继续遍历p如果后面的不全是*号则返回false，反之返回true;
        for(int i = pIdx; i < pLen; i++)
            if (p.charAt(i) != '*') return false;
        return true;
    }
}
