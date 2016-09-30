"use strict";
var opmApp = angular.module('opmApp', ['ngRoute','ngMaterial','homeController','directiveCommon']);

opmApp.config(['$routeProvider',
                    function($routeProvider) {
                      $routeProvider.
                        when('/', {
                          templateUrl: 'jsp/home/index.jsp',
                          controller: 'HomeController'
                        })
                        .otherwise({
                          redirectTo: '/'
                        });
                    }]);
