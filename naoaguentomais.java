/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 20/03/2023
 * Autores do Projeto: Emmanuel Yokoyama
 *                     Isaac de Oliveira
 * Turma: 3h  Disciplina: POO-II
 * Avaliação parcial referente ao 1 - Bimestre
 * 
 * naoaguentomais.java
 * ******************************************************************/
public class naoaguentomais{
        public static void main(String args[]){

               int dias = Integer.parseInt(args[0]);
               int indice1 = 1 ;
               int indice2 = 2; 
               
               for(int z=0;z<dias;z++){
               int y = Integer.parseInt(args[indice2]);
               int n = Integer.parseInt(args[indice1]);
               int x = (y/n)-n;
               indice1 +=2;
               indice2+=2;
               if(x%2!=0){
                  x++;
               }
               
               int aux = 0;
                  for(int i=0;aux<=y;i=i+2){      
                      System.out.println(x);
                      x = x+2;
                      aux += x;
                   }
                   System.out.println("-------------------------------");
                   
               }
               
        }
}
