public interface FilaInterface {
    public void enqueue(Object objeto);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public Object front();
}