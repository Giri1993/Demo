package Assign2;
/*
 class Car {
	 private int i;
	 public int var1(){
		 i=1;
		return i;		 
	 }
}
 class Bmw{
	 private int j;
	 public int var2(){
		 j=2;
		return j; 
	 }
 }
class Audi extends Car{
	public static void main(String[] args) {
		Audi a=new Audi();
		System.out.println(a.var1());
		Bmw b=new Bmw();
		System.out.println(b.var2());
		int c=a.var1()+b.var2();
		System.out.println(c);
	}
} 
*/

class Car{
	private int i;
	 public int getvar1(){
		 i=1;
		return i;		 
	 }
	 public int add(int x,int y){
			return(x+y);
		}
}
class Bmw{
	private int j;
	public int getvar2(){
		 j=2;
		return j; 
	 }
	
}
class Audi extends Car{
	public static void main(String[] args) {
		Audi a=new Audi();
		System.out.println(a.getvar1());
		Bmw b=new Bmw();
		System.out.println(b.getvar2());
		int c=a.add(a.getvar1(), b.getvar2());
		System.out.println(c);		
	}
}