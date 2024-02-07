package gitexample2;

public class GitJavaProgram {

	public static void main(String[] args) {
		String str = "i am automation tester";
		String ss[] = str.split(" ");
		for(int i=ss.length-1;i>=0;i--) {
			System.out.print(ss[i]+" ");
			System.out.println("extra");
		}

		}

	}


