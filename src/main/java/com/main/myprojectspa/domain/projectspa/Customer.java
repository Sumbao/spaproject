package com.main.myprojectspa.domain.projectspa;
import com.main.myprojectspa.base.BaseEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.json.RooJson;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(inheritanceType = "TABLE_PER_CLASS")
@RooJson(deepSerialize = true)
public class Customer extends BaseEntity {

    /**
     */
    private String userId;

    /**
     */
    private String userPassword;

    /**
     */
    @Min(0L)
    @Max(1L)
    private Integer loginstatus;

    /**
     */
    private String customerName;

    /**
     */
    private String customerAddr;

    /**
     */
    private String customerEmail;

    /**
     */
    private Integer customerAge;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date customerBirthDay;

    /**
     */
    private String customerTel;

    /**
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerTypes")
    private CustomerType customerTypes;
}
