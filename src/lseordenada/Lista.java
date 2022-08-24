package lseordenada;

public class Lista {
  private static Node cabeca;
  private static Node cauda;
  public Lista(){
    cabeca = cauda = null;
  }
  public static void insereInicio(int Item){
    if (cabeca== null)
      cabeca = cauda = new Node(Item);
    else
      cabeca = new Node(Item,cabeca);
  }
  public static void insereFim(int Item){
    if (cabeca==null)
      cabeca = cauda = new Node(Item);
    else
      cauda=cauda.proximo= new Node(Item);
  }
  public static void imprime(){
    if (cabeca == null){
	System.out.println("Lista Vazia");
	System.exit(0);
    }
    Node corrente = cabeca;
    while (corrente != null){
      System.out.print(corrente.info + " , ");
      corrente = corrente.proximo;
    }
    System.out.print("\n");
  }
  public static int get(int posicao){
      int p = 1; // posicao da cabeca, pode ser 1 ou 0;
      Node corrente = cabeca;
      while (corrente != null){
          if (p == posicao)
              return corrente.info;
          p++;
          corrente = corrente.proximo;
      }
      return -1;  }
  public static int findPosition(int elemento){
      int p = 1; // posicao da cabeca, pode ser 1 ou 0;
      Node corrente = cabeca;
      while (corrente != null){
          if (elemento == corrente.info)//Olho Elemento
              return p;//Retorno a posição
          p++;
          corrente = corrente.proximo;
      }
      return -1;  }
  public static boolean isMember(int elemento){
      int p = 1; // posicao da cabeca, pode ser 1 ou 0;
      Node corrente = cabeca;
      while (corrente != null){
          if (elemento == corrente.info)//Olho Elemento
              return true;//Retorno a posição
          p++;
          corrente = corrente.proximo;
      }
      return false;  }    
  public static int remove(int posicao){
      int p = 1; // posicao da cabeca, pode ser 1 ou 0;
      Node corrente = cabeca;
      while (corrente != null){
          if (p == posicao-1){
              int removido = corrente.proximo.info;
              corrente.proximo = corrente.proximo.proximo;
              return removido;
          }
          p++;
          corrente = corrente.proximo;
      }
      return -1;  }  
}
