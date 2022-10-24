package model;
import java.util.ArrayList;
import java.util.List;

import Cluster.Centre;
import Cluster.Points;

public class testmain {
    

    public static void main(String[] args) {
    	
        input Input = new input();
        Input.inputdata();

        List<Centre> centres = new ArrayList<>();
        for(int i=0;i<CONSTANT.numsOfClusters;i++) {
        	Centre c = new Centre();
        	c.randomCentre();
        	centres.add(c);
        }
        
        for(Centre c: centres) {
        	System.out.println(c.toString());
        }
    }
}
