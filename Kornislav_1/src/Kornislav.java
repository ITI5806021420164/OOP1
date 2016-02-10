import java.util.Scanner;
public class Kornislav {
	public static void main(String[] args) {
		
		
		int vn1,vn2,vn3,vn4,temp; //vn ย่อมากจาก  Value Number
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value Number 1 : ");
		vn1=scan.nextInt();
		System.out.print("Input Value Number 2 : ");
		vn2=scan.nextInt();
		System.out.print("Input Value Number 3 : ");
		vn3=scan.nextInt();
		System.out.print("Input Value Number 4 : ");
		vn4=scan.nextInt();
		
		if(vn1>vn2)
		{
		temp=vn1;
		vn1=vn2;
		vn2=temp;
		}
		
		if(vn1>vn3)
		{
		temp=vn1;
		vn1=vn3;
		vn3=temp;
		}
		
		if(vn1>vn4)
		{
		temp=vn1;
		vn1=vn4;
		vn4=temp;
		}
		
		if(vn2>vn3)
		{
		temp=vn2;
		vn2=vn3;
		vn3=temp;
		}
		
		if(vn2>vn4)
		{
		temp=vn2;
		vn2=vn4;
		vn4=temp;
		}
		
		if(vn3>vn4)
		{
		temp=vn3;
		vn3=vn4;
		vn4=temp;
		}

		
		
		System.out.println("rectangle Area. =   "+""+vn3+""+" * "+vn1+" = "+vn1*vn3);

	}

}


