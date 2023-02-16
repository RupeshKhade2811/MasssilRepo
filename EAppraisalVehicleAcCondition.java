package com.factory.appraisal.vehiclesearchapp.persistence.model;
//@author:Rupesh Khade

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;
@Audited
@AuditTable(value = "APR_VEH_AC_CONDN_AUD", schema = "FACTORY_AUD")
@Entity
@Table(name = "APR_VEH_AC_CONDN",schema = "FACTORY_DB")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "acConditionId", column = @Column(name = "AC_CONDN_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))
public class EAppraisalVehicleAcCondition extends TransactionEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="apr_veh_ac_condn_seq")
    @SequenceGenerator(name="apr_veh_ac_condn_seq", sequenceName="APR_VEH_AC_CONDN_SEQ")
    @Column(name = "AC_CONDN_ID")
    private Long acConditionId;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDrivingStatus.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "VEH_STATUS_ID",nullable = false)                    //refkey
    private EAppraisalTestDrivingStatus vehicleStatusId;
    @Column(name = "COLD_AIR")
    private Boolean coldAir;
    @Column(name = "BAD_DISPLAY")
    private Boolean badDisplay;
    @Column(name = "FADED_DIS_OR_BTNS")
    private Boolean fadedDisplayOrButtons;
    @Column(name = "FAN_SPEED_MALFUNC")
    private Boolean fanSpeedMalfunction;
    @Column(name = "CLIMATE_CONTR_MALFUNC")
    private Boolean climateControlMalfunction;
    @Column(name = "HOT_OR_WARM_AIR")
    private Boolean hotOrWarmAir;
    @Column(name = "NOT_OPRNAL")
    private Boolean notOperational;

}
