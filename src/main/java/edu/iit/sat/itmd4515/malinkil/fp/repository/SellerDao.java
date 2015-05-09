package edu.iit.sat.itmd4515.malinkil.fp.repository;


import java.util.List;

import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerPurchaseDomain;



public interface SellerDao {
	void addSeller(SellerDomain sellerDomain);
	List<SellerDomain> getSellers();
	void deleteSeller(int sellerId);
	void updateSeller(SellerDomain sellerDomain);
	SellerDomain getSellerBySellerId(int sellerId);
	SellerDomain getSellerBySellerName(String sellerName);
	void purchaseBook(SellerPurchaseDomain purchaseDomain);

}
