import java.util.Scanner;
public class Antmoves {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter no of moves:");
int n=sc.nextInt();
int[] moves=new int[n];
System.out.println("enter the moves(1 for right,-1 for left):");
for(int i=0;i<n;i++) {
moves[i]=sc.nextInt();
} else {
	return 0;
}
int position=0;
int count=0;for(int move:moves) {
position+=move;
if(position==0) {
count++;
}
}
System.out.println("ant returned to original position"+count+"times.");
}
}
