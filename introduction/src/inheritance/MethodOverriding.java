package inheritance;

public class MethodOverriding{
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		Singer s1 = new Singer();
		
		Person p1 = t1;
		
		Teacher t2 = (Teacher)p1;
		
		boolean yo =  t1 instanceof Teacher;
		System.out.println(t1 instanceof Teacher);
		System.out.println(p1 instanceof Teacher);
		System.out.println(t1 instanceof Person);
		System.out.println(p1 instanceof Singer);
		System.out.println(s1 instanceof Person);

	}
}