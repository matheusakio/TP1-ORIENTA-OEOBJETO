package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.Validadacao;


/**
 * Classe responsável pelo teste de validação de email
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */

class Validação {
	Validadacao v = new Validadacao();

	@Test
	void testValidarEmail() {
		assertTrue(v.validarEmail("matheus@unb.com"));
		assertFalse(v.validarEmail("@matheusunb.com"));
	}

}
