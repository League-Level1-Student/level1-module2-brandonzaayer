

public class TeaDrinker {
public static void main(String[] args) {
	TeaBag m = new TeaBag ("Mint");
	m.getFlavor();
	Kettle mm = new Kettle();
	mm.getWater();
	mm.boil();
	Cup mmm = new Cup();
	mmm.makeTea(m, mm.getWater());
}
}
