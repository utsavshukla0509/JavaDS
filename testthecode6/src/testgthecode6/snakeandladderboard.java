package testgthecode6;

import java.util.Scanner;

public class snakeandladderboard {
	    public static int mini = Integer.MAX_VALUE;
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			while (t>0){
				
				int n=scn.nextInt();
				int arr[]=new int[101];
				for (int i=0;i<101;i++){
					arr[i]=0;
				}
				for (int i=0;i<n;i++){
					int a,b;
					a=scn.nextInt();
					b=scn.nextInt();
					arr[a]=b;
				}
				int r=scn.nextInt();
				int snakes[]=new int[101];
				for (int i=0;i<101;i++){
					snakes[i]=0;
				}
				for (int i=0;i<r;i++){
					int a,b;
					a=scn.nextInt();
					b=scn.nextInt();
					snakes[a]=b;
				}
				int visited[]=new int[101];
				for (int i=0;i<101;i++){
					visited[i]=0;
				}
				ch(1,arr,snakes,visited,0);
	            if (mini==Integer.MAX_VALUE)
	            System.out.println(-1);
	            else
				System.out.println(mini);
				mini = Integer.MAX_VALUE;
				t--;
			}

		}
		
		public static void ch(int curr,int[] ladders,int[] snakes,int[] visited,int count){
			if (curr>100){
				return;
			}
			if (visited[curr]!=0 && count>visited[curr]){
				return;
			}
			if (curr==100){
					if (mini>count){
						mini=count;
					}
					return;
			}
			visited[curr]=count;
			for (int i=1;i<=6;i++){
				int temp = curr + i;
				if (temp<=100){
				
				if (ladders[temp]!=0){
					temp=ladders[temp];
				}  
				else if (snakes[temp]!=0){
					temp=snakes[temp];
				}
				
				ch(temp,ladders,snakes,visited,count+1);
			}}
						
		}

	}
