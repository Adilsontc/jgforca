// Direitos Autorais, PUCRS/Escola Politécnica
// Início: 2021-06-15
// Atualização: 2021-06-07
// https://github.com/Adilsontc

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
    
    public String palavraSorteada()
        {
        String [] palavras = {
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
            "BEBÊ",
            "MÍMICO",
            "ESCOVA",
            "LÁPIS",
            "LIVRO",
            "ASTRONAUTA",
            "AMOR",
            "ÓDIO",
            "CEGO",
            "CADEIRA",
            "SACOLA",
            "PROFESSOR",
            "MÉDICO",
            "CALCULADORA",
            "ARTISTA",
            "VITÓRIA",
            "PESCADOR",
            "INTERNET",
            "BASQUETE",
            "SEMENTE",
            "POLICIAL",
            "AMARGO",
            "BILHETE",
            "XADREZ",
            "BANANA",
            "MICRÓBIO",
            "ROMANCE",
            "CARTEIRA",
            "MÁQUINA",
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
        //System.out.println(sorteada);
        return sorteada;
        }

    public int sorteada(String sorteada)
        {        
        sorteada = "amor";
        System.out.println(sorteada);
        Scanner teclado;        
        teclado = new Scanner(System.in);
        String letraDigitada;
        String letrasUsadas = "";
        int vidas = sorteada.length();
        boolean ganhou = false;
        char[] acertos = new char[sorteada.length()];
        
        
        do 
        {
            int totalErros = 0;
            System.out.print("\n Você tem " + vidas + " vidas\nQual letra vc deseja tentar?");
            letraDigitada = teclado.next();   
            letrasUsadas += " " + letraDigitada;
        
            for (int i = 0; i < sorteada.length(); i++)
            {   
                if (letraDigitada.charAt(0) == (sorteada.charAt(i)))
                {
                    acertos[i] = 1;
                }
            }
        
            ganhou = true;
            for (int i = 0; i < sorteada.length(); i++)
            {            
                System.out.println(acertos[i]+"\n");
                if (acertos[i] == 0)
                {
                    System.out.print(" _ ");
                    ganhou = false;
                    totalErros++;
                } else
                {
                    System.out.print(" " + sorteada.charAt(i) + " ");
                    
                }
            }
            System.out.println(totalErros+" "+sorteada.length()+" \n");
            if (totalErros <= sorteada.length())
            {
                vidas--;
            } 
        } while (!ganhou && vidas > 0);
        
        teclado.close();
        return vidas;
    }
}
