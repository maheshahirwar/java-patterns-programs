package com.sample.pattern.program.practice;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		square
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * * 
//		* * * * * * *
		System.out.println("=============***Square***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		Right half pyramid 
//		*             
//		* *           
//		* * *         
//		* * * *       
//		* * * * *     
//		* * * * * *   
//		* * * * * * *
		
		// Trick : j<=i, use square concept
		System.out.println("=============***Right Half Pyramid first way ***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println("=============***Right Half Pyramid second way ***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		
//		Reverse left half 
//		* * * * * * * 
//		  * * * * * * 
//		    * * * * * 
//		      * * * * 
//		        * * * 
//		          * * 
//		            * 
		// Trick : Use right half concept and just interchange if-else statement
		System.out.println("=============***Reverse Left Half Pyramid First way ***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j < i) {
					System.out.print("  ");
				} else {
					System.out.print("* "); // j>=i 
				}

			}
			System.out.println();
		}
		// Trick : Use right half concept and just change the sign '<' to '>'  : i.e j<=i to j>=i 
		System.out.println("=============***Reverse Left Half Pyramid Second way***==============");
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

		
//		Reverse right half
//		* * * * * * * 
//		* * * * * *   
//		* * * * *     
//		* * * *       
//		* * *         
//		* *           
//		*             

		// Trick : j<=n-i+1, use square concept
		System.out.println("=============***Reverse Right Half Pyramid First way***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("=============***Reverse Right Half Pyramid second way***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		Left half 
//		        * 
//		      * * 
//		    * * * 
//		  * * * * 
//		* * * * * 
//	  * * * * * * 
//	* * * * * * * 
		
//		Trick : use reverse right half concept and just interchange if-else statement 
		System.out.println("=============***Left Half Pyramid First way***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j < n - i + 1) {
					System.out.print("  ");
				} else {
					System.out.print("* "); // j>=n-i
				}
			}
			System.out.println();
		}
		//Trick : use reverse right half and just change '<' to '>' : i.e. j<=n-i+1 to j>=n-i+1
		System.out.println("=============***Left Half Pyramid Second way***==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= n - i+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		/**
		 * Let's summarized : 
		 * Square : use two loop 
		 *           for : i -> 1 to n
		 *               for : j -> 1 to n
		 *           and print star *
		 *           
		 * Right Half Pyramid : use square concept
		 *                      and add one condition
		 *          if j<=i -> print star *
		 *          else print space " "
		 *          
		 * Reverse Left Half Pyramid : use Right half concept
		 *                             and either follow one rule
		 *               rule.1 : interchange print statement from right half concept
		 *               rule.2 : just change sign '<' to '>' from condition
		 *                         i.e. if j<=i then change to j>=i
		 *                         
		 * Reverse Right Half Pyramid : use square concept
		 *                             and add one condition
		 *            if j<=n-i+1 -> print star *
		 *            else print space " "
		 *            
		 * Left Half Pyramid : use Reverse right half concept
		 *                     and either follow one rule
         *          rule.1 : interchange print statement from right half concept
         *          rule.2 : just change sign '<' to '>' from condition
         *                      i.e. if j<=n-i+1 then change to j>=n-i+1  
         *                      
         *                                                                                      
         * To summarized : you just need to know the concept of right half and reverse right half then you can easily make others two pyramid.
         *                 right half ==> make reverse left half
         *                 reverse right half ==> make left half 
		 */
		
		
		
		// left half + right half = triangle 1
		System.out.println("========***** Triangle 1****=================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (j <= n) {
					if (j > n - i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else {
					if (j < n + i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

		// use left half pyramid and print one space instead of two in else condition
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

		// reverse left half pyramid
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

		// right pyramid + reverse right pyramid = pascal's triangle
		System.out.println("===========****Right Pascal's Triangle****============");
		int line = 1;
		for (int i = 1; i < n; i++) {
			boolean space = line % 2 != 0;
			for (int j = 1; j <= i; j++) {
				if (space) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				space = !space;
			}
			System.out.println();
			line++;
		}
		for (int i = 1; i <= n; i++) {
			boolean space = line % 2 != 0;
			for (int j = 1; j <= n - i + 1; j++) {
				if (space) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				space = !space;
			}
			System.out.println();
			line++;
		}

		// use pascal's triangle and reverse pascal's triangle = butterfly pattern
		System.out.println("===========**** Butterfly Pattern ****============");
		line = 1;
		for (int i = 1; i < n; i++) {
			boolean space = line % 2 != 0;
			boolean reverseSpace = true;
			for (int j = 1; j <= n * 2; j++) {
				if (j <= i) {
					if (space) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					space = !space;
				} else if (j > n * 2 - i) {
					if (reverseSpace) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					reverseSpace = !reverseSpace;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			line++;
		}
		for (int i = 1; i <= n; i++) {
			boolean space = line % 2 != 0;
			boolean reverseSpace = true;
			for (int j = 1; j <= n * 2; j++) {
				if (j <= n - i + 1) {
					if (space) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					space = !space;
				} else if (j >= n + i) {
					if (reverseSpace) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					reverseSpace = !reverseSpace;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			line++;
		}

		// reverse right half pyramid + right half pyramid = k-pattern
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

		// reverse triangle + triangle = x-pattern
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

		// triangle + reverse triangle = diamond pattern
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

		// use square pattern
		System.out.println("===========**** Rhombus Pattern ****================");
		int maxSpace = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1) {
					int space = 0;
					while (space < maxSpace) {
						System.out.print(" ");
						space++;
					}
				} else {
					System.out.print("* ");
				}

			}
			System.out.println();
			maxSpace++;
		}

		System.out.println("==========**** Shap boundary pattern ****==============");

		// square
		System.out.println("====Square shap ========");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// use triangle
		System.out.println("==========Right angle Triangle shape==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1 || i == n || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("=========Triangle 1 shap ============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {

				if (j <= n) {
					if (j == n - i + 1 || i == n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else {
					if (j == n + i - 1 || i == n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

		System.out.println("=============***Triangle 2 shape ***==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1 || j == n || i == n) {
					System.out.print("* ");
				} else {
					if (j > n - i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

		System.out.println("=============***Reverse Triangle 2 Shap ***==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == n || i == 1) {
					System.out.print("* ");
				} else {
					if (j > i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}

				}

			}
			System.out.println();
		}

		System.out.println("===========****X-Pattern Shap ****============");

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == n || i == 1) {
					System.out.print("* ");
				} else {
					if (j > i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}

				}

			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1 || j == n || i == n) {
					System.out.print("* ");
				} else {
					if (j > n - i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

		System.out.println("===========****Diamond-Pattern Shap ****============");

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1 || j == n || i == n) {
					System.out.print("* ");
				} else {
					if (j > n - i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == n) {
					System.out.print("* ");
				} else {
					if (j > i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}

				}

			}
			System.out.println();
		}

		System.out.println("==========*****Numbers patterns *****===========");
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}

		System.out.println("========***** Characters Patterns *****==============");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 'A' - 1) + " ");
			}
			System.out.println();
		}
//
		System.out.println("============ ****** Increment characters ******==========");
		char inc = 'a';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (inc++) + " ");
			}
			System.out.println();
		}

		System.out.println("===========**********Alphbets Patterns*******===============");

//	       * 
//	      * * 
//	     *   * 
//	    * * * * 
//	   *       * 
//	  *         * 
//	 *           * 
		System.out.println("=======********A-pattern********==========");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1 || j == n) {
					System.out.print("* ");
				} else {
					if (j > n - i) {
						if (i == (n + 1) / 2) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

//		* * * * * *   
//		*           * 
//		*           * 
//		* * * * * *   
//		*           * 
//		*           * 
//		* * * * * *   
		System.out.println("==========********B-pattern*******====================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j != n && (j == 1 || i == 1 || i == n || i == (n + 1) / 2)
						|| (j == n && !(j == 1 || i == 1 || i == n || i == (n + 1) / 2))) {
					System.out.print("* ");
				} else {

					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		    * * * * * * 
//		  *             
//		  *             
//		  *             
//		  *             
//		  *             
//		    * * * * * * 
		System.out.println("========*********C-pattern******===============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j != 1 && (i == 1 || i == n)) || (j == 1 && !(i == 1 || i == n))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * *   
//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		* * * * * *   
		System.out.println("=======******D-pattern*********==================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j != n && (j == 1 || i == 1 || i == n) || (j == n && !(j == 1 || i == 1 || i == n))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * * * 
//		*             
//		*             
//		* * * * * * * 
//		*             
//		*             
//		* * * * * * * 
		System.out.println("===========**********E-pattern***********==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n || i == (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * * * 
//		*             
//		*             
//		* * * * * * * 
//		*             
//		*             
//		*             
		System.out.println("===========**********F-pattern***********==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		    * * * * *   
//		  *           * 
//		  *             
//		  *   * * * * * 
//		  *       *   * 
//		  *       *   * 
//		    * * *     * 
		System.out.println("============***********G-pattern********===========");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j != 1 && j != n && i == 1) || (j >= n / 2 && i == (n + 1) / 2)
						|| (j != 1 && i == n && j <= (n + 1) / 2) || (j == (n + 1) / 2 + 1 && i > (n + 1) / 2 && i != n)
						|| (j == n && (i > (n + 1) / 2 || (i != 1 && i < n / 2))) || (j == 1 && i != 1 && i != n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		*           * 
//		*           * 
//		* * * * * * * 
//		*           * 
//		*           * 
//		*           * 
		System.out.println("=============*************H-Pattern********================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * * * 
//		      *       
//		      *       
//		      *       
//		      *       
//		      *       
//		* * * * * * * 
		System.out.println("=============*************I-Pattern********================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * * * 
//		        *     
//		        *     
//		*       *     
//		*       *     
//		*       *     
//		  * * *       
		System.out.println("=============*************J-Pattern********================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || (j == (n + 1) / 2 + 1 && i != n) || (j == 1 && i >= (n + 1) / 2 && i != n)
						|| (i == n && j != 1 && j <= (n + 1) / 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*       *     
//		*     *       
//		*   *         
//		* *           
//		*   *         
//		*     *       
//		*       *     
		System.out.println("========********K-Pattern*********===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || (i < (n + 1) / 2 && i == (n + 1) / 2 - j + 2)
						|| (i > (n + 1) / 2 && i - (n + 1) / 2 + 2 == j) || (i == (n + 1) / 2 && j == 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*             
//		*             
//		*             
//		*             
//		*             
//		*             
//		* * * * * * * 
		System.out.println("==========*********L-Pattern*********================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		* *       * * 
//		*   *   *   * 
//		*     *     * 
//		*           * 
//		*           * 
//		*           * 
		System.out.println("============***********M-Pattern********===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (i <= (n + 1) / 2 && (i == j || i == n - j + 1))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		* *         * 
//		*   *       * 
//		*     *     * 
//		*       *   * 
//		*         * * 
//		*           * 
		System.out.println("============***********N-Pattern********===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		    * * * * *   
//		  *           * 
//		  *           * 
//		  *           * 
//		  *           * 
//		  *           * 
//		    * * * * *   
		System.out.println("============***********O-Pattern********===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((j == 1 || j == n) && (i != 1 && i != n)) || ((i == 1 || i == n) && (j != 1 && j != n))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * *  
//		*           * 
//		*           * 
//		* * * * * * 
//		*       
//		*       
//		*       
		System.out.println("===============***********P-Pattern******==================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j == 1 && i != 1) || ((i == 1 || i == (n + 1) / 2) && j != n)
						|| (j == n && (i != 1 && i < (n + 1) / 2))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		    * * * * *     
//		  * *         *   
//		  *   *       *   
//		  *     *     *   
//		  *       *   *   
//		  *         * *   
//		    * * * * * *   
//		                * 
		System.out.println("==========*********Q-Pattern**********==================");
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 1; j <= n + 1; j++) {
				if (((j == 1 || j == n) && (i != 1 && i < n)) || ((i == 1 || i == n) && (j != 1 && j < n))
						|| (i == j && i != 1 && j != 1) || (i == n + 1 && j == n + 1 && i == j)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * *   
//		*           * 
//		*           * 
//		* * * * * *   
//		*           * 
//		*           * 
//		*           * 
		System.out.println("==============***********R-Pattern************=====================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || ((i == 1 || i == (n + 1) / 2) && j != n) || (j == n && i != 1 && i != (n + 1) / 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		    * * * * *   
//		  *           * 
//		  *             
//		    * * * * *   
//		              * 
//		  *           * 
//		    * * * * *   
		System.out.println("===========************S-Pattern********=================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((i == 1 || i == (n + 1) / 2 || i == n) && (j != 1 && j != n))
						|| (j == 1 && i != 1 && i != n && (i < (n + 1) / 2 || i > (n + 1) / 2 + 1))
						|| (j == n && i != 1 && i != n && (i < (n + 1) / 2 - 1 || i > (n + 1) / 2))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * * * 
//		      *       
//		      *       
//		      *       
//		      *       
//		      *       
//		      *       
		System.out.println("=============*******T-Pattern********===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		*           * 
//		  * * * * *   
		System.out.println("=============**********U-Pattern*********==============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j == 1 || j == n) && i != n || (i == n && j != 1 && j != n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		 *         * 
//		  *       * 
//		   *     * 
//		    *   * 
//		     * * 
//		      * 
		System.out.println("===========************V-Pattern*******===========");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || j == n) {
					System.out.print("* ");
				} else {
					if (j > i) {
						System.out.print("  ");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

//		*           * 
//		  *       *   
//		    *   *     
//		      *       
		System.out.println("=============**********V-Pattern*********==============");
		for (int i = 1; i <= (n + 1) / 2; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i == n - j + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		*           * 
//		*           * 
//		*     *     * 
//		*   *   *   * 
//		* *       * * 
//		*           * 
		System.out.println("============***********W-Pattern********===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || (i >= (n + 1) / 2 && (i == j || j == n - i + 1))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		  *       *   
//		    *   *     
//		      *       
//		    *   *     
//		  *       *   
//		*           * 
		System.out.println("==========**********X-Pattern***********===============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i == n - j + 1 || j == n - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		*           * 
//		  *       *   
//		    *   *     
//		      *       
//		      *       
//		      *       
//		      *       
		System.out.println("==========**********Y-Pattern***********===============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((i == j || i == n - j + 1) && i <= (n + 1) / 2) || j == (n + 1) / 2 && i > (n + 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

//		* * * * * * * 
//		          *   
//		        *     
//		      *       
//		    *         
//		  *           
//		* * * * * * * 
		System.out.println("==========**********Z-Pattern***********===============");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || i == n - j + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("===========********** Heart Pattern *********=============");

		// When n is odd, start with two star
//	  --**-----**--
//	  -****---****- 
//	  ******-******  
//	  *************   
//	  -***********-
//	  --*********--
//	  ---*******---
//	  ----*****----
//	  -----***-----
//	  ------*------

		// When n is even, start with one star
//		  -- *-----* --
//		  - ***---*** -       
//		   *****-*****  
//		  -***********-
//		  --*********--
//		  ---*******---
//		  ----*****----
//		  -----***-----
//		  ------*------

		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				int left = n / 2;
				int right = n + left;

				if (n % 2 != 0) {
					if ((j <= left && j > left - i) || (j > left && j <= n && j <= left + i)
							|| (j > n && j <= right && j > right - i) || j <= right + i && j > right) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if ((j <= left && j > left - i) || (j > left && j <= n && j < left + i)
							|| (j > n && j <= right && j > right - i) || (j < right + i && j > right)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
//		// It just a reverse triangle 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if ((j <= n && j >= i) || (j > n && j <= n * 2 - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		
		System.out.println("=========********Heart Pattern 1 *******================");

		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				int left = n / 2, right = n + left;
				if (n % 2 != 0) {
					if ((j <= left && j == left - i + 1) || (j > left && j <= n && j == left + i)
							|| (j > n && j <= right && j == right - i + 1) || (j == right + i && j > right)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else {
					if ((j <= left && j == left - i + 1) || (j > left && j <= n && j == left + i - 1)
							|| (j > n && j <= right && j == right - i + 1) || (j == right + i - 1 && j > right)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
//		// It just a reverse triangle 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if ((j <= n && j == i) || (j > n && j == n * 2 - i)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
//		
//		// Thank you pattern
		StringBuilder sb = new StringBuilder();
		thankYouPattern(n, sb);
		System.out.println(sb);
	}

	private static void thankYouPattern(int n, StringBuilder sb) {
		String str = String.format("%-120s", "").replaceAll(" ", "~");
		sb.append(str);
		sb.append("\n");
		for (int i = 1; i <= n; i++) {

			StringBuilder s = new StringBuilder();
			s.append("| ");
			// T
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == (n + 1) / 2) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}
			String spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());
			// H
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == (n + 1) / 2) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}
			spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());

			// A
			for (int j = 1; j <= n; j++) {
				if (j == n - i + 1 || j == n) {
					s.append("* ");
				} else {
					if (j > n - i) {
						if (i == (n + 1) / 2) {
							s.append("* ");
						} else {
							s.append("  ");
						}
					} else {
						s.append(" ");
					}
				}
			}
			spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());

			// N
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == j) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}
			spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());

			// K
			for (int j = 1; j <= n; j++) {
				if (j == 1 || (i < (n + 1) / 2 && i == (n + 1) / 2 - j + 2)
						|| (i > (n + 1) / 2 && i - (n + 1) / 2 + 2 == j) || (i == (n + 1) / 2 && j == 2)) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}

			spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());

			// Y
			for (int j = 1; j <= n; j++) {
				if (((i == j || i == n - j + 1) && i <= (n + 1) / 2) || j == (n + 1) / 2 && i > (n + 1) / 2) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}
			spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());

			// O
			for (int j = 1; j <= n; j++) {
				if (((j == 1 || j == n) && (i != 1 && i != n)) || ((i == 1 || i == n) && (j != 1 && j != n))) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}
			spaces = String.format("%-15s", s.toString());
			sb.append(spaces);
			s.delete(0, s.length());

			// U
			for (int j = 1; j <= n; j++) {
				if ((j == 1 || j == n) && i != n || (i == n && j != 1 && j != n)) {
					s.append("* ");
				} else {
					s.append("  ");
				}
			}

			spaces = String.format("%-13s", s.toString());
			sb.append(spaces);
			sb.append("|");
			s.delete(0, s.length());
			sb.append("\n");
		}
		str = String.format("%-120s", "").replaceAll(" ", "~");
		sb.append(str);
	}
}
