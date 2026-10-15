public class ReversePyramid {
    public static void main(String[] args){

        for(int i = 1;i<=35;i++){
            //for Spaces
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            //For Stars
            for(int j = 1;j<=2*(35-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
