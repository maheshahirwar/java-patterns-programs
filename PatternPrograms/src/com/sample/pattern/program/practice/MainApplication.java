package com.sample.pattern.program.practice;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// square
		System.out.println("=============***Square***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("=============***Right Half Pyramid***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("=============***Reverse Left Half Pyramid***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		System.out.println("=============***Reverse Right Half Pyramid***==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("=============***Left Half Pyramid***==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		
		System.out.println("========***** Triangle 1****=================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if(j<=n) {
					if (j > n - i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}else {
					if (j < n+i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		
		
		System.out.println("=============***Triangle 2***==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		System.out.println("=============***Reverse Triangle***==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
		// right pyramid + reverse right pyramid 
		System.out.println("===========****Right Pascal's Triangle****============");
		
		for (int i = 1; i < n; i++) {
			boolean space = i%2!=0;
			for (int j = 1; j <= i; j++) {
				if(space) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				space = !space;	
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			boolean space = i%2!=0;
			for (int j = 1; j <= n - i + 1; j++) {
				if(space) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				space = !space;	
			}
			System.out.println();
		}
		
		
       System.out.println("===========**** Butterfly Pattern ****============");
		
		for (int i = 1; i < n; i++) {
			boolean space = i%2!=0;
			boolean reverseSpace = true;
			for (int j = 1; j <= n*2; j++) {
				if(j<=i) {
					if(space) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
					space = !space;	
				}else if(j>n*2-i){
					if(reverseSpace) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
					reverseSpace = !reverseSpace;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			boolean space = i%2!=0;
			boolean reverseSpace = true;
			for (int j = 1; j <= n*2; j++) {
				if(j<=n-i+1) {
					if(space) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
					space = !space;	
				}else if(j>=n+i) {
					if(reverseSpace) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
					reverseSpace = !reverseSpace;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
		//reverse right half pyramid + right half pyramid = k-pattern 
		System.out.println("===========****K-Pattern****============");
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// reverse left half pyramid + left half pyramid = reverse k-pattern
		System.out.println("===========****Reverse K-Pattern****============");
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		
		//reverse triangle + triangle = x-pattern
		System.out.println("===========****X-Pattern****============");
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
		// triangle + reverse triangle = diamond 
		System.out.println("===========****Diamond-Pattern****============");
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
		
		System.out.println("===========**** Rhombus Pattern ****================");
		int maxSpace = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1) {
					int space = 0;
					while(space<maxSpace) {
						System.out.print(" ");
						space++;
					}
				}else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
			maxSpace++;
		}
		
		
		System.out.println("==========**** Shap boundary pattern ****==============");
		
		System.out.println("====Square shap ========");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("==========Triangle shap==============");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n-i+1 ||i==n || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("=========Triangle shap ============");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if(j<=n) {
					if (j == n - i+1 || i==n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}else {
					if (j == n+i-1 || i==n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		
	}

}

/*

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *



-* * * *
--* * * *
---* * * *
----* * * *
-----* * * *

*/

/*
 * --*-- -*-*-
 * 
 * 
 */