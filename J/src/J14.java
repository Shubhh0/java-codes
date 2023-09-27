package J.src;

public class J14 {
    public static void main(String[] args) {
        int s=4;
        int j=5;

        //outer loop
        for(int i=1; i<=s; i++){
            //inner loop
            for(int l=1; l<=j; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
