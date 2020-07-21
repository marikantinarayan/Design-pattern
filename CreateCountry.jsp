<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page import="co.in.sixdee.crm_bss.utils.Theme"%>
<%@ page import="java.util.*" isErrorPage="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.popup_top .popup_top-body {
	height: 380px;
}

.content_td {
	width: 50%;
}
</style>
</head>
<body>

	<div class="page-content">
		
				<div class="page-section-heading">
				<span class="page-section-title"><spring:message code="create_country" text="" /></span>
				</div>
				
				<form>
				   <div class="page-section">
						<div class="form-group  col-lg-4 col-md-4 col-sm-6 col-xs-12 mandatory">
						<label for="countryTypeName" id="countryNameLabel">
									<spring:message code="create_country_type" text="" />
								</label>
								<input type="checkbox" class="form-check-input" value="" id="countryNameCheckBox" onclick="showAndHideCountry(this)">
								<input type="text" class="form-control" id="countryName" name="countryName" value=""/>
									
						</div>
						
				
				<div class="form-group col-lg-4 col-md-4 col-sm-6 col-xs-12 textarea mandatory">
						<label for="comment" id="provinceNameLabel">
							<spring:message code="create_province_name" text="" />
						</label>
						<input type="checkbox" class="form-check-input" value="" id="provinceNameCheckBox" onclick="showAndHideProvince(this)">
						<input class="form-control" id="provinceName"  name="provinceName" value=""></input>
						
					</div>
					
					</div>

					
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 ">
                         <button class="btn-page-secondary" type="button" id="cancel-button" onclick="goBack()">
								<spring:message code="button_cancel" text="" />
					     </button>
						
					</div>
					
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12"> 
					<button class="btn-page-secondary" type="reset" onclick="pageReset()">
						<spring:message code="button_reset" text="" />
					</button>
				</div>
					
					
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<button class="btn-page-primary" type="button" id="form-button-save"  onclick="createCountry()">
							<spring:message code="button_create" text="" />
						</button>
					</div>
				<input type="hidden" id="formElIDArr" name="formElIDArr" value="">
				</form>	
				
			</div>
		</div>
	</div>
</body>

<script>
var formElIDArr = [];

$(document).ready(function() {
	
	   breadcrumbHandler('<spring:message code="ticketconfigution_coutryname_map" text="" />','<spring:message code="create" text="" />',"/TicketProductCountry/TCCountryCreate.jsp");
	   $(this).find("input,select,radio,checkbox,textarea").each(function() {
			var tmp = $(this).attr("id");
			if (tmp != null && tmp != 'undefined')
				formElIDArr.push(tmp);
	   });
		$("#formElIDArr").val(formElIDArr);
		$("#countryNameCheckBox").show();
		$("#countryNameCheckBox").show();
		$("#countryNameCheckBox").prop("checked", true);
		$("#provinceNameCheckBox").prop("checked", false);
		$("#countryNameLabel").show();
		
		$("#provinceNameLabel").show();
		$("#provinceNameCheckBox").show();
		$("#provinceName").hide();
		});
	
function showAndHideCountry(event)
{
	debugger;
 var name=event.id;
  var checkValue=event.checked;
	$(document).ready(function(){
		debugger;
		$("input[type='checkbox']").change(function(){
			if(checkValue==true){
				
			$("#countryName").show();
			$("#countryNameCheckBox").show();
			$("#searchButton").show();
			$("#resetButton").show();
			
			$("#provinceNameLabel").hide();
			$("#provinceNameCheckBox").hide();
			$("#provinceName").hide();
			$("#countryNameCheckBox").prop("checked", true);
			$("#provinceNameCheckBox").prop("checked", false);
			}
			else
				{
				$("#countryName").hide();
				$("#countryNameCheckBox").hide();
				$("#countryNameCheckBox").show();
			 
				$("#provinceNameLabel").show();
				$("#provinceNameCheckBox").show();
				$("#provinceName").show();
				
				$("#provinceNameCheckBox").prop("checked", true);
				$("#countryNameCheckBox").prop("checked", false);
				
				}
		});
		});
	
	}
