package atividades;
import java.util.*;

public class IdiomaDoSitema {

	public static void main(String[] args) {
		// codigo que pega o idioma do sistema
		System.getProperties();
		System.out.println(System.getProperty("user.language")); //mostra só a sigla do idioma
		
		//ou -----------------------------------------------------------------------
		
		Locale idioma = Locale.getDefault();
		System.out.println(idioma.getDisplayLanguage()); //escreve 'portugues'
		System.out.println(idioma.getLanguage()); //escreve 'pt'

	}

}
