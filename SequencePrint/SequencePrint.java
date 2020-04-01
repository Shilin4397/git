package lesson7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class SequencePrint {
    public static void print(String[] array, int count){
        Print.INDEX = 0;
        int index = 0;
        for(int i=0; i<array.length; i++){
            final int k = i;
            new Thread(new Print(array, count, k)).start();
        }
    }

    private static class Print implements Runnable{

        private static volatile int INDEX;

        private String[] array;
        private int count;
        private int k;

        public Print(String[] array, int count, int k) {
            this.array = array;
            this.count = count;
            this.k = k;
        }

        @Override
        public void run() {
            try {
                for(int j=0; j<count; j++){
                    synchronized (SequencePrint.class){
                        while (INDEX % array.length != k){
                            SequencePrint.class.wait();
                        }
                        INDEX++;
                        System.out.print(array[k]);
                        if(k == array.length-1)
                            System.out.println("===="+j);
                        SequencePrint.class.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        print(new String[]{"A","B","C"}, 10);
        while(Thread.activeCount()>1)
            Thread.yield();
        print(new String[]{"D","E","F","G"}, 10);
    }
}
