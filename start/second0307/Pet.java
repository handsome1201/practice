package second0307;

public class Pet {
	String petname;
	String mastername;
	
	
	public Pet(String petname, String mastername) {
		this.petname=petname;
		this.mastername=mastername;
	}
	
	public String getPetName() {
		return petname;
	}
	public String getMasterName() {
		return mastername;
	}
	
	public void introduce() {
		System.out.println("제이릉은 "+mastername+"입니다.");
		System.out.println("제 애완동물 이름은 "+petname+"입니다.");
	}
}

