import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        MinQueue<Integer> queue = new MinQueue<>(10001);

        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push" :
                    queue.enqueue(Integer.parseInt(str[1]));
                    break;
                case "pop" :
                    System.out.println(queue.front() != null ?  queue.dequeue() : -1);
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    System.out.println(queue.isEmpty() == true ? 1 : 0);
                    break;
                case "front" :
                    System.out.println(queue.front() != null ?  queue.front() : -1);
                    break;
                case "back" :
                    System.out.println(queue.rear() != null ?  queue.rear() : -1);
                    break;
            }
        }
    }
}


class MinQueue<E> {
    private int head;
    private int rear;
    private Object[] array;

    public MinQueue(int size) {
        head = -1;
        rear = -1;
        array = new Object[size];
    }

    // 큐의 위치중 앞에 값을 추가
    public void enqueue(E item) {
        if (!full()) {
            rear += 1;
            array[rear] = item;
        }

    }

    // 큐의 위치중 뒤에 값을 반환
    public E dequeue() {
        if (!isEmpty()) {
            head += 1;
            return (E) array[head];
        }
        return null;

    }

    // 큐의 위치중 앞 요소 반환
    public E front() {
        if (!isEmpty()) {
            return (E) array[head + 1];
        }
        return null;

    }

    // 큐의 위치중 뒤 요소 반환
    public E rear() {
        if (!isEmpty()) {
            return (E) array[rear];
        }
        return null;
    }

    // 큐의 크기를 반환
    public int size() {
        return rear - head;
    }

    // 큐가 비어 있는지 확인하는 메서드
    public boolean isEmpty() {
        return size() == 0;
    }

    // 큐가 전부 찼는지 확인하는 메서드
    private boolean full() {
        return size() == array.length;
    }

}