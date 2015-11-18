/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * CategorisationRules generated by hbm2java
 */
@Entity
@Table(name="categorisation_rules"
)
public class CategorisationRules  implements java.io.Serializable
 {


private Integer id;


@Type(type="DateTime")
private LocalDateTime dateTime;
private String coreSystem;
private String classificationName;
private String category;
private String comment;
private String who;


@Type(type="DateTime")
private LocalDateTime updatedTimestamp;

    public CategorisationRules() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="id", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="date_time")
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    

    @Column(name="core_system", length=65535)
    public String getCoreSystem() {
        return this.coreSystem;
    }
    
    public void setCoreSystem(String coreSystem) {
        this.coreSystem = coreSystem;
    }

    

    @Column(name="classification_name", length=65535)
    public String getClassificationName() {
        return this.classificationName;
    }
    
    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    

    @Column(name="category", length=65535)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    

    @Column(name="COMMENT", length=65535)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    

    @Column(name="who", length=65535)
    public String getWho() {
        return this.who;
    }
    
    public void setWho(String who) {
        this.who = who;
    }

    

    @Column(name="updated_timestamp")
    public LocalDateTime getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
    
    public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof CategorisationRules) )
		 return false;

		 CategorisationRules that = ( CategorisationRules ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}
