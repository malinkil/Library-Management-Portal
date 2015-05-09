package edu.iit.sat.itmd4515.malinkil.fp.repository.hibernate;


import java.util.List;






import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerDomain;
import edu.iit.sat.itmd4515.malinkil.fp.domain.SellerPurchaseDomain;
import edu.iit.sat.itmd4515.malinkil.fp.repository.SellerDao;


@Repository("sellerDao")
public class HibernateSellerDao extends HibernateDaoSupport implements SellerDao {
	
	@Autowired
	 public HibernateSellerDao(SessionFactory sessionFactory) {
	  setSessionFactory(sessionFactory);
	 }

	public void addSeller(SellerDomain sellerDomain) {		
		 this.getHibernateTemplate().save(sellerDomain);
	}

	public List<SellerDomain> getSellers() {
		return this.getHibernateTemplate().find("FROM SellerDomain");
	}

	public void deleteSeller(int sellerId) {
		SellerDomain Seller = this.getSellerBySellerId(sellerId);
		getHibernateTemplate().delete(Seller);
		
	}

	public void updateSeller(SellerDomain sellerDomain) {
		this.getHibernateTemplate().update(sellerDomain);
		
	}

	public SellerDomain getSellerBySellerId(int sellerId) {		
		return this.getHibernateTemplate().get(SellerDomain.class, sellerId);
	}

	public SellerDomain getSellerBySellerName(String sellerName) {
		List<SellerDomain> sellerList =  this.getHibernateTemplate().find("FROM SellerDomain where sellerName ='"+sellerName+"'");
		if(sellerList != null && sellerList.size() > 0){
			return sellerList.get(0);
		}
		return null;
	}

	public void purchaseBook(SellerPurchaseDomain purchaseDomain) {
		this.getHibernateTemplate().save(purchaseDomain);
	}

}
