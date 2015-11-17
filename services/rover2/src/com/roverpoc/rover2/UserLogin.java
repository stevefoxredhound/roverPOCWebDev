/*Copyright (c) 2015-2016 redhound.net All Rights Reserved.
 This software is the confidential and proprietary information of redhound.net You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with redhound.net*/

package com.roverpoc.rover2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
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
 * UserLogin generated by hbm2java
 */
@Entity
@Table(name="user_login"
    ,schema="dbo"
)
public class UserLogin  implements java.io.Serializable
 {


private Integer id;
private Integer userid;
private String username;
private String password;
private String role;
private Integer tenantid;

    public UserLogin() {
    }



     @Id @GeneratedValue(strategy=IDENTITY)

    

    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="userid")
    public Integer getUserid() {
        return this.userid;
    }
    
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    

    @Column(name="username", length=250)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    

    @Column(name="password", length=250)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    

    @Column(name="role", length=250)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    

    @Column(name="tenantid")
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof UserLogin) )
		 return false;

		 UserLogin that = ( UserLogin ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}

