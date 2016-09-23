/**
 * author: Nguyen Dong Hung
 * 
 * 
 */
"use strict";
var homeController = angular.module('homeController', []);

homeController.controller('HomeController', ['$scope', '$http', 
function ($scope,$http) {
		$http.get('account/account_list').success(function(data) {
		$scope.name = data;
	});
}]);