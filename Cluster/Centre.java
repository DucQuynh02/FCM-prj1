package Cluster;

import java.util.Arrays;
import java.util.Random;

import model.CONSTANT;
public class Centre {
	private double degree[] = new double[CONSTANT.numsOfFields-1];
	// Trường 0 = 0.0.
	// numsOfFields-2 trường còn lại ứng với số trường dữ liệu.
	
	public void randomCentre() {
		Random gen = new Random();
		degree[0]=0;
		for(int i=1;i<CONSTANT.numsOfFields-1;i++) {
			degree[i]= gen.nextDouble();
	}
		
	
}


	public double[] getDegree() {
		return degree;
	}


	public void setDegree(double[] degree) {
		this.degree = degree;
	}


	@Override
	public String toString() {
		return "Centre [degree=" + Arrays.toString(degree) + "]";
	}
}