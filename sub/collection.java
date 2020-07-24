import java.util.Arrays;
import java.io.*;
public class CustomCollection<E> {
	private Object[] x;
	private static int s=10;
	private int sz=0;
	public CustomCollection() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	public CustomCollection(int c) {
		if(c>0)
			x=new Object[c];
		else if(s==0)
			x=new Object[s];
		else
			throw new IllegalArgumentException("Invalid capacity:"+c);
	}
	public void add(E e) {
		checkcapacity();
		x[sz++]=e;
	}
	public void checkcapacity() {
		// TODO Auto-generated method stub
		if(x.length<=sz) {
			int oldval=x.length;
			int newval=oldval*2;
			x=Arrays.copyOf(x, newval);
		}
	}
	public E get(int idx) {
		if(idx>=sz) {
			throw new ArrayIndexOutOfBoundsException(idx);
		}
		return(E)x[idx];
	}
	public E remove(int idx) {
		if(idx>=sz-1) {
			throw new ArrayIndexOutOfBoundsException(idx);
		}
		E oldvalue=(E)x[idx];
		int numMoved=sz-idx-1;
		if(numMoved>0)
			System.arraycopy(x,idx+1, x, idx, numMoved);
		x[--sz]=null;
		return oldvalue;
	}
	public void print() {
		for(int i=0;i<=x.length-1;i++) {
			System.out.println(x[i]);
		}
	}
}