var app = angular.module('app');

app.factory('TransferenciaFactory', function($resource){
	return $resource('transferencia/');
});