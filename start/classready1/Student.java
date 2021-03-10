package classready1;

public class Student implements Comparable<Student> {
	public String name;
	public int id;
	public String score;

	public Student(String name, int id, String score) {
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

	public String getScore() {
		return this.score;
	}

	@Override
	public int compareTo(Student s) {
		if(this.id<s.getId()) {
			return 1;
		}
		else if(this.id>s.getId()) {
			return -1;
		}
		else {
			if(this.score.length()<s.getScore().length()) {
				return 1;
			}
			else if(this.score.length() > s.getScore().length()){
				return -1;
			}
		}
		return 0;
	}
}
