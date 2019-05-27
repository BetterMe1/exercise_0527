package exercise.exercise_0523;

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int start = 0;
        boolean f = false;
        int end = 0;
        int max = 0;
        for(int i=0,len=str.length(); i<len; i++){
            char a = str.charAt(i);
            if(a >='0' && a<='9' && !f){
                start = i;
                f = true;
            }
            if((a <'0' || a>'9') && f){
                end = i;
                f = false;
                if(end - start > max){
                    max = end-start;
                    result = str.substring(start,end);
                }
            }
            if(a >='0' && a<='9' && i==len-1 && f){
                end = i+1;
                if(end - start > max){
                    max = end-start;
                    result = str.substring(start,end);
                }
            }
        }
        System.out.println(result);
    }
}*/

/*
买苹果
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n8 = n/8;
        int n6 = 0;
        int d = n%8;//剩余的
        for(;d!=0 && n6<=n/6; n6++){
            if(d == 6){
                d = 0;
            }else if(d!=6 && n8>0){
                d = n - 8*(--n8) -(n6+1)*6;
            }
        }
        if(d == 0) {
            System.out.println(n6+n8);
        }else{
            System.out.println(-1);
        }
    }
}*/

/*
删除公共字符
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1,str2));
    }
    private static String solution(String str1,String str2){
        for(int i=0,len2=str2.length(); i<len2; i++){
            String tmp = String.valueOf(str2.charAt(i));
            str1 = str1.replaceAll(tmp,"");
        }
        return str1;
    }
}
*/

/*
计算糖果
 */

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int A = (num1+num3)/2;
        int B = (num2+num4)/2;
        int C = num4-B;
        if(A>=0 && B>=0 && C>=0 &&
                2*A==num1+num3 && 2*B==num2+num4 &&
                A-B== num1 && B-C == num2 && A+B == num3){
            System.out.println(A+" "+B+" "+C);
        }else{
            System.out.println("No");
        }
    }
}*/

/*
不要二
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();//列
        int H = sc.nextInt();//行
        int Wnum1 = 0;
        int Wnum2 = 0;
        int Hnum1 = 0;
        int Hnum2 = 0;
        if(W % 4 == 0){
            Wnum1 = W/2;
            Wnum2 = W/2;
        }else if(W%4 == 2){
            Wnum1 = W/4*2 + 2;
            Wnum2 = W/4*2;
        }else if(W%4 == 3){
            Wnum1 = W/4*2 + 2;
            Wnum2 = W/4*2 + 1;
        }else{
            Wnum1 = W/4*2 + 1;
            Wnum2 = W/4*2;
        }
        if(H % 4 == 0){
            Hnum1 = H/2;
            Hnum2 = H/2;
        }else if(H%4 == 2){
            Hnum1 = H/4*2 + 2;
            Hnum2 = H/4*2;
        }else if(H%4 == 3){
            Hnum1 = H/4*2 + 2;
            Hnum2 = H/4*2 + 1;
        }else{
            Hnum1 = H/4*2 + 1;
            Hnum2 = H/4*2;
        }
        System.out.println(Wnum1*Hnum1+Wnum2*Hnum2);
    }
}



