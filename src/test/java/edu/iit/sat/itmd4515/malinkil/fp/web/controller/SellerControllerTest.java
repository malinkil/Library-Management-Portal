package edu.iit.sat.itmd4515.malinkil.fp.web.controller;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerDomain;
import edu.iit.sat.itmd4515.malinkil.fp.manager.SellerManager;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class SellerControllerTest {
	
	@Autowired
	private SellerManager sellerManager;

	//@Test	
	public void addSeller() {
		SellerDomain sellerDomain = new SellerDomain();
		sellerDomain.setSellerId(1);
		sellerManager.addSeller(sellerDomain);
	}

	//@Test
	public void getSellers() {
		System.out.println(sellerManager.getSellers().size());
	}

	//@Test
	public void deleteSeller() {		

		sellerManager.deleteSeller(1);
	}

	//@Test
	public void updateSeller() {
		SellerDomain sellerDomain = new SellerDomain();
		sellerDomain.setSellerId(1);
		sellerManager.updateSeller(sellerDomain);
	}

	//@Test
	public  void getSellerBySellerId() {
		//System.out.println(sellerManager.getSellerBySellerId(1).getSellerName());
	}

	@Test
	public void getSellerBySellerName() {
		//System.out.println(sellerManager.getSellerBySellerId(1).getSellerName());
	}
		
		
}
