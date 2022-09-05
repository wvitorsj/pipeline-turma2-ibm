package br.com.wvitorcorp.rodandoTesteGitLab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RodandoTesteGitLabApplicationTests {

	@Test
	void validandoCPFValido() {
		var verdadeiro = ValidadorCpf.validar("413.591.530-20");

		assertEquals(true, verdadeiro);
	}

	@Test
	void validandoCPFInvalido() {
		var verdadeiro = ValidadorCpf.validar("413.591.530-22");

		assertEquals(false, verdadeiro);
	}

}
