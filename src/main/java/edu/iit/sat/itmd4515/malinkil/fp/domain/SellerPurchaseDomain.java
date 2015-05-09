package edu.iit.sat.itmd4515.malinkil.fp.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mithun.alinkil
 */
@Entity
@Table(name="seller_book_pr")
public class SellerPurchaseDomain implements Serializable {
    
    private static final long serialVersionUID=1l;
    
    @Id
    @GeneratedValue
    private int purchaseId;
    private int sellerId;
    private int quantity;
    private String purchaseDate;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchaseId")
    private Set<BookDomain> bookList = new HashSet<BookDomain>();

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }


    public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<BookDomain> getBookList() {
        return bookList;
    }

    public void setBookList(Set<BookDomain> bookList) {
        this.bookList = bookList;
    }
    
    
    
}
