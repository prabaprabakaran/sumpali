import java.util.Scanner;

 public class wordsreverse{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
 int num = s.nextInt();
	int n = num;
	int sum=0;
 for(int i=0;i<n;i++){
	 sum=sum+n;
 }
 System.out.println(sum);
 int rev = 0;
 while (num > 0)
 {
     int dig = num % 10;
      rev = rev * 10 + dig;
      num = num / 10;
 }
 if(n==rev){
	 System.out.println("the number is palindrome");
	 
 }else{
	 System.out.println("not palindrome");}
 }
 }
 
