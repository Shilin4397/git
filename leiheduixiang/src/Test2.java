/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Test2 {
    public static void main(String[] args) {
        MyArrayList arr=new MyArrayList();
        arr.add(0,1);
        arr.add(0,3);
        arr.add(0,3);
        arr.remove(1);
        arr.display();
        System.out.println(arr.getPos(3));

    }
}
