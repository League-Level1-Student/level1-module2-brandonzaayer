
public class TeaParty {

 public String welcome(String name, boolean isWoman, boolean isKnighted)
 {
	if(isKnighted==true && isWoman==false) {
		return "Hello Sir "+ name;
	}
	else if (isKnighted==false && isWoman==false) {
		return "Hello Mr. " + name;
	}
	else if (isKnighted==true && isWoman==true) {
		return "Hello Lady " + name;
	}
	else {
		return "Hello Ms. " + name;
	}
	
 }
}
	