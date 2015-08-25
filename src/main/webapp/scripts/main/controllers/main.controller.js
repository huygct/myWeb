'use strict';

(function () {
  angular.module('happyToStudyApp')
    .controller('MainController', ['$scope', '$mdSidenav', 'mainService', function ($scope, $mdSidenav, mainService) {
      var self = this;

      self.toggleSidenav = function (menuId) {
        $mdSidenav(menuId).toggle();
      };

      self.menuToggleOptions = {

        menus: mainService.cache.menus,

        externalScope: {

        }
      }

    }])

})();
    