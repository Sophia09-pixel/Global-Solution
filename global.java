package pastaglobal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class global {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		int qtdFamilia =0;
		int posicaoMaior =0, posicaoMenor=0;
		int j =0;
		
		System.out.println("Digite o número de familias: ");
		qtdFamilia = entrada.nextInt();
		
		String nomes [] = new String[qtdFamilia];
		double invest[] = new double[qtdFamilia];
		double faturamento[] = new double[qtdFamilia];
		double lucro[] = new double[qtdFamilia];
		double maiorFat = faturamento[0], menorLucro = Double.MAX_VALUE;
		double investTotal =0;
		double fatTotal =0;
		double lucroTotal =0;
		
		for(int i =0;i<qtdFamilia;i++) {
			
			if(i==0) {
				j = 1;
			}else {
				j++;
			}
			
			System.out.println("Digite o nome da "+j+"° Familia:");
			nomes[i] = entrada.next();
			
			System.out.println("Digite o investimento mensal recebido da Familia "+nomes[i]+": ");
			invest[i] = entrada.nextDouble();
			investTotal += invest[i];
			
			System.out.println("Digite o faturamento mensal da Familia "+nomes[i]+": " );
			faturamento[i] = entrada.nextDouble();
			fatTotal += faturamento[i];
			
			lucro[i] = invest[i] - faturamento[i];
			lucroTotal += lucro[i];
		}
		
		for(int i =0; i<qtdFamilia;i++) {
			System.out.println("Nome Familia: "+nomes[i]+", investimento recebido R$: "+invest[i]+", faturamento mensal R$: "+faturamento[i]+ " lucro R$: "+lucro[i]+"");

			if (faturamento[i] > maiorFat) {
				maiorFat = faturamento[i];
				posicaoMaior = i;
				
			}
			
			
			if (lucro[i] < menorLucro) {
				menorLucro = lucro[i];
				posicaoMenor = i;
				
			}
			
		}
		
		System.out.println("Familia com maior faturamento mensal: "+nomes[posicaoMaior]+"  valor R$: "+maiorFat+"");
		System.out.println("Familia com menor lucro: "+nomes[posicaoMenor]+"  valor R$: "+menorLucro+"");
		System.out.println("Investimento total de todas as familias R$: "+investTotal);
		System.out.println("O percentual de lucro sobre as vendas de todas as famílias: "+numFormatado.format((lucroTotal/investTotal)*100)+"%");
		
	}

}
