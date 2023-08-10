package com.dollop.adda.prunner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.cbean.Product;
import com.dollop.adda.crepo.Productrepo;
@Component
public class Productrunner implements CommandLineRunner {
@Autowired
	private Productrepo rr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product pob=new Product();
		pob.setProdId(5);
		pob.setProdCode("Stick");
		
		pob.setColors(Arrays.asList("RE","BL","YL"));
		//pob.setColors(List.of("RE","BL","YL"));
		
		Set<String> set=new LinkedHashSet<>();
		set.add("M1");
		set.add("LA");
		set.add("SA");

		pob.setModels(set);
		
		Map<String,String> map=new LinkedHashMap<>();
		map.put("D1", "ABC");
		map.put("D2", "XYZ");
		map.put("D3", "ANNA");
		pob.setDetails(map);
		
		rr.save(pob);
	}

}
