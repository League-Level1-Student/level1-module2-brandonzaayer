class Person {
	private String name;
	private String superpower;
	 String getName(){
		 return name;
	 }
	 String getSuperpower() {
		 return superpower;
		 
	 }
	void  setName(String name){
		 this.name=name;
		 }
	 void setSuperpower(String superpower){
		 this.superpower=superpower;
				 }
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " has mad " + superpower + " skills.";
	}
}