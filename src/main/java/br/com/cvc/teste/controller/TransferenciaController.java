package br.com.cvc.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.teste.modelos.Transferencia;

@RestController
@RequestMapping("transferencia")
public class TransferenciaController {
	
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Transferencia> novaTransferencia(@RequestBody Transferencia transferencia){
		transferencia.calculaTaxa();
	
		return  transferencia.getTaxa() == -1 ? new ResponseEntity<Transferencia>(HttpStatus.NO_CONTENT) : ResponseEntity.ok(transferencia);
	}

}
