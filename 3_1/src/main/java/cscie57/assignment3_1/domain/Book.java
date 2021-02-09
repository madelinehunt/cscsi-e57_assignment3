package cscie57.assignment3_1.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Version
    @Column(name = "VERSION")
    private int version;
    
    @NotBlank(message="{validation.categoryName.NotBlank.message}")
    @Size(min=3, max=100, message="{validation.categoryName.Size.message}")
    @Column(name = "CATEGORY_NAME")
    private String categoryName;
    
    @NotBlank(message="{validation.isbn.NotBlank.message}")
    @Size(min=9, max=20, message="{validation.isbn.Size.message}")
    @Column(name = "ISBN")
    private String isbn;
    
    @NotBlank(message="{validation.title.NotBlank.message}")
    @Size(min=1, max=200, message="{validation.title.Size.message}")
    @Column(name = "TITLE")
    private String title;
    
    @NotBlank(message="{validation.publisher.NotBlank.message}")
    @Size(min=1, max=100, message="{validation.publisher.Size.message}")
    @Column(name = "PUBLISHER")
    private String publisher;
    
    @NotNull(message="{validation.price.NotBlank.message}")
    @Column(name = "PRICE")
    private Double price;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public int getVersion() {
        return version;
    }
    
    public void setVersion(int version) {
        this.version = version;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return "Book - Id: " + id + ", Category name: " + categoryName + ", ISBN: " + isbn  + ", Title: " + title + ", Publisher: " + publisher + ", Price: " + price;
    }
}
