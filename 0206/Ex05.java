class Ex05{
	public static void main(String[] args){
	// 4x4 ����� ǥ���غ���
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				System.out.print("0 ");
			}
		System.out.print("\n");
		}
		System.out.print("\n");
	// ��->�� �밢�����
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				int l;
				if (i==j){
					l=1;
				} else{		// else�� ������ ����� �ٸ��� ���´�(�����غ���)
					l=0;
				}
				System.out.print(l+" ");
			}
		System.out.print("\n");
		}
	}
}