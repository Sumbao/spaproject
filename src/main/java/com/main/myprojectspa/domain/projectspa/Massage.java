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
public class Massage extends BaseEntity {

    /**
     */
    private String massageCode;

    /**
     */
    private String massageName;

    /**
     */
    private String massageDetail;

    /**
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "massageTypes")
    private MassageTypes massageTypes;

    /**
     */
    public String toJson() {
        return new JSONSerializer().exclude("*.class").exclude("*.massage").deepSerialize(this);
    }

    /**
     */
    public static String toJsonArray(Collection<Massage> collection) {
        return new JSONSerializer().exclude("*.class").exclude("*.massage").deepSerialize(collection);
    }

    /**
     */
    private Integer massageTime;
}
