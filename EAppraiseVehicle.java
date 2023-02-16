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

import java.util.Date;


@Audited
@AuditTable(value = "APPRAISAL_VEHICLE_AUD", schema = "FACTORY_AUD")
@Entity
@Table(name = "APPRAISAL_VEHICLE",schema = "FACTORY_DB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "appraisalReferenceId", column = @Column(name = "APPR_REF_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
@AttributeOverride(name="createdBy",column =@Column(name = "CREATED_BY"))
@AttributeOverride(name="createdOn",column =@Column(name = "CREATED_ON"))
@AttributeOverride(name=" modifiedBy",column =@Column(name = "MODIFIED_BY"))
@AttributeOverride(name="modifiedOn",column =@Column(name = "MODIFIED_ON"))
public class EAppraiseVehicle extends TransactionEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="appr_veh_seq")
    @SequenceGenerator(name="appr_veh_seq", sequenceName="APPR_VEH_SEQ")
    @Column(name="APPR_REF_ID")
    private Long appraisalReferenceId;

    @Column(name="APPR_RETENSION_TIME")
    private Date appraisalRetensionTime;
    @Column(name="APPR_VALUE")

    private String appraisalValue;
    @Column(name="BB_VALUE")

    private String blackBookValue;
    @Column(name="BRAKE_SYS_FUEL")

    private String brakeSystemFuel;

    @Column(name="E_SIGN_ID")
    private Long  eSignId;
    @Column(name="ENGINE_PERFORMANCE")

    private String enginePerformance;
    @Column(name="FIELD1")

    private String field1;
    @Column(name="FIELD2")

    private String field2;
    @Column(name="FIELD3")

    private String field3;
    @Column(name="LATITUDE")
    private String latitude;
    @Column(name="LONGITUDE")

    private String longitude;
    @Column(name="PROF_OPINION")

    private String professionalOpinion ;

    @Column(name = "STOCK_NUMBER")
    private Long stockNumber;
    @Column(name="TRANSMISSION")

    private String transmission ;
    @Column(name="MAKE")

    private String make ;
    @Column(name="MILES")

    private Long miles;
    @Column(name="MODEL")
    private String  model ;
    @Column(name="SERIES")
    private String  series;
    @Column(name="STYLE")
    private String  style;
    @Column(name="YEAR")
    private Long year;
    @Column(name="VIN_NUMBER ")
    private String vinNumber ;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EDealerReg.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "DEALER_ID",referencedColumnName = "dealerId",nullable = false)
    private EDealerReg dealerId;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EUserReg.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID",referencedColumnName = "userId",nullable = false)
    private EUserReg userId;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "appraisalRef")
    private EAppraisalTestDrivingStatus appraisalTestDrivingStatus;





}
