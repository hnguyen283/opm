"use strict";

angular.module('commonController', []).controller('CommonController', ['$scope', '$http', 
function ($scope,$http) {
	$http.get('load/byname/account-list').success(function(data) {			
		$scope.accounts = angular.fromJson(data);
	});
}]);