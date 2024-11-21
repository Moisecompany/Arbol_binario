package Actividad_8;

public class Arbol_binario {
    Nodo raiz;

    public void instertar(int valor){
        raiz=instertar_metodo(raiz, valor);
    }
    public Nodo instertar_metodo(Nodo raiz,int valor){
        if (raiz == null){
            raiz = new Nodo(valor);
            return raiz;
        }
        if(valor<raiz.valor){
            raiz.nodo_izquierdo=instertar_metodo(raiz.nodo_izquierdo, valor);
        }else if (valor>raiz.valor) {
            raiz.nodo_derecho = instertar_metodo(raiz.nodo_derecho, valor);
        }
        return raiz;
        }

    public boolean buscar(int valor){
        return buscar_metodo(raiz, valor);
    }
    public boolean buscar_metodo(Nodo raiz,int valor){
        if (raiz == null){
            return false;
        }
        if(valor==raiz.valor){
            return true;
        }else if (valor<raiz.valor) {
            return buscar_metodo(raiz.nodo_izquierdo, valor);
        }else{
            return buscar_metodo(raiz.nodo_derecho, valor);
        }
        }

        public void imprimir(){
            imprimir_metodo(raiz);
            System.out.println();
        }
        public void imprimir_metodo(Nodo raiz) {
            if (raiz != null) {
                System.out.print(raiz.valor + " ");
                imprimir_metodo(raiz.nodo_izquierdo);
                imprimir_metodo(raiz.nodo_derecho);
            }
        }
    
        
        public Nodo eliminar(int valor){            
            System.out.println("Valor eliminado del arbol:"+valor);
            return eliminar_metodo(raiz, valor);
        }
        
        public Nodo  eliminar_metodo(Nodo raiz,int valor){
            if (raiz == null){
                return null;
            }else{
             if (valor<raiz.valor) {
                raiz.nodo_izquierdo= eliminar_metodo(raiz.nodo_izquierdo, valor);
            }else if (valor>raiz.valor){
                raiz.nodo_derecho= eliminar_metodo(raiz.nodo_derecho, valor);
            }else{
                if (raiz.nodo_izquierdo == null && raiz.nodo_derecho == null) {
                    return null;
                }else if (raiz.nodo_izquierdo == null) {
                    return raiz.nodo_derecho;
                } else if (raiz.nodo_derecho == null) {
                    return raiz.nodo_izquierdo;
                }else{
                    Nodo Auxiliar = raiz.nodo_derecho;
                while (Auxiliar.nodo_izquierdo != null) {
                    Auxiliar = Auxiliar.nodo_izquierdo;
                }
                raiz.valor = Auxiliar.valor; 
                raiz.nodo_derecho = eliminar_metodo(raiz.nodo_derecho, Auxiliar.valor);
                }
            }
            return raiz;
            }
        }
}
        
    
 
