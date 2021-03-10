package third;

class Student1 implements Comparable<Student1>{
	String name;
	int id;
	int score;
	
	public Student1(String name, int id, int score) {
		this.name=name;
		this.id=id;
		this.score=score;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public int getSCore() {
		return this.score;
	}
	
	@Override
	public int compareTo(Student1 s) {
		if(this.id<s.getId()) {
			return -1;
		}
		else if(this.id>s.getId()) {
			return 1;
		}
		return 0;
	}
	
	
}
