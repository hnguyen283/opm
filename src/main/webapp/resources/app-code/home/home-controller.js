/**
 * author: Nguyen Dong Hung
 * 
 * 
 */
"use strict";
var homeController = angular.module('homeController', []);

homeController.controller('HomeController', ['$scope', '$http', 
function ($scope,$http) {
	$http.get('load/byname/account-list').success(function(data) {			
		$scope.accounts = angular.fromJson(data);
	});
}]);