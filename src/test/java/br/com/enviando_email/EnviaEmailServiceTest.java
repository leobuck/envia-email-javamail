package br.com.enviando_email;

import org.junit.Test;

public class EnviaEmailServiceTest {
	
	@Test
	public void testeEmail() {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		stringBuilderTextoEmail.append("<h2>Olá Mundo,</h2>");
		stringBuilderTextoEmail.append("<p>Você acaba de receber um e-mail enviado com Java!</p>");
		stringBuilderTextoEmail.append("<p>Para ter acesso, clique no botão abaixo:</p>");
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://projetojavaweb.com/certificado-aluno/login\" style=\"color: #2525a7; padding: 14px 25px; text-align: center; text-decoration: none; display: inline-block; border-radius: 30px; font-size: 20px; font-family: courier; border: 3px solid green; background-color: #99DA39;\">Acessar Portal do Aluno</a>");
		stringBuilderTextoEmail.append("<br><br><small>Ass.: Leo Buck :)</small>");
		
		boolean enviaHtml = true;
		
		EnviaEmailService enviaEmail = new EnviaEmailService(
				"leobuck12@gmail.com", 
				"Leo Buck - Formação Java Web", 
				"Testando e-mail com Java", 
				stringBuilderTextoEmail.toString());  

		try {
			enviaEmail.enviaEmailAnexo(enviaHtml);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
