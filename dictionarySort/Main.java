package git.dictionarySort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;


//火车出入站顺序

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int count=scan.nextInt();
            int[] inOrder=new int[count];
            for(int i=0;i<count;i++){
                inOrder[i]=scan.nextInt();
            }
            getOutOder(inOrder);
        }
        scan.close();
    }

    private static void getOutOder(int[] inOrder) {
        //思路一：得到出栈的全排列-验证每个排列是否满足出栈要求(时间复杂度和空间复杂度都高)（参考剑指Ofefr）
        //思路二：每次进行一个操作：进栈操作或出栈操作
        ArrayList<ArrayList<Integer>> outlist=new ArrayList<ArrayList<Integer>>();
        Stack<Integer> in=new Stack<Integer>();//当前已进栈
        ArrayList<Integer> out=new ArrayList<Integer>();//(已出栈)
        Core(outlist,inOrder,in,out,0);
        Collections.sort(outlist,new Comparator<ArrayList<Integer>>(){

            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int k=0;
                while(o1.get(k)==o2.get(k)){
                    k++;
                }
                return (o1.get(k)-o2.get(k));
            }



        });
        for(ArrayList<Integer> a:outlist){
            for(int i=0;i<a.size()-1;i++){
                System.out.print(a.get(i)+" ");
            }
            System.out.println(a.get(a.size()-1));
        }
        return ;

    }

    private static void Core(ArrayList<ArrayList<Integer>> outlist, int[] inOrder, Stack<Integer> in, ArrayList <Integer>out,int index) {
        //对每一个待处理的数字，先处理栈里面的，再处理当前
        //其实核心就是一个栈，对于第K个数，在第K个数进栈之前，前面的 K-1 个数要么全部出去了，要么都在栈里面，要么部分在栈里面部分出去了。那么可以假想，
        //在第K个数入栈之前，依次从栈里面出去 0个、1个、2个……栈.size()个，然后把第K个入栈，再对于 K+1个同样实施这样的方法——这就是个递归了。
        if(out.size()==inOrder.length){
            ArrayList<Integer> r=new ArrayList<Integer>(out);
            outlist.add(r);
            return ;
        }
        if(index==inOrder.length-1&&in.isEmpty()&&out.isEmpty()){
            return ;
        }
        //进栈操作
        if(index<inOrder.length){
            in.push(inOrder[index++]);
            Core(outlist,inOrder,in,out,index);
            in.pop();
            index--;
        }
        //出栈
        if(!in.isEmpty()){
            out.add(in.pop());
            Core(outlist,inOrder,in,out,index);
            in.push(out.get(out.size()-1));
            out.remove(out.size()-1);

        }
        return;
    }
}