package br.com.wvitorcorp.rodandoTesteGitLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RodandoTesteGitLabApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite seu CPF: ");
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		// Reading data using readLine
		String cpf = reader.readLine();

		System.out.println("O CPF digitado é: " +
				(ValidadorCpf.validar(cpf) ? "Verdadeiro" : "Falso"));
	}

}
