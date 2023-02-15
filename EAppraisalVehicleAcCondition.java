package com.factory.appraisal.vehiclesearchapp.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;
@Audited
@Entity
@Table(name = "APR_TEST_DR_STATUS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "acConditionId", column = @Column(name = "AC_CONDN_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EAppraisalVehicleAcCondition extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "AC_CONDN_ID")
    private Long acConditionId;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDrivingStatus.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "VEH_STATUS_ID")                    //refkey
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
