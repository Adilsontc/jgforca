// Direitos Autorais, PUCRS/Escola Politécnica
// Início: 2021-06-15
// Atualização: 2021-06-07
// https://github.com/Adilsontc

import java.util.Scanner;

/**
 * A classe JogoDaForca permite jogar uma partida
 * entre dois jogares para adivnhar uma palavra.
 * 
 * @author Adilson T Carmo (adilson.carmo@pucrs.br) 
 * @version 1.1 (2021-06-15)
 */
public class MainApp extends Auxiliar
{
    public static void main(String[] args)
    {
        Auxiliar auxiliar = new Auxiliar();
        String sorteada = auxiliar.palavraSorteada();
        int vidas = auxiliar.sorteada(sorteada);
        if (vidas != 0)
        {
            System.out.println("\nParabéns... acertou miserávi!!");
        } else
        {
            System.out.println("\nERROOOOU!!!");
        }
        // testar e criar testes p/ classe auxiliar
        
    }
    
}
