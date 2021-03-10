package practicedata;


class WearableComputer implements wearable{
	public void puton() {
		System.out.println("컴퓨터 실행완료");
	}
	public void putoff() {
		System.out.println("컴퓨터 끔완료");
	}
	public void reset() {
		System.out.println("컴퓨터 재시작완료");
	}
}
