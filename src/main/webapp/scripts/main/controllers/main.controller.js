'use strict';

(function () {
  angular.module('happyToStudyApp')
    .controller('MainController', ['$scope', '$mdSidenav', '$mdBottomSheet', '$location', 'mainService',
      function ($scope, $mdSidenav, $mdBottomSheet, $location, mainService) {
        var self = this;

        self.showGridBottomSheet = showGridBottomSheet;

        self.toggleSidenav = function (menuId) {
          $mdSidenav(menuId).toggle();
        };

        self.dataCache = mainService.cache;

        self.setUrl = function (url) {
          console.log(url);
        };

        function showGridBottomSheet($event) {
          $mdBottomSheet.show({
            templateUrl: 'scripts/main/templates/bottomSheet.html',
            controller: 'GridBottomSheetCtrl',
            targetEvent: $event
          }).then(function(clickedItem) {
            console.log('click Item: ', clickedItem);
          });
        }
      }])
})();
    