/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * ComparisonRules generated by hbm2java
 */
@Entity
@Table(name="comparison_rules"
)
public class ComparisonRules  implements java.io.Serializable
 {


private Integer id;
private String coreSystem;
private BigDecimal dataOrder;
private String dataItem;
private String operator;

    public ComparisonRules() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="id", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="core_system", length=65535)
    public String getCoreSystem() {
        return this.coreSystem;
    }
    
    public void setCoreSystem(String coreSystem) {
        this.coreSystem = coreSystem;
    }

    

    @Column(name="data_order", precision=20)
    public BigDecimal getDataOrder() {
        return this.dataOrder;
    }
    
    public void setDataOrder(BigDecimal dataOrder) {
        this.dataOrder = dataOrder;
    }

    

    @Column(name="data_item", length=65535)
    public String getDataItem() {
        return this.dataItem;
    }
    
    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    

    @Column(name="operator", length=65535)
    public String getOperator() {
        return this.operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof ComparisonRules) )
		 return false;

		 ComparisonRules that = ( ComparisonRules ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}
