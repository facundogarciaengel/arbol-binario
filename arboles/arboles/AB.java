public class AB<T> {
    private Nodo<T> raiz;
//Tiene un constructor pero es vacio y llama al de la clase Object    
    public void agregar(T dato){
        Nodo<T> nodo = new Nodo<T>(dato);
        if(raiz == null){
            raiz = nodo;
    }else{
        agregar(nodo, raiz);
    }
    }

    private void agregar(Nodo<T> nodo, Nodo<t> padre){
        if(padre.getIzq() == null){
            padre.setIzq(nodo);
        } else if(padre.getDer() == null){
            padre.setDer(nodo);
        }
        else{
            //la clave aca es que el padre ahora es el hijo izquierdo del padre por decision arbitraria
            agregar(nodo, padre.getIzq());
        }
    }

    public int cantNodos(){
        //se cuenta teniendo en cuenta la cantidad de hijos que tiene cada nodo hasta llegar a null, es una llamada a
        //un metodo recursivo.
        return contarNodos(raiz);
    }

    private int contarNodos(Nodo<T> nodo){
        if(nodo == null){
            return 0;
        }
        return 1 + contarNodos(nodo.getIzq()) + contarNodos(nodo.getDer()); 
    }

    public int altura(){
        //si la raiz del arbol es null la altura es 0 se decide asi arbitrariamente. La altura del arbol es la longitud de la 
        //rama mas larga.
        return calcularAltura(Nodo<T> nodo){
            if(nodo == null){
                return 0;
            }
            int alturaIzq = calcularAltura(nodo.getIzq());
            int alturaDer = calcularAltura(nodo.getDer());
            return 1 + Math.max(alturaIzq, alturaDer);
        }
    }
    } 

