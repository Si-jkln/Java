package Loops;

public class ex09 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue;

            } else if(i % 11 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
