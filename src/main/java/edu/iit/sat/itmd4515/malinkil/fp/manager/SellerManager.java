package edu.iit.sat.itmd4515.malinkil.fp.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerPurchaseDomain;
import edu.iit.sat.itmd4515.malinkil.fp.service.Seller;


@Component("sellerManager")
public class SellerManager {
	
	@Autowired
	private Seller seller;
	
	public void addSeller(SellerDomain sellerDomain) {
		
		try{
		seller.addSeller(sellerDomain);
	} catch(Exception ex){
		ex.printStackTrace();
	}

	}
	public List<SellerDomain> getSellers() {
		return seller.getSellers();
	}

	
	public void deleteSeller(int sellerId) {		
		seller.deleteSeller(sellerId);
	}

	
	public void updateSeller(SellerDomain sellerDomain) {
		seller.updateSeller(sellerDomain);
	}

	
	public SellerDomain getSellerBySellerId(int sellerId) {
		return seller.getSellerBySellerId(sellerId);
	}

	
	public SellerDomain getSellerBySellerName(String sellerName) {
		return seller.getSellerBySellerName(sellerName);
	}
	
	public void purchaseBook(SellerPurchaseDomain purchaseDomain) {
		seller.purchaseBook(purchaseDomain);
	}


}
