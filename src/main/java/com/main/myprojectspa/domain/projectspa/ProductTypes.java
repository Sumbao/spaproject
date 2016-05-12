package com.main.myprojectspa.domain.projectspa;
import com.main.myprojectspa.base.BaseEntity;
import flexjson.JSONSerializer;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(inheritanceType = "TABLE_PER_CLASS")
@RooJson(deepSerialize = true)
public class ProductTypes extends BaseEntity {

    /**
     */
    private String productTypesName;

    /**
     */
    private String productTypesDescription;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "productTypes")
    private Set<Product> product = new HashSet<Product>();

    /**
     */
    public String toJson() {
        return new JSONSerializer()
                .exclude("*.class").exclude("*.producttypes").deepSerialize(this);
    }

    /**
     */
    public static String toJsonArray(Collection<ProductTypes> collection) {
        return new JSONSerializer()
                .exclude("*.class").exclude("*.producttypes").deepSerialize(collection);
    }

}