function showAndHideProvince(event)
{
	
	

  var checkValue=event.checked;
	$(document).ready(function(){
		debugger;
		$("input[type='checkbox']").change(function(){
		
			if(checkValue==true){
		
				$("#provinceName").show();
				$("#provinceNameCheckBox").show();
				
				
				
				$("#countryName").hide();
				
				$("#countryNameCheckBox").hide();
				
				$("#countryNameCheckBox").prop("checked", false);
				$("#provinceNameCheckBox").prop("checked", true);
			}
			else
				{
				debugger
				$("#provinceName").hide();
				$("#provinceNameCheckBox").hide();
				$("#provinceNameLabel").hide();
				
				$("#countryName").show();
				$("#countryNameCheckBox").show();
			
				$("#countryNameCheckBox").prop("checked", true);
				$("#provinceNameCheckBox").prop("checked", false);
				}
	
		});
		});
	
	}
	
         	function createCountry() {
         		debugger;
         		if ($('#countryNameCheckBox').is(":checked"))

         		{
         		
         			var countryNameCheckBox=$('#countryNameCheckBox').val();
              		$('#provinceNameCheckBox').val();
          			emptyFailureMessages($('input'));
    	            $("#countryName").empty();
    	           
    	            debugger;
    	   			var dataArr = {};
        		    dataArr["langId"] = '<spring:message code="Language_ID" text="" />';
        			dataArr["userId"] = '${user.userId}';
        			dataArr["userName"] = '${user.username}';
        			dataArr["formElIDArr"] = $('#formElIDArr').val();
        			if (validate($("#countryName").val())) {
        				dataArr["countryName"] = $("#countryName").val();
        			}
        			
        				$.ajax({
    								type : "POST",
    								url : "CreateCountry",
    							
    								data : dataArr,
    								timeout : 100000,
    								
    								success : function(data) {
    									debugger;
    									if(data.status == 0){
    										showToast('<spring:message code="country_success" />', "success");
    										 goBack();
    									}else if(data.status == 1){
    										debugger;
    										var emptyMsg = false;
    										for(i =0 ; i < data.resultList.length ; i++){
    											var formField = data.resultList[i].field;
    											var formErrorCode = data.resultList[i].code;
    											var formErrorMessage = data.resultList[i].message;
    											if(formErrorCode == 'NotBlankOrNull' || formErrorCode == 'NotEmpty' || formErrorCode == 'NotNull'){
    												emptyMsg = true;
    												mandatoryMissingAlert($("#" + formField),formErrorMessage);
    												if(i == 0){
    													$("#" + formField).focus();
    												}
    											}
    										}
    										debugger;
    										for(i =0 ; i < data.resultList.length ; i++){
    											var formField = data.resultList[i].field;
    											var formErrorCode = data.resultList[i].code;
    											var formErrorMessage = data.resultList[i].message;
    											if(formErrorCode != 'NotEmpty' && formErrorCode != 'NotBlankOrNull' &&  formErrorCode != 'NotNull'){
    												validationFailureAlert($('#'+formField),formErrorMessage);
    											}
    											return false;
    										}
    										
    									}
    									
    									else{
    										debugger;
    										showToast( '<spring:message code="country_failure" text="" />', "error");
    										goBack();
    									}
    								},
    								error : function(e) {
    									console.log("ERROR: ", e);
    								}
    							});
         		

         		}
         		else
         			if ($('#provinceNameCheckBox').is(":checked"))

             		{
         				debugger;
         		    $('#provinceNameCheckBox').val();
          			emptyFailureMessages($('input'));
    	           
    	            $("#provinceName").empty();
    	            debugger;
    	   			var dataArr = {};
        		    dataArr["langId"] = '<spring:message code="Language_ID" text="" />';
        			dataArr["userId"] = '${user.userId}';
        			dataArr["userName"] = '${user.username}';
        			dataArr["formElIDArr"] = $('#formElIDArr').val();
        			if($('#provinceName').val() != ""){
        				dataArr["provinceName"] = $('#provinceName').val();
        			}
        		$.ajax({
    				    type : "POST",
    					url : "CreateProvince",
    						
    								data : dataArr,
    								timeout : 100000,
    								
    								success : function(data) {
    									debugger;
    									if(data.status == 0){
    										showToast('<spring:message code="province_success" />', "success");
    										 goBack();
    									}else if(data.status == 1){
    										debugger;
    										var emptyMsg = false;
    										for(i =0 ; i < data.resultList.length ; i++){
    											var formField = data.resultList[i].field;
    											var formErrorCode = data.resultList[i].code;
    											var formErrorMessage = data.resultList[i].message;
    											if(formErrorCode == 'NotBlankOrNull' || formErrorCode == 'NotEmpty' || formErrorCode == 'NotNull'){
    												emptyMsg = true;
    												mandatoryMissingAlert($("#" + formField),formErrorMessage);
    												if(i == 0){
    													$("#" + formField).focus();
    												}
    											}
    										}
    										debugger;
    										for(i =0 ; i < data.resultList.length ; i++){
    											var formField = data.resultList[i].field;
    											var formErrorCode = data.resultList[i].code;
    											var formErrorMessage = data.resultList[i].message;
    											if(formErrorCode != 'NotEmpty' && formErrorCode != 'NotBlankOrNull' &&  formErrorCode != 'NotNull'){
    												validationFailureAlert($('#'+formField),formErrorMessage);
    											}
    											return false;
    										}
    										
    									}
    									
    									else{
    										debugger;
    										showToast( '<spring:message code="province_failure" text="" />', "error");
    										goBack();
    									}
    								},
    								error : function(e) {
    									console.log("ERROR: ", e);
    								}
    							});
         		
         			
         			
         			
         		}
         		

	}
</script>

</html>
