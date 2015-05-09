package edu.iit.sat.itmd4515.malinkil.fp.service;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerPurchaseDomain;
import edu.iit.sat.itmd4515.malinkil.fp.repository.SellerDao;


@Service("seller")
public class Seller {


	@Autowired
	private SellerDao sellerDao;
	
	
	public void addSeller(SellerDomain sellerDomain) {
		sellerDao.addSeller(sellerDomain);
	}

	
	public List<SellerDomain> getSellers() {
		return sellerDao.getSellers();
	}

	
	public void deleteSeller(int sellerId) {		
		sellerDao.deleteSeller(sellerId);
	}

	
	public void updateSeller(SellerDomain sellerDomain) {
		sellerDao.updateSeller(sellerDomain);
	}

	
	public SellerDomain getSellerBySellerId(int sellerId) {
		return sellerDao.getSellerBySellerId(sellerId);
	}

	
	public SellerDomain getSellerBySellerName(String sellerName) {
		return sellerDao.getSellerBySellerName(sellerName);
	}
	
	public void purchaseBook(SellerPurchaseDomain purchaseDomain) {
		sellerDao.purchaseBook(purchaseDomain);
	}

}
