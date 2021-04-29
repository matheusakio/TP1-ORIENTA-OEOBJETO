package controle;
/**
 * Classe responsável pela validação do email, caso email seja com padroes errados, exemplo @ na frente vai dar false
 * @author Matheus Akio
 * @version 1.0 (28/04/2021)
 */


public class Validadacao {
	public boolean validarEmail(String email) {
		boolean aux= true;
		if(email.isEmpty()) {
			aux=false;
			}
		if(email.startsWith("@")) {
			aux=false;
		}
		if(!email.contains("@")) {
			aux=false;
		}
		
		return aux;

	}


}
