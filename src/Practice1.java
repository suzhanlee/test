import sun.invoke.empty.Empty;

class CustomStack{
    private int top = -1;
    private int[] array;

    public CustomStack(int size) {
        array = new int[size];


    }


    // 스택비었는지
    public boolean isEmpty(){
        return top == -1;
    }
    //스택에 데이터 넣는 메서드
    public void push(int data) {

        if(top == array.length-1){
            System.out.println("FULL");
            return;
        }

        array[++top] = data;
    }

    public int pop(){
        if(!isEmpty()){
            int data = array[top];

            top--;

            return data;
        }
        return top;
    }

    public int peek(){
        if(!isEmpty()){
            int data = array[top];



            return data;
        }
        return top;

    }

    public void show(){
        int tempTop = top +1;
        if(!isEmpty()){
            for (int i = 0; i <top +1 ; i++) {
                System.out.println(array[i]);


            }

        }



    }


    public void reverseShow(){
        int tempTop = top +1;
        if(!isEmpty()){
            for (int i = top ; i >=0 ; i--) {
                System.out.println(array[i]);


            }

        }



    }





















}



public class Practice1 {
    public static void main(String[] args) {

        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);

        stack.push(3);

        stack.push(4);

        stack.push(5);

        stack.show();

        stack.reverseShow();
















    }
}

