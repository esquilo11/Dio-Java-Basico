import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for(double saqueTotal=0; saqueTotal < limiteDiario;){
// TODO: Solicite ao usuário o valor do saque:
          duble saque = scanner.nextDouble();
// TODO: Verifique se o valor do saque é zero, encerrando as transações:
          if(saque == 0){ 
            break; 
          }
          
          if((saque + saqueTotal) <= limiteDiario){
            saqueTotal += saque;
            System.out.println("Saque realizado. Limite restante: " + (limiteDiario - saqueTotal));
          }
          if(saque > limiteDiario){
            System.out.println("Limite diario de saque atingido.");
            System.out.println("Transacoes encerradas.");
            break;
          }
          
          
        }
        System.out.println("Transacoes encerradas.");

           


// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;

           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            

// TODO: Informe que o saque foi realizado e mostre o limite restante:
              // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}