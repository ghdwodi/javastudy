class Ex04 
{
	int su = 10;
	int su2 = 5;
	// 이하 모든 add는 이름은 같지만 매개변수는 각기 다른 별개의 메소드이다.
	// 이렇게 같은 이름의 다른 메소드를 여러 개 만드는 것을 중복정의(overloading)라고 한다.
	
	public int add(){
		return su+su2;
	}

	public int add(int a){
		return a + 1000;
	}

	public int add(int a, int b){
		return a + b;
	}

	public int add(String a, String b){
		return (Integer.parseInt(a) + Integer.parseInt(b));
	}

	public int add(int a, String b){
		return (a + Integer.parseInt(b));
	}

	public int add(String b, int a){
		return (a + Integer.parseInt(b));
	}
}
