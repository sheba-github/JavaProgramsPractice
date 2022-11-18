package InheritanceDemo;
public class Son extends Grandfather {
	
	public static void main(String[] args) {
			
		Son s = new Son();
		s.SonJoblocation();
		s.city();
		s.country();
		s.i = 40;
		System.out.println(s.i);
		
	}
	public void SonJoblocation(){
		System.out.println("Toronto");
	}
}

