/**
 * author: Nguyen Dong Hung
 * 
 * 
 */
"use strict";
var commonModule =  angular.module('commonModule', []);

commonModule.service('commonService', ['$http','$location','$q', 
function ($http,$location,$q) {
	var self = this;
	
	function CommonService(){
		this.name = "commonService";
		if(self.endpoints === undefined){
			var data = this.getHttpSys('common/endpoint-list');
		}
	};
	
//	This function to call menthod get, using endpoint name
//	@endpointName: The endpoint name//	
//	#return: Doc Object in Json 
	
	CommonService.prototype.getByName = function(endpointName){
		this.getHttpSys('load/byname/' + enpointName).success(function(data) {		
			return angular.fromJson(data);
		}).error(function(data, status) {
			console.error('Repos error', status, data);
			return undefined;			  
		});
	}
	
	CommonService.prototype.getHttpSys = function (url) {
		var deferred = $q.defer();

		$http.get(url)
		    .success( function(response, status, headers, config) {
		         deferred.resolve(response);
		    })
		    .error(function(errResp) {
		         deferred.reject({ message: "Really bad" });
		    });
		return deferred.promise;
	}
	
	return new CommonService();
}]);