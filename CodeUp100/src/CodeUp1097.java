import java.util.Scanner;

public class CodeUp1097 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[20][20];
		
	
		// 19*19 입력
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		// 십자 뒤집기 횟수 입력(n)
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			for(int j=1; j<=19; j++) {
				if(arr[x][j]==0) {
					arr[x][j]=1;
				} else {
					arr[x][j]=0;
				}
			}
			
			for(int k=1; k<=19; k++) {
				if(arr[k][y]==0) {
					arr[k][y]=1;
				} else {
					arr[k][y]=0;
				}
			}
		}
		
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
