
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] list;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        list = new int[0];
    }

    /**
     * Añade un elemento a la colección al final de la misma
     */
    public void add(int elemento)
    {
        int [] num;
        num = list;
        list = new int [num.length +1];
        for (int cont = 0; cont < num.length; cont++)
        {
            list[cont] = num[cont];
        }
        list[num.length] = elemento;
    }
    
    /**
     * Añade un elemento a la colección en la posición especificada por el parámetro index. Si el valor de
     * index no es válido, entonces no hace nada. Los elementos a continuación del añadido se desplazan una
     * posición
     */
    public void add(int index, int elemento)
    {
        
    }
    
    /**
     * Vacía la colección
     */
    public void clear()
    {
        list = new int[0];
    }
    
    /**
     * Devuelve true si la colección contiene ese elemento, false en cualquier otro caso
     */
    public boolean contains(int elemento)
    {
        boolean is = false;
        int cont = 0;
        while (cont < size() && !is)
        {
            if(list[cont] == elemento)
            {
                is = true;
            }
            cont++;
        }
        return is;
    }
    
    /**
     * Devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces
     * devuelve -1
     */
    public int get(int index)
    {
        int shown = -1;
        if (index < size())
        {
            shown = list[index];
        }
        return shown;
    }
    
    /**
     * Reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido,
     * no hace nada
     */
    public void set(int index, int elemento)
    {
        if (index < size() && index >=0 )
        {
            list[index] = elemento;
        }
    }
    
    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso 
     * de que la colección no contenga el elemento especificado
     */
    public int indexOf(int elemento)
    {
        int cont = -1;
        if (contains(elemento))
        {
            boolean is = false;
            while(cont < size() && !is)
            {
                if (list[cont] == elemento)
                {
                    is = true;
                }
                cont++;
            }
        }
        return cont;
    }
    
    /**
     * Devuelve true si la lista no contiene elementos
     */
    public boolean isEmpty()
    {
        boolean vacio = true;
        if (size() > 0)
        {
            vacio = false;
        }
        return vacio;
    }
    
    /**
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * Si el valor de index no es válido, no hace nada y devuelve -1
     */
    public void remove(int index)
    {
        
    }
    
    /**
     *  Devuelve el número de elementos de la colección
     */
    private int size()
    {
        return list.length;
    }
}
