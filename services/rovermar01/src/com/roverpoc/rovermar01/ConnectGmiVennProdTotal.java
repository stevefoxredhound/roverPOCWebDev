/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rovermar01;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;



/**
 * ConnectGmiVennProdTotal generated by hbm2java
 */
@Entity
@Table(name="`CONNECT_GMI_Venn_Prod_Total`"
)

public class ConnectGmiVennProdTotal  implements java.io.Serializable {

    private BigDecimal count___;

    public ConnectGmiVennProdTotal() {
    }


    @Id 
    

    @Column(name="`COUNT(*)`", precision=38)
    public BigDecimal getCount___() {
        return this.count___;
    }
    
    public void setCount___(BigDecimal count___) {
        this.count___ = count___;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof ConnectGmiVennProdTotal) )
		    return false;

		 ConnectGmiVennProdTotal that = (ConnectGmiVennProdTotal) o;

		 return ( (this.getCount___()==that.getCount___()) || ( this.getCount___()!=null && that.getCount___()!=null && this.getCount___().equals(that.getCount___()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getCount___() == null ? 0 : this.getCount___().hashCode() );

         return result;
    }


}

