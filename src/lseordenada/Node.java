package lseordenada;

public class Node {
  int info;
  Node proximo;

  Node(int dado){
    this.info = dado;
    this.proximo = null;
  }
  Node(int dado, Node next){
    this.info = dado;
    this.proximo = next;
  }

  public int getDado(){
    return info;
  }
  public void setDado(int dado){
    info = dado;
  }
  public Node getProximo(){
    return proximo;
  }
  public void setProximo(Node prox){
    proximo = prox;
  }
    
}

