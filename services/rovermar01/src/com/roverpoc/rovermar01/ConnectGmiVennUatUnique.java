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
 * ConnectGmiVennUatUnique generated by hbm2java
 */
@Entity
@Table(name="`CONNECT_GMI_Venn_UAT_Unique`"
)

public class ConnectGmiVennUatUnique  implements java.io.Serializable {

    private BigDecimal count_distinct_coreKey__;

    public ConnectGmiVennUatUnique() {
    }


    @Id 
    

    @Column(name="`COUNT(DISTINCT(CORE_KEY))`", precision=38)
    public BigDecimal getCount_distinct_coreKey__() {
        return this.count_distinct_coreKey__;
    }
    
    public void setCount_distinct_coreKey__(BigDecimal count_distinct_coreKey__) {
        this.count_distinct_coreKey__ = count_distinct_coreKey__;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof ConnectGmiVennUatUnique) )
		    return false;

		 ConnectGmiVennUatUnique that = (ConnectGmiVennUatUnique) o;

		 return ( (this.getCount_distinct_coreKey__()==that.getCount_distinct_coreKey__()) || ( this.getCount_distinct_coreKey__()!=null && that.getCount_distinct_coreKey__()!=null && this.getCount_distinct_coreKey__().equals(that.getCount_distinct_coreKey__()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getCount_distinct_coreKey__() == null ? 0 : this.getCount_distinct_coreKey__().hashCode() );

         return result;
    }


}

