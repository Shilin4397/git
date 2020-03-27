import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
class Calculator{
    public static int num1;
    public static int mun2;

    public static void setNum1(int num1) {
        Calculator.num1 = num1;
    }

    public static void setMun2(int mun2) {
        Calculator.mun2 = mun2;
    }

    public void add(int num1, int num2) {
        System.out.println(num1+num2);
    }
    public void subtraction(int num1,int num2){
        int ret= num1-num2;
        System.out.println(ret);
    }
    public  int multiplication(int num1,int num2) {
        return num1*num2;
    }
    public double besides(double num1,double num2) {
       return num1/num2;
    }
}
public class Test {
    public static void main(String[] args) {
        Calculator yy = new Calculator();
        yy.add(10, 10);
        yy.subtraction(10, 10);
        System.out.println(yy.multiplication(10, 10));
        System.out.println(yy.besides(6, 2));
    }
}



class Construction{

    private String name;
    private int snumber;
    private int age;

    public Construction() {
       this("雄安",18);
        System.out.println("construction（）");
    }
    public Construction(String name) {
        this.name=name;
        System.out.println("Construction(String name)");
    }
    public Construction(String name,int age) {
        this.name=name;
        this.age=age;
        System.out.println("Construction(String name,int age)");
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age);
    }

    public static void main(String[] args) {
        Construction sc=new Construction();
        System.out.println(sc);
        sc.show();
    }
}




/*class Exchange {
    public int a;
    public int b;

    public void change() {
        int temp=a;
        a=b;
        b=temp;
    }
}
public class Test{
    public static void main(String[] args) {
        Exchange ch =new Exchange();
        ch.a=6;
        ch.b=5;
        ch.change();
        System.out.println("a="+ch.a+" "+"b="+ch.b);
    }
}
*/

//class Exchange {
//    public int a;
//    public int b;
//
//    public void change(int x,int y) {
//        int temp=x;
//        x=y;
//        y=temp;
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Exchange ch =new Exchange();
//        int a=2;
//        int b=3;
//        ch.change(a,b);
//        System.out.println("a="+ch.a+" "+"b="+ch.b);
//    }

class MyArrayList {
    public int usedSize;
    public int[] elem;

    public final int CAPACITY = 10;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //1、pos是否合法
        //2、挪数据
        //3、插入数据
        //4、usedSize++

        if (pos < 0 || pos > usedSize) {
            System.out.println(" ");
        } else {
            if (this.usedSize == this.elem.length) {
                this.elem = Arrays.copyOf(elem, elem.length * 2);
            }
            for (int i = this.usedSize - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }

    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i=0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i=0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0 || pos>this.usedSize) {
            int i=0;
            while(i<this.usedSize) {
                if(i==pos) {
                    return this.elem[i];
                }
                i++;
            }
        }
        return -1;
    }

    // 给 pos 位置的元素设为 value
    // public void setPos(int pos, int value) { }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(this.usedSize==0) {
            System.out.println("删除错误");
        }
        if(this.search(toRemove)!=-1) {
            for (int i = this.search(toRemove); i < this.usedSize - 1; i++) {
                this.elem[i] = this.elem[i + 1];
            }
        }else {
            System.out.println(" ....");
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        if(this.usedSize>0) {
            return this.usedSize;
        }
        return 0;
    }

    // 清空顺序表
    public void clear() {
       this.usedSize=0;
    }

    // 打印顺序表
    public void display() {
        System.out.println(Arrays.toString(elem));
    }
}








