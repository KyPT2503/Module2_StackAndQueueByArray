public class MyQueue<E> {
    private int capacity;
    private E[] queueArr;
    private int currentSize;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.queueArr = (E[]) new Object[this.capacity];
        this.currentSize = 0;
    }

    public boolean isQueueFull() {
        return this.currentSize == this.capacity;
    }

    public boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public void enqueue(E e) {
        if (!this.isQueueFull()) {
            this.queueArr[currentSize] = e;
            currentSize += 1;
        }
        System.out.println("Queue is filled.");
    }

    public E dequeue() {
        if (this.isQueueEmpty()) {
            System.out.println("Queue is empty, cant dequeue.");
            return null;
        }
        E result = queueArr[0];

        for (int i = 0; i < currentSize - 1; i++) {
            queueArr[i] = queueArr[i + 1];
        }
        queueArr[currentSize - 1] = null;
        currentSize -= 1;

        return result;
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>(4);
        queue.enqueue(4);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(24);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        System.out.println(queue);
    }

}
