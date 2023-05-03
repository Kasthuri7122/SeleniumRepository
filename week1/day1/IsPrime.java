package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=57;
boolean isPrime = false;
for (int i = 2; i<n; i++) {
	if(n/i==0)
	{
		isPrime=true;
		break;
		
	}}
	if(isPrime==false)
	{
System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
}
}
}