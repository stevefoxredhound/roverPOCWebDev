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
 * SysBUatMessages generated by hbm2java
 */
@Entity
@Table(name="`SysB_uat_messages`"
)

public class SysBUatMessages  implements java.io.Serializable {

    private Integer id;


@Type(type="DateTime")
    private LocalDateTime dateTime;
    private String coreSystem;
    private String coreKey;


@Type(type="DateTime")
    private LocalDateTime coreProcessDate;
    private String forder;
    private String ftdate;
    private String fwstim;
    private String ftrace;
    private String frecno;
    private String fuser;
    private String fsdsc1;
    private String fsqty;
    private String fexbkr;
    private String fopbkr;
    private String ftpric;
    private String ftslap;
    private String ftand;
    private String fttickle;

    public SysBUatMessages() {
    }


    @Id @GeneratedValue(strategy=IDENTITY)
    

    @Column(name="`id`", nullable=false, precision=10)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    

    @Column(name="`date_time`")
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    

    @Column(name="`core_system`", length=250)
    public String getCoreSystem() {
        return this.coreSystem;
    }
    
    public void setCoreSystem(String coreSystem) {
        this.coreSystem = coreSystem;
    }

    

    @Column(name="`core_key`", length=250)
    public String getCoreKey() {
        return this.coreKey;
    }
    
    public void setCoreKey(String coreKey) {
        this.coreKey = coreKey;
    }

    

    @Column(name="`core_process_date`", length=10)
    public LocalDateTime getCoreProcessDate() {
        return this.coreProcessDate;
    }
    
    public void setCoreProcessDate(LocalDateTime coreProcessDate) {
        this.coreProcessDate = coreProcessDate;
    }

    

    @Column(name="`FORDER`", length=65535)
    public String getForder() {
        return this.forder;
    }
    
    public void setForder(String forder) {
        this.forder = forder;
    }

    

    @Column(name="`FTDATE`", length=65535)
    public String getFtdate() {
        return this.ftdate;
    }
    
    public void setFtdate(String ftdate) {
        this.ftdate = ftdate;
    }

    

    @Column(name="`FWSTIM`", length=65535)
    public String getFwstim() {
        return this.fwstim;
    }
    
    public void setFwstim(String fwstim) {
        this.fwstim = fwstim;
    }

    

    @Column(name="`FTRACE`", length=65535)
    public String getFtrace() {
        return this.ftrace;
    }
    
    public void setFtrace(String ftrace) {
        this.ftrace = ftrace;
    }

    

    @Column(name="`FRECNO`", length=65535)
    public String getFrecno() {
        return this.frecno;
    }
    
    public void setFrecno(String frecno) {
        this.frecno = frecno;
    }

    

    @Column(name="`FUSER`", length=65535)
    public String getFuser() {
        return this.fuser;
    }
    
    public void setFuser(String fuser) {
        this.fuser = fuser;
    }

    

    @Column(name="`FSDSC1`", length=65535)
    public String getFsdsc1() {
        return this.fsdsc1;
    }
    
    public void setFsdsc1(String fsdsc1) {
        this.fsdsc1 = fsdsc1;
    }

    

    @Column(name="`FSQTY`", length=65535)
    public String getFsqty() {
        return this.fsqty;
    }
    
    public void setFsqty(String fsqty) {
        this.fsqty = fsqty;
    }

    

    @Column(name="`FEXBKR`", length=65535)
    public String getFexbkr() {
        return this.fexbkr;
    }
    
    public void setFexbkr(String fexbkr) {
        this.fexbkr = fexbkr;
    }

    

    @Column(name="`FOPBKR`", length=65535)
    public String getFopbkr() {
        return this.fopbkr;
    }
    
    public void setFopbkr(String fopbkr) {
        this.fopbkr = fopbkr;
    }

    

    @Column(name="`FTPRIC`", length=65535)
    public String getFtpric() {
        return this.ftpric;
    }
    
    public void setFtpric(String ftpric) {
        this.ftpric = ftpric;
    }

    

    @Column(name="`FTSLAP`", length=65535)
    public String getFtslap() {
        return this.ftslap;
    }
    
    public void setFtslap(String ftslap) {
        this.ftslap = ftslap;
    }

    

    @Column(name="`FTAND`", length=65535)
    public String getFtand() {
        return this.ftand;
    }
    
    public void setFtand(String ftand) {
        this.ftand = ftand;
    }

    

    @Column(name="`FTTICKLE`", length=65535)
    public String getFttickle() {
        return this.fttickle;
    }
    
    public void setFttickle(String fttickle) {
        this.fttickle = fttickle;
    }





    public boolean equals(Object o) {
         if (this == o) return true;
		 if ( (o == null )) return false;
		 if ( !(o instanceof SysBUatMessages) )
		    return false;

		 SysBUatMessages that = (SysBUatMessages) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );
    }

    public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
    }


}

