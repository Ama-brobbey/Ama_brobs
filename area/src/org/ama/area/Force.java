package org.ama.area;

public class Force {
	double mass;
	double acceleration;
	

	public Force (double mass, double acceleration) {
		this. acceleration = acceleration; 
		this.mass =mass;
	}
		public double calcForce() {	
		double force  = mass*acceleration;
		return force;
	
	
		}
		
	
	public static void main(Stringgsstr args[]) {
		Force sc = new Force(500,0.05);
		double res =sc.calcForce();	
		System.out.println(res);
	}		
}

	


	


