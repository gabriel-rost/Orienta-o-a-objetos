class Data {
	
	// declaracao atributos da  classe
	int dia;
	int mes;
	int ano;
	
	public String escreverPorExtenso(){
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
			"julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}; 
		
		return dia + " de " + meses[mes-1] + " de " + ano;
	} 
	
	/* Tarefa para fazer:
	 * validacao do dia considerando os anos bissextos
	 * 
	 * */
	
	
	// Exer.:
	/* Criar um método para validacao de numeros, eliminando a necessidade
	 * dos if de validacao do dia/mes/ano
	 * */
	
	
	public void ajustarData(int dia, int mes, int ano){
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 31, 30, 31, 30};

		// verifica se o ano é bissexto e muda o valor do array para o mes de fevereiro
		if ( (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
			diasMes[1] = 29 ;
		}
		
		// validacao do mes
		if (mes >= 1 && mes <= 12){
			
			this.mes = mes;
		} else {
			System.out.println("Mês inválido\n");
			this.mes = 1;
		}
		
		// validacao do dia
		if (dia >= 1 && dia <= diasMes[this.mes-1]){
			this.dia = dia;
		} else {
			System.out.println("Dia inválido");
			this.dia = 1;
		}
		
		// validacao do ano
		if (ano > 1900){
			this.ano = ano;
		} else {
			System.out.printf("Ano inválido\n");
			this.ano = 2000;
		}
	}
	
	public static void main (String args[]){
		// criando uma instancia da classe
		Data hoje = new Data();
		hoje.ajustarData(29, 2, 2024);
		
		/*
		hoje.dia = 19;
		hoje.mes = 03;
		hoje.ano = 2024; */
		
		System.out.printf("Hoje é dia %s", hoje.escreverPorExtenso() );
	}

}
