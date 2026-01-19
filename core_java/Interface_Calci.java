package core_java;

interface Interface_Calci {
	
	void add(int a, int b); // It will take public abstract by default
	void multi(int a, int b);
	void sub(int a, int b);
	
	public abstract void m1();
	abstract void m2(); // public
	// protected abstract void m3();    ->CTE
	// private abstract void m4();     ->CTE
}
