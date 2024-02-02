public class hollowrectangle {
    public static void main(String[] args) {
        int m=5;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n ||j==1 ||j==m){
                    System.out.print("*");        // For * pattern
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println();            // for next Line
        }
    }
}
 