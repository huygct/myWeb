'use strict';

/**
 * @ngdoc overview
 * @name happyToStudyApp
 * @description
 * # happyToStudyApp
 *
 * Main module of the application.
 */
angular
  .module('happyToStudyApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ngMaterial',
    'htl.com.reusableComponents'
  ])
  .constant('HTL_CONSTANT', {
    'URL' : 'http://localhost',
    'PORT': '8080',
    'URL_FULL': 'http://localhost:8080/happyToStudy/'
  })

  .config(function ($routeProvider) {
    $routeProvider
      .when('/english', {
        templateUrl: 'scripts/english/english/templates/english.html',
        controller: 'EnglishController',
        controllerAs: 'englishCtrl'
      })
      .when('/english/effortEnglish', {
        templateUrl: 'scripts/english/effortEnglish/templates/effortEnglish.html',
        controller: 'EffortEnglishController',
        controllerAs: 'effortEnglishCtrl'
      })
      .when('/entertainment', {
        templateUrl: 'scripts/entertainment/entertainment/templates/entertainment.html',
        controller: 'EntertainmentController',
        controllerAs: 'entertainmentCtrl'
      })
      .otherwise({
        redirectTo: '/english'
      });
  });
