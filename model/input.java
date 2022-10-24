package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import Cluster.Points;

public class input {
    String datafile ="./data/Iris.csv";
    File file = new File(datafile);
    String line = "" ;
    
    public String[] thuocTinh;
    public List<Points> points = new ArrayList<>();
    public void inputdata(){
    	
    
    try (BufferedReader br = new BufferedReader(new FileReader(datafile))) {
    	line = br.readLine();
    	thuocTinh = line.split(",");
    	
    	for (String o : thuocTinh) {
			System.out.println(o);
			CONSTANT.numsOfFields++;
		}

        while((line = br.readLine())!= null && !line.isEmpty()){

                String field[] = line.split(",");
                Points p = new Points(field);
                points.add(p);
                                
        }
        
        for(Points p: points) {
        	System.out.println(p.toString());
        	CONSTANT.numsOfPoints++;
        }
        
        System.out.println("Số điểm: "+ CONSTANT.numsOfPoints +  "   Số trường: "+ CONSTANT.numsOfFields);
    } catch (Exception e) {
        // TODO: handle exception
    }
    
    
}
}
