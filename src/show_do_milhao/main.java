package show_do_milhao;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int acumulo= 0;
		String resposta;
	       
		String message_premio = "Você errou!! \nSeu prêmio é: ";
	     
		resposta=JOptionPane.showInputDialog("Valendo R$1.000,00 \nO que é Java? \n\nA:É um Programa. \nB:Uma Linguagem de Programação. \nC:Linguagem de Maquina \nD:um café \n\nPremio atual: "+acumulo); 
   
		if ("B".equalsIgnoreCase(resposta)) { 
			 acumulo=+1000; 
			 JOptionPane.showMessageDialog(null,"Voce acertou!!\nSeu premio esta acumulado em "+acumulo);
		}else { 
			JOptionPane.showMessageDialog(null,message_premio+acumulo); 
			System.exit(0);
		}
   
		resposta=JOptionPane.showInputDialog("Valendo R$10.000,00 \nQue tipo de váriavel são os Int no Java? \n\nA:Inteiro \nB:Real \nC:Lógico \nD:Nenhuma das opções \n\nPremio atual: "+acumulo); 
		if ("A".equalsIgnoreCase(resposta)) { 
			acumulo = 10000+acumulo; 
			JOptionPane.showMessageDialog(null,"Voce acertou!!\nSeu premio esta acumulado em "+acumulo);
		}else{
			JOptionPane.showMessageDialog(null, message_premio+ acumulo);
			System.exit(0);
		}
        
		resposta = JOptionPane.showInputDialog("Valendo R$100.000,00 \n Java usa qual paradigma de programação? \n\nA:Programação Funcional \nB:Orientação a Objetos \nC:Procedural \nD:Modular \n\nPremio Atual: " + acumulo);
		if("B".equalsIgnoreCase(resposta)){
			acumulo = 100000 + acumulo;
			JOptionPane.showMessageDialog(null, "Voce Acertou!! \nSeu premio esta acumulado em " + acumulo);
		} else{
			JOptionPane.showMessageDialog(null, "Voce errou!! \nVoce ganhou" + acumulo);
				System.exit(0);
			}    
   
		resposta = JOptionPane.showInputDialog("Valendo R$500.000,00 \n  Qual das seguintes é verdade sobre classe super? \n\nA: Variáveis, métodos e construtores que são declaradas privado pode ser acessado apenas pelos membros da classe super. \nB: Variáveis, métodos e construtores que são declaradas protegidas podem ser acessados ​​por qualquer subclasse da classe super. \nC: Variáveis, métodos e construtores que são declaradas pública na superclasse pode ser acessado por qualquer classe. \nD:Todas as alternativas acima.\n\nPremio atual: " + acumulo);
		if("D".equalsIgnoreCase(resposta)){
			acumulo = 100000 + acumulo;
			JOptionPane.showMessageDialog(null, "Voce acertou!! \nSeu premio esta acumulado em "+ acumulo);
			}else{
				JOptionPane.showMessageDialog(null, message_premio+ acumulo  );
				System.exit(0);
			}
   
		resposta = JOptionPane.showInputDialog("Valendo R$1.000.000,00 \n Quanto é 5+5? \n\nA: 8 \nB: 9 \nC: 10 \nD: 11 \nPremio Atual: " + acumulo);
		if("C".equalsIgnoreCase(resposta)){
			acumulo = 1000000;
			JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ GANHOU 1 MILHÃO!!! PODE COMEMORAR!!!!" );
		}else {
			JOptionPane.showMessageDialog(null, "Voce errou!! \nVoce ganhou:  " + acumulo);
			System.exit(0);
		}
	}

}


