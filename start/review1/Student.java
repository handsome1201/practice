package review1;

class Student implements Comparable<Student>{
	String name;
	int score;
	String review;
	
	public Student(String name, int score, String review) {
		this.name=name;
		this.score=score;
		this.review=review;
	}
	
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public String getReview() {
		return this.review;
	}
	
	@Override
	public int compareTo(Student s) {
		if(this.score<s.getScore()) {
			return 1;
		}
		else if(this.score>s.getScore()) {
			return -1;
		}
		else {
			if(this.review.length()<s.getReview().length()) {
				return 1;
			}
			else if(this.review.length()>s.getReview().length()) {
				return -1;
			}
		}
		return 0;
	}
}
