'use strict';

(function () {
  angular.module('EnglishApp')
    .controller('EnglishRouterController', ['$routeParams',
      function ($routeParams) {

        var vm = this;

        var nameApp = $routeParams.typeEnglish;

        switch (nameApp) {
          case 'effortEnglish':
            vm.templateUrl = 'scripts/english/effortEnglish/templates/effortEnglish.html';
            break;
          case 'zzz':
            vm.templateUrl = 'xxx.html';
            break;
          default :
            vm.templateUrl = 'scripts/english/english/templates/english.html';
        }
    }])

})();
    