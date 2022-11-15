/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyManejoArchivos;

/**
 *
 * @author Usuario
 */
public class Nodo {
     private Integer numero;
     private String indice;
     private long ref;
    private Nodo siguiente;
    public Nodo()
    {
        this.numero = 0;
        this.indice = "";
        this.ref = 0L;
        this.siguiente = null;
    }
    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }
    public int getNumero()
    {
        return numero;
    }
    public void setIndice(String indice)
    {
        this.indice = indice;
    }
    public String getIndice()
    {
        return indice;
    }
    public void setRef(long indice)
    {
        this.ref = indice;
    }
    public long getRef()
    {
        return ref;
    }
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
    public Nodo getSiguiente()
    {
        return siguiente;
    }
}
