package edu.iit.sat.itmd4515.malinkil.fp.domain;

import java.io.Serializable;

/**
 *
 * @author mithun.alinkil
 */
public class BookPurchaseDomain implements Serializable {
    
    private static final long serialVersionUID=1l;
    
    private int sellerId;
    private String title;
    private String version;
    private String author;
    private String category;
    private int quantity;


    public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



 
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
