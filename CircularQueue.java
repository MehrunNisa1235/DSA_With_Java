


//CircularQueue implementation using Array:- 

public class CircularQueue
{
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear; 
        static int front; 
        Queue(int n)
        {
            arr=new int[n]; 
            size=n; 
            rear=-1; 
            front=-1; 
        }

        //isEmpty

        public static boolean isEmpty()
        {
            return rear==-1 && front==-1; 

        }

        //isFull
        public static boolean isFull()
        {
            return (rear+1)%size == front; 
        }

        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full ");
                    return; 
            }
            //add element in first
            if(front == -1)
            {
                front=0;
            }
            rear=(rear+1) % size;
            arr[rear]=data; 

        }

        //remove

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty" ); 
                        return -1; 
            }

            int result = arr[front]; 
            // if delete last element 
            if(rear == front)
            {
                rear=front=-1; 
            }
            else
            {
                front = (front+1) % size; 
            }
            
                return result; 
        }

        //peek

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty" ); 
                        return -1; 
            }

                return arr[front]; 
        }
        

    }
    public static void main(String args[])
    {
        Queue q = new Queue(3);
        q.add(4);
        q.add(7);
        q.add(21); 
        System.out.println(q.remove());

        q.add(3);
        System.out.println(q.remove()); 

        //q.add(6); 

        while(!q.isEmpty())
        {
            System.out.println(q.peek()); 
            q.remove(); 
        }
    }
}
