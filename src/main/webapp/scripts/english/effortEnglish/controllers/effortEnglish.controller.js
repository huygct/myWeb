'use strict';

(function () {
  angular.module('happyToStudyApp')
    .controller('EffortEnglishController', ['effortEnglishService', function (effortEnglishService) {
      var self = this;

      self.selectedSubject = selectedSubject;
      self.clickNameLesson = clickNameLesson;
      self.setUrl = setUrl;

      self.effortEnglish = effortEnglishService.cache;

      effortEnglishService.getSubjects()
        .then(function () {
          self.effortEnglish.subjects = effortEnglishService.cache.subjects;
          console.log(self.effortEnglish.subjects);
        }, function () {
          throw (Error('Error get subject from server'));
        }) ;

      self.menuToggleOptions = {

        //menus: [
        //  {
        //    id: '1',
        //    name: '1.02 A Kiss',
        //    showChildren: false,
        //    children: [
        //      {id: '1.1', name: 'A Kiss Audio.mp3', urlSource: 'sources/OriginalEnglish/1.02 A Kiss/A Kiss Audio.mp3'},
        //      {id: '1.2', name: 'A Kiss MS-A.mp3', urlSource: 'sources/OriginalEnglish/1.02 A Kiss/A Kiss MS-A.mp3'},
        //      {id: '1.3', name: 'A Kiss MS-B.mp3', urlSource: ''},
        //      {id: '1.4', name: 'A Kiss Vocab.mp3', urlSource: ''}
        //    ]
        //  },
        //  {
        //    id: '2',
        //    name: '1.03 Bubba\'s Food',
        //    showChildren: false,
        //    children: [
        //      {id: '2.1', name: 'Bubba\'s Food Audio.mp3', urlSource: ''},
        //      {id: '2.2', name: 'Bubba\'s Food MS-A.mp3', urlSource: ''},
        //      {id: '2.3', name: 'Bubba\'s Food MS-B.mp3', urlSource: ''},
        //      {id: '2.4', name: 'Bubba\'s Food MS-C.mp3', urlSource: ''},
        //      {id: '2.5', name: 'Bubba\'s Food Vocab.mp3', urlSource: ''}
        //    ]
        //  }
        //],
        externalScope: {
          selectedOneItem: function (child) {
            self.urlAudio = child.urlSource;
            //console.log(child);
          }
        }
      };


      function selectedSubject (subjectId) {
        // get lessons by subjectId

      }

      function clickNameLesson (lesson) {
        if (lesson.hasOwnProperty('showDetail')) {
          lesson.showDetail = !lesson.showDetail
        } else {
          lesson.showDetail = true;
        }
      }

      function setUrl (lessonDetail) {
        if (lessonDetail.type === 'mp3') {
          self.effortEnglish.urlAudio = lessonDetail.url;
        } else {
          if (lessonDetail.type === 'pdf') {
            self.effortEnglish.urlPdf = lessonDetail.url;
          }
        }
      }

    }])

})();
    