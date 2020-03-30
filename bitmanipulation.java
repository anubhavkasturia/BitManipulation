public class bitmanipulation{
    public static void main(String args[]) {
        int n=25;
        int i=3;
        System.out.println(Integer.toBinaryString(n));//11001
        // BitOnorOff(n, i);
        // turnBitON(n, i);
        turnBitOFF(n, 0);
        // toggleBit(n, i);
    }
    public static void BitOnorOff(int n,int i){
        int mask=1<<i;
        int result=n&mask;
        if(result==0){
            System.out.println("OFF");
        }else{
            System.out.println("ON");
        }

    }
    public static void turnBitON(int n,int i){
        int mask=1<<i;
        n=n|mask;
        System.out.println(Integer.toBinaryString(n));
    }
    public static void turnBitOFF(int n,int i){
        int mask=1<<i;
        n=n&~mask;
        System.out.println(Integer.toBinaryString(n));
    }
    public static void toggleBit(int n,int i){
        int mask=1<<i;
        n=n^mask;
        System.out.println(Integer.toBinaryString(n));
    }
}