public class DiamondPattern {
    public static void main(String[] args){
        //Upper Part
        for(int i = 1;i <= 85;i++){
            //For Spaces
            for(int j = 1;j<=85-i;j++){
                System.out.print(" ");
            }
            //for Stars
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Part
        for(int i = 84;i>=1;i--){
            //For Spaces
            for(int j = 1;j<=85-i;j++){
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
