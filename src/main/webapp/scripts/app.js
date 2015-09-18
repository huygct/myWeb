'use strict';

/**
 * @ngdoc overview
 * @name happyToStudyApp
 * @description
 * # happyToStudyApp
 *
 * Main module of the application.
 */

angular.module('htsApp', [
  'htl.com.reusableComponents',
  'UIBootstrapApp',
  'EnglishApp'

]);

angular
  .module('happyToStudyApp', [
    'ngAnimate',
    'ui.bootstrap',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ngMessages',
    'ngMaterial',
    'ngSanitize',
    'jm.i18next',
    'htsApp'
  ])
  .constant('HTL_CONSTANT', {
    'URL': 'http://localhost',
    'PORT': '8080',
    'URL_FULL': 'http://localhost:8080/happyToStudy/'
  })

  .config(['$routeProvider', '$i18nextProvider',
    function ($routeProvider, $i18nextProvider) {
      $routeProvider
        .when('/english', {
          templateUrl: 'scripts/english/english/templates/english.html',
          controller: 'EnglishController',
          controllerAs: 'englishCtrl'
        })
        .when('/entertainment', {
          templateUrl: 'scripts/entertainment/entertainment/templates/entertainment.html',
          controller: 'EntertainmentController',
          controllerAs: 'entertainmentCtrl'
        })
        .otherwise({
          redirectTo: '/english'
        });

      $i18nextProvider.options = {
        lng: 'en',
        fallbackLng: 'en',
        useCookie: false,
        useLocalStorage: false,
        resGetPath: 'languages/__lng__/translation.json'
      };
    }]);
