package Functions;

public class factorial {
    public static int Cfactorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;       
        }
        return f;
    }
    public static int BF(int p,int r) {
        int Bfact=Cfactorial(p)/(Cfactorial(r)*Cfactorial(p-r));
        return Bfact;    }
    public static void main(String[] args) {
        System.out.println(Cfactorial(0));
        System.out.println(Cfactorial(1));
        System.out.println(Cfactorial(2));
        System.out.println(Cfactorial(3));
        System.out.println(Cfactorial(4));
        System.out.println(Cfactorial(5));
        System.out.println(Cfactorial(6));
        System.out.println(BF(3, 5));
        System.out.println(BF(4, 6));
        System.out.println(BF(5, 7));
    }
}
