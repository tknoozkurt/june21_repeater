package gitHubTrialandRepeat;

public class MainClass extends ThirdClass  {

	public static void main(String[] args) {
    SecondClass obj=new SecondClass();
    obj.datalar();
    variabllar();
    System.out.println("saat kac oldu");
    MainClass mainobj=new MainClass();
    System.out.println(mainobj.getSatislar());
    mainobj.setSatislar(200000);
    System.out.println(mainobj.getSatislar());
	}

	private static void variabllar() {
		// TODO Auto-generated method stub
		
	}

	
}
