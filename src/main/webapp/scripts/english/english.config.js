(function () {
  'use strict';
  angular
    .module('UIBootstrapApp', [])

    .config(function ($routeProvider) {
      $routeProvider
        .when('/english', {
          templateUrl: 'scripts/_demo/UIBootstrap/templates/uiBootstrap.html',
          controller: 'UIBootstrapController',
          controllerAs: 'vm'
        })
        .when('/english/:typeEnglish', {
          templateUrl: 'scripts/_demo/UIBootstrap/urlRouter.html',
          controller: 'UIBootstrapRouterController',
          controllerAs: 'vm'
        })
    });
})();
