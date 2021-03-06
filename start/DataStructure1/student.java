package DataStructure1;

class student implements Comparable<Student>{
	String name;
	int id;
	int score;

	public student(String name, int id, int score) {
		this.name=name;
		this.id=id;
		this.score=score;
	}

	public String getname() {
		return this.name;
	}
	public int getid() {
		return this.id;
	}
	public int getscore() {
		return this.score;
	}

	@Override
	public int compareTo(student s) {
		if(this.id<getid()) {
			return -1;
		}
		else if(this.id>getid()){
			return 1;
		}
		else {
			return 0;
		}
	}
}


