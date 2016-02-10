import java.util.Scanner;
public class Trik {
	public static void main(String[] args) {
		
		
		int l=1,c=0,r=0,t,i; //l=left    c=center  r=right  t=temp 
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number(A-C): ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		t=l;
		l=c;
		c=t;
		}
		else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		t=c;
		c=r;
		r=t;
		}
		else
		{
		t=l;
		l=r;
		r=t;
		}
		}
		if(l == 1) System.out.println("Coin  in Left glass");
		else if(c == 1) System.out.println("coin  in center glass");
		else System.out.println("coin is in Right glass");

	}

}
