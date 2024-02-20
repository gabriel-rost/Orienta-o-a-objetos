class Aula01{
	
	public static void main(String args[]) {
		
		// primeiro declara-se o tipo da variavel
		int idade = 17; // atribuindo o valor 30 a variavel idade
		
		/*
			Comentários de mais de uma linha
			O print abaixo é uma forma de printar dados
		  
		*/
		
		// O print abaixo é uma forma de printar dados
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d", idade);
		
		float peso = 70.6f;
		
		System.out.printf("\nPeso: %f", peso);
		
		String mensagem = "Aprendendo a programar em Java!";
		
		System.out.printf("\nMensagem: %s", mensagem);
		
		char sexo = 'M'; // o char sempre tem apenas 1 caractere e é dentro de aspas simples
		
		System.out.printf("\nSexo: %s", sexo);
		
		// operadores aritméticos
		
		int soma = 10 + 20;
		
		int subtracao = 10 - 20;
		
		int mult = 10 * 20;
		
		float div = (float)10 / 20;
		
		System.out.printf("\nSoma: %d", soma);
		
		System.out.printf("\nSubtracao: %d", subtracao);
		
		System.out.printf("\nMultiplicacao: %d", mult);
		
		System.out.printf("\nDvisao: %.1f", div);
		
		int mod = 10 % 3;
		System.out.printf("\nResto: %d", mod);
		
		// exemplo de if com uma condicao
		if (idade >= 18){
			System.out.printf("\nÉ maior de idade");
		} else {
			System.out.printf("\nÉ menor de idade");
			}
		
	}
}
