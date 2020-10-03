package git.niuke;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

//给定一个double num，范围是0到1的实数，若其能用32位以内的二进制表示出来则返回值string为其二进制值，
// 若不能则返回值为“Error”。

public class BinDecimal {
    public String printBin(double num) {
        // write code here
        StringBuilder sb = new StringBuilder("0.");
        int count = 32;
        while(num != 0.0) {
            count--;
            if(count < 0)
                return "Error";
            num = num*2;
            if(num >= 1) {
                sb.append("1");
                num -= 1;
            }else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
