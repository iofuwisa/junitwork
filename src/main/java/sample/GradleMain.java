package sample;

// import Human;

class GradleMain
{
	public static void main(String args[]) {

		Human h = new Human("pachiko", "saitm");
		System.out.println("" + h.getMyNumber());
		System.out.println(h.getName());
		System.out.println(h.getAddr());
	}
}