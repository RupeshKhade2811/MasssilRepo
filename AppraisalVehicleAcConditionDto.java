package com.factory.appraisal.vehiclesearchapp.persistence.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppraisalVehicleAcConditionDto extends TransactionEntityDto{

    private Long acConditionId;
     
    private Long appraisalStatusId;

    @NotNull
    private Boolean coldAir;
    @NotNull
    private Boolean badDisplay;
    @NotNull
    private Boolean fadedDisplayOrButtons;
    @NotNull
    private Boolean fanSpeedMalfunction;
    @NotNull
    private Boolean climateControlMalfunction;
    @NotNull
    private Boolean hotOrWarmAir;
    @NotNull
    private Boolean notOperational;


}
