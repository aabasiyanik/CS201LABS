public class rec {
    public static void main(String[] args) {
        System.out.println(add(5));
    }

    static int add(int x){
        if( x==1){
            return 1;
        }

        return x + add(x-1);
    }
}
