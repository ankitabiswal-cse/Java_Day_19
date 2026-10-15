public class PyramidPattern {
    public static void main(String[] args){

        for(int i = 1;i<=25;i++){
            //For Spaces
            for(int j = 1;j<=25-i;j++){
                System.out.print(" ");
            }
            //For Stars
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
