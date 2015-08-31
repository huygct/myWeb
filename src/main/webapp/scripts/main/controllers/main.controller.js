'use strict';

(function () {
  angular.module('happyToStudyApp')
    .controller('MainController', ['$scope', '$mdSidenav', '$location', 'mainService',
      function ($scope, $mdSidenav, $location, mainService) {
        var self = this;

        self.toggleSidenav = function (menuId) {
          $mdSidenav(menuId).toggle();
        };

        //self.menuToggleOptions = {
        //
        //  menus: mainService.cache.menus,
        //
        //  externalScope: {
        //
        //  }
        //};

        self.groupMenus = mainService.cache.menus;

        self.setUrl = function (url) {
          console.log(url);
        };
      }])

})();
    