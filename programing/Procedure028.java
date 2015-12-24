package com.lava.procedure;
//   *   
//  * *  
// *   * 
//*     *
// *   * 
//  * *  
//   *  
public class Procedure028 {

	public static void main(String[] args) {
		int size=4;
		for(int i=1;i<=7;i++){
			// TODO Auto-generated method stub
			for(int j=1;j<=7;j++){
				if(j==size||j==8-size){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}				
			}
			System.out.println();
			
			if(i>=4){
				size++;
			}else{
				size--;
			}
		}
	}

}
