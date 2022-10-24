package model;

import Cluster.Centre;
import Cluster.Points;

public class Distance {
	public double pointstopoints(Points p1, Points p2){
		double sum = 0;
		for(int i=1;i<CONSTANT.numsOfFields-1;i++) {
			sum += Math.pow(Float.parseFloat(p1.getProperties()[i])-Float.parseFloat(p2.getProperties()[i]), 2);
		};
		
		return Math.sqrt(sum);
		
		
	}
	
	public double pointstocentre(Points p, Centre c){
		double sum = 0;
		for(int i=1;i<CONSTANT.numsOfFields-1;i++) {
			sum += Math.pow(Float.parseFloat(p.getProperties()[i])-c.getDegree()[i], 2);
		};
		
		return Math.sqrt(sum);
		
		
	}
}
