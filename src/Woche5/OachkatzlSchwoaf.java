package Woche5;

public class OachkatzlSchwoaf {
    public static void main(String[] args) {



        for (int i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("OachkatzlSchwoaf");
            } else if (i%5==0) {
                System.out.println("Schwoaf");
            } else if (i%3==0) {
                System.out.println("Oachkatzl");
            }else{
                System.out.println(i);
            }
        }
    }
}
