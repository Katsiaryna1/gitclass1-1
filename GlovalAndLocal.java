package Thursday;

public class GlovalAndLocal {
	public class globalandlocal {
		//global variables
		int g1=2;//trump
		char g2;
		
	public int getG1() {
		    int local1=1;
		    System.out.println(local1);
			return g1;
			
		}

		public void setG1(int g1) {
			//System.out.println(local1);
			System.out.println(g1);
			this.g1 = g1;
		}

		public char getG2() {
			return g2;
		}

		public void setG2(char g2) {
			this.g2 = g2;
		}

	public static void main(String[] args) {
		globalandlocal gg=new globalandlocal();
		System.out.println(gg.g1);
		globalandlocal gg2=new globalandlocal();
		System.out.println(gg2.g1);
		


}
