
public class SmurfRunner {
public static void main(String[] args) {
Smurf Handy = new Smurf("Handy");
Handy.eat();
System.out.println(Handy.getName());
Smurf Papa = new Smurf("Papa Smurf");
System.out.println(Papa.getName());
System.out.println("My hat is " + Papa.getHatColor()+ ".");
System.out.println("I am a "+ Papa.isGirlOrBoy()+".");
Smurf Lady=new Smurf("Smurfette");
System.out.println(Lady.getName());
System.out.println("My hat is " + Lady.getHatColor()+ ".");
System.out.println("I am the only "+Lady.isGirlOrBoy());
}
}
