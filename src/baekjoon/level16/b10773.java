    package baekjoon.level16;

    import java.util.Scanner;

    public class b10773 {
        public static void main(String[] args) {
            int[] n;
            int k, temp;
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            n = new int[k];
            int top = 0;
            for(int i =0; i<k; i++){
                temp = sc.nextInt();
                if(temp==0)top--;
                else n[top++] = temp;
            }
            int count = 0;
            for(int i =0; i< top; i++){
                count += n[i];
            }
            System.out.print(count);
        }
    }
