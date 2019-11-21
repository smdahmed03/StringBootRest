package com.rest.beans;

public class StandardCal {

	public StandardCalBean STCalulator(double first, String operator, double second) {
		
		StandardCalBean stbn = new StandardCalBean();
		stbn.setFirstnum(first);
		stbn.setSecondnum(second);
		stbn.setOperator(operator);
		switch (operator) {
		case "add":
			stbn.setTotalval(first + second);
			break;
		case "sub":
			stbn.setTotalval(first - second);
			break;
		case "mul":
			stbn.setTotalval(first * second);
			break;
		case "div":
			stbn.setTotalval(first / second);
			break;
			
		default:
			break;
		}
		
		//return Double.toString(stbn.getTotalval());
		return stbn;
	}
	
	public StandardCalBean SciCalulator(double first, String operator) {
		
		StandardCalBean stbn = new StandardCalBean();
		switch (operator) {
		case "sqr":
			stbn.setTotalval(first * first);
			break;
		case "pri":
			int k,i,m, flag = 0;
			m= (int)first/2;
			if(first==0||first==1){
				stbn.setMesgval(first+" is not prime number");    
				  }else{
				   for(i=2;i<=m;i++){
				System.out.println(i+" is number");    
				    if(first%i==0){    
				    	stbn.setMesgval(first+" is not prime number");    
				     flag=1;    
				     break;    
				    }  
				    }
				   }
			if(flag == 0) {
				stbn.setMesgval(first+"is Prime number");
			}
			break;
		case "fact":
			int f,fact=1;     
			  for(i=1;i<=first;i++){    
			      fact=fact*i;       
			 }  
			stbn.setMesgval("Factorial of "+first+" is: "+fact);
			break;
			
		default:
			break;
		}
		
		return stbn;		
		
	}
}
