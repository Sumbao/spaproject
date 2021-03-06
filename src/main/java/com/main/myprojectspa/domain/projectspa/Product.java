package com.main.myprojectspa.domain.projectspa;
import com.main.myprojectspa.base.BaseEntity;
import flexjson.JSONSerializer;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Collection;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(inheritanceType = "TABLE_PER_CLASS")
@RooJson(deepSerialize = true)
public class Product extends BaseEntity {

    /**
     */
    private String productId;

    /**
     */
    private String productName;

    /**
     */
    private String productDetails;

    /**
     */
    private Float productPrice;

    /**
     */
    private String productPicture;

    /**
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productTypes")
    private ProductTypes productTypes;

    /**
     */
    public static String toJsonArray(Collection<Product> collection) {
        return new JSONSerializer().exclude("*.class").exclude("*.product").deepSerialize(collection);
    }

    /**
     */
    public String toJson() {
        return new JSONSerializer().exclude("*.class").exclude("*.product").deepSerialize(this);
    }

    /**
     */
    private Integer productweight;
}
