

														
										//**************@author Tabasum Wahab - 14SW61******************//

		package javaApplication;

			import java.io.IOException;


			public class JavaApplication {

				/**
				* @param args the command line arguments
				*/
				// ************* API for addition of two numbers*****************

					/**
					* This method is used to add two integer numbers.
					   * num1  is the first paramter to addNum method
					   * num2  This is the second parameter to addNum method
					   * @return int This returns sum of num1 and num2.
					   */
			public class AddNum {
   
				public int addNum(int num1, int num2) {
					return num1 + num2;
				}

				   /**
				   * This is the main method which makes use of addNum method.
				   * @exception IOException On input error.
				   * @see IOException
				   */

			public static void main(String args[]) throws IOException {
				AddNum obj = new AddNum();
				int sum = obj.addNum(25, 25);
				System.out.println("Sum of 25 and 25 is :" + sum);
			}
			}


				//API for the arrays put some values in the array, and prints each value to standard output


				/** ArrayDemo, creates an array of integers, puts some values in the array, and prints each value to standard output. 
				 * 
				 * int[]anArray declares an array of integers. anArray = new int[10] allocates memory for 10 integers.  */


					class ArrayDemo {

						public static void main(String[] args) {
							// declares an array of integers
							int[] anArray;

							// allocating memory for 5 integer numbers
							anArray = new int[5];
							   
							// initializing elements
							anArray[0] = 100;
							anArray[1] = 200;
							anArray[2] = 300;
							anArray[3] = 400;
							anArray[4] = 500;
        

								System.out.println("Element at index 0: "+ anArray[0]);
								System.out.println("Element at index 1: " + anArray[1]);
								System.out.println("Element at index 2: "+ anArray[2]);
								System.out.println("Element at index 3: "+ anArray[3]);
								System.out.println("Element at index 4: "+ anArray[4]);
     
						}
					}
			} 
