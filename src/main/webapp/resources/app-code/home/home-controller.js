/**
 * author: Nguyen Dong Hung
 * 
 * 
 */
"use strict";

opmApp.controller("HomeController", ['$scope','commonService',
function($scope,commonService){
	

//	Attach another service .. into this controller
	this.commonService = commonService;
	
//	init function, load data and function when load page
	$scope.init = function(){
		$scope.accounts = commonService.getByName(commonService.endpoints.ACCOUNT_LIST);
	};
	$scope.init();	
	
	
	
}]);

