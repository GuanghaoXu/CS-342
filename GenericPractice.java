import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class GenericPractice<M extends Number & Comparable<M> > {
    private LinkedList<M> list;
    M initVal;
    GenericPractice(M val)
    {
        initVal = val;
        list = new LinkedList<>();
        list.add(val);
    }
    public void storeValue(M val)
    {
        list.add(val);
    }
    public void changeValue(M val,int index)
    {
        list.set(index,val);
    }
    public void printArray()
    {
        if(list.isEmpty())
        {
            System.out.println("empty list");
            return;
        }
        Iterator<M> itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
    public void sortPrintArray()
    {
        if(list.isEmpty())
        {
            System.out.println("empty list");
            return;
        }
        Collections.sort(list);
        for (M m:list) {
            System.out.print(m+" ");
        }
        System.out.println();
    }
    public void sortReversePrintArray()
    {
        if(list.isEmpty())
        {
            System.out.println("empty list");
            return;
        }
        Collections.sort(list,Collections.reverseOrder());
        for (M m:list) {
            System.out.print(m+" ");
        }
        System.out.println();
    }
    public void clearList()
    {
        list.clear();
    }
}


class Main
{
    public static void main(String[] args) {
        GenericPractice<Integer> object= new GenericPractice<>(6);
        object.storeValue(8);
        object.storeValue(9);
        object.storeValue(5);
        object.printArray();
        object.changeValue(5,1);
        object.printArray();
        object.sortPrintArray();
        object.sortReversePrintArray();
    }
}