angular.module('starter.controllers', [])

.controller('AppCtrl', function($scope, $ionicModal, $timeout, $state ) {
  // Form data for the login modal
  $scope.loginData = {};
  $scope.bos = 0;

  $scope.items = [
     { id: 1, name: 'Manager' },
     { id: 2, name: 'CO' }
   ];

  // Create the login modal that we will use later
  $ionicModal.fromTemplateUrl('templates/login.html', {
    scope: $scope
  }).then(function(modal) {
    $scope.modal = modal;
  });

  // Triggered in the login modal to close it
  $scope.closeLogin = function() {
    $scope.modal.hide();
  };

  // Open the login modal
  $scope.login = function() {
    $scope.modal.show();
  };

  $scope.onClickBos = function(param) {
      $scope.bos = param.id;
 //     alert($scope.bos);
  }

  // Click on login
  $scope.onClickLogin = function() {
     // if ($scope.bos == 1) {
        $state.go('app.dashboard');
  };

  // Click on kpi
  $scope.onClickKPI = function() {
     // alert($scope.bos);
      if ($scope.bos == 1)
        $state.go('app.kpi-review');

      if ($scope.bos == 2)
        $state.go('app.kpi-planning');
      
  };

  // Perform the login action when the user submits the login form
  $scope.doLogin = function() {
    console.log('Doing login', $scope.loginData);

    // Simulate a login delay. Remove this and replace with your login
    // code if using a login system
    $timeout(function() {
      $scope.closeLogin();
    }, 1000);
  };
})

.controller('CollapseCtrl', function ($scope) {
  $scope.isCollapsed1 = false;
  $scope.isCollapsed2 = false;
  $scope.isCollapsed3 = false;
  $scope.isCollapsed4 = false;
})

.controller('PlaylistCtrl', function($scope, $stateParams) {
});
