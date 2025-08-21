
class A {    	
	int x = 20; 	
}

class B extends A {    
	int x = 30;   
}

public class objectClass {
    public static void main(String args[]) {
    	A a = new A();
    	//B a = new B();
    	//A a = new B();
        System.out.println(a.x);
    }
}