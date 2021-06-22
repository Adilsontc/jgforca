// Direitos Autorais, PUCRS/Escola Politécnica
// Início: 2021-06-15
// Atualização: 2021-06-18
// Atualização: 2021-06-21
// // https://github.com/Adilsontc/jgforca

import java.util.*;

/**
 * A classe auxiliar recebe as letras digitadas, 
 * e compara com as letras da palavra sorteada.
 * Se a letra for igual sera exibida na posição da palavra,
 * se não, irá diminuir a vida dessa jogada.
 * 
 * @author Adilson T Carmo (adilson.carmo@pucrs.br) 
 * @version 1.1 (2021-06-15)
 */
class Auxiliar
{
    
    public static String palavraSorteada()
        {
        String palavras[] = {
            "PROJETO", 
            "CRUZ", 
            "POMADA", 
            "CONCTIVIDADE", 
            "PERIGO", 
            "AUTONOMIA", 
            "TELEFONIA", 
            "COMPLEXO", 
            "DISPONIBILZAR",
            "BAILARINA",
            "FUTEBOL",
            "ESTÁTUA",
            "PINTOR",
            "FRIO",
            "BEBE",
            "MÍMICO",
            "ESCOVA",
            "LAPIS",
            "LIVRO",
            "ASTRONAUTA",
            "AMOR",
            "ODIO",
            "CEGO",
            "CADEIRA",
            "SACOLA",
            "PROFESSOR",
            "MEDICO",
            "CALCULADORA",
            "ARTISTA",
            "VITORIA",
            "PESCADOR",
            "INTERNET",
            "BASQUETE",
            "SEMENTE",
            "POLICIAL",
            "AMARGO",
            "BILHETE",
            "XADREZ",
            "BANANA",
            "MICROBIO",
            "ROMANCE",
            "CARTEIRA",
            "MAQUINA",
            "PRANCHA",
            "DEBATE",
            "LIXO",
            "SOMBRA",
            "CADEADO",
            "MASSAGEM"
        };
        int quantPalavras = palavras.length;
        Random random = new Random();       
        int numeroRandom = random.nextInt(quantPalavras);
        String sorteada = palavras[numeroRandom];
        return sorteada;
        }

    public int quantidadeVidas(String sorteada)
        {        
        Scanner teclado;        
        teclado = new Scanner(System.in);
        String letraDigitada;
        String letrasUsadas = "";
        int vidas = 5;
        boolean ganhou = false;
        char acertos[] = new char[sorteada.length()];
        
        do 
        {
            System.out.print("\nVocê tem " + vidas + " vidas\nQual letra vc deseja tentar?(Digite uma letra MAIÚSCULA.\n");
            letraDigitada = teclado.next();   
            letrasUsadas += " " + letraDigitada;
            boolean perdeVida = true;
        
            for (int i = 0; i < sorteada.length(); i++)
            {   
                if (letraDigitada.charAt(0) == (sorteada.charAt(i)))
                {
                    acertos[i] = 1;
                    perdeVida = false;
                }
            }
            ganhou = true;
            for (int i = 0; i < sorteada.length(); i++)
            {            
                if (acertos[i] == 0)
                {
                    System.out.print(" _ ");
                    ganhou = false;
                } else
                {
                    System.out.print(" " + sorteada.charAt(i) + " ");
                    
                }
            }
            
            if (perdeVida)
            {
                vidas--;
            } 
        } while (!ganhou && vidas > 0);
        
        teclado.close();
        return vidas;
    }
}
