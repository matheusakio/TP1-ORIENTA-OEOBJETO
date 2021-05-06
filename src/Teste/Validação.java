package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.Validadacao;


/**
 * Classe respons�vel pelo teste de valida��o de email
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

class Valida��o {
	Validadacao v = new Validadacao();

	@Test
	void testValidarEmail() {
		assertTrue(v.validarEmail("matheus@unb.com"));
		assertFalse(v.validarEmail("@matheusunb.com"));
	}

}
