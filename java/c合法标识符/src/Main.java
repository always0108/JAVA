import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            String str = input.nextLine();
            if(str.matches("^[a-zA-Z_][a-zA-Z0-9_]*$")){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}

