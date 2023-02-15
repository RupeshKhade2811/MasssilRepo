package com.factory.appraisal.vehiclesearchapp.persistence.dto;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleAcCondition;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EDealerReg;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EUserReg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EAppraiseVehicleDto extends TransactionEntityDto {

    @NotNull
    private Long appraisalReferenceId;


    private Date appraisalRetensionTime;
 
    @Max(10)
    private String appraisalValue;

    @Max(10)
    private String blackBookValue;

    @Max(15)
    private String brakeSystemFuel;

    @NotNull
    @Max(999999999999999l)
    private Long  eSignId;

    @Max(50)
    private String enginePerformance;

    @Max(15)
    private String field1;

    @Max(15)
    private String field2;

    @Max(15)
    private String field3;
    @Max(50)
    private String latitude;

    @Max(50)
    private String longitude;

    @Max(250)
    private String professionalOpinion;


    @Max(999999999999999l)
    private Long stockNumber;

    @Max(100)
    private String transmission ;

    @Max(15)
    private String make ;

    @Max(9999999999l)
    private Long miles;
    @Max(15)
    private String  model ;
    @Max(10)
    private String  series;
    @Max(10)
    private String  style;
    @Max(9999)
    private Long year;
    @Max(20)
    private String vinNumber ;

    private EDealerReg dealerId;


    private EUserReg userId;
    private EAppraisalVehicleAcCondition acCondnId;

}
