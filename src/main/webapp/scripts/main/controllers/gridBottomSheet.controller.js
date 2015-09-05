(function () {
  'use strict';

  angular.module('happyToStudyApp')
    .controller('GridBottomSheetCtrl', ['$scope', '$mdBottomSheet',
      function ($scope, $mdBottomSheet) {

        $scope.addVocabulary = false;

        $scope.items = [
          { name: 'Vocabulary',
            icon: 'vocabulary'
          }
        ];

        $scope.project = {
          description: 'Nuclear Missile Defense System',
          rate: 500
        };

        $scope.listItemClick = function($index) {
          //var clickedItem = $scope.items[$index];
          //$mdBottomSheet.hide(clickedItem);
          $scope.addVocabulary = true;

        };
    }])
    
})();