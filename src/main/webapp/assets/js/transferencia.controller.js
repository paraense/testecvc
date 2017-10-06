var app = angular.module('app');

app.controller('TransferenciaController', ['$scope', 'TransferenciaFactory',function($scope, TransferenciaFactory){
	
	$scope.transferencia = {};
	
	$scope.transferir = function () {
		TransferenciaFactory.save($scope.transferencia, function(response){
			console.log(response);
			if(response.taxa == undefined){
				alert("Não existe tarifa para o periodo selecionado");
			} else {
				alert("Operação realizada com sucesso! Taxa Calculada: R$ "+ response.taxa);
			}
		});
		$scope.transferencia = {};
	}
}]);