package core_java;

class Demo {
  public static void main(String[] args) {
	int a=0;
	long b=a;  //widening
	System.out.println(b);
	
	long c=20l;
	int d=(int)c;  //narrowing
	System.out.println(d);
	
	double d1=55.55;
	int i1=(int)d1;  //narrowing
	System.out.println(i1);
  }
}
