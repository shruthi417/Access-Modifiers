package accessmodifiers;
class A
{
	
	private int a = 10;
	private void m1()
	{
		System.out.println("M1");
	}
	void m2()
	{
		System.out.println("M2");
	}
}
class PrivateEg {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x = new A();
		//x.m1();//Compile Time Error
		x.m2();
		//System.out.println(x.a);//Compile Time Error
	}

}
