public class Day_6_Problems {
    public static void main(String[] args) {
        //outer loop
        for (int i = 0; i < 3; i++) {
            //inner loop
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {//for(int j=0;j<=i;j++)
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        int [] arr=new int[5];
        System.out.println(arr[4]);
    }
    
}
