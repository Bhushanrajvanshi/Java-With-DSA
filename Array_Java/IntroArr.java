package Array_Java;

public class IntroArr {
    public static void main(String[] args) {
        ArrDemo obj = new ArrDemo();
        obj.Demo();
        obj.SumofArray();
        obj.MaxofArray();
        obj.SearchofArray();

    }
}

class ArrDemo{
    void Demo(){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+ " ");
        }
        System.out.println();
    }

    void SumofArray(){
        int arr[] = {4, 5, 1, 7, 8, 9, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        System.out.println("The sum of array is: "+sum);
    }


    void MaxofArray(){
        int arr[] = {4, 5, 1, 7, 8, 9, 2};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
        }
        System.out.println("The max of array is: "+max);
    }

   int SearchofArray(){
        int arr[] = {4, 5, 1, 7, 8, 9, 2, 7, 3, 8};
        int search = 7;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("The element is present at index: "+i);
                break;
            } 
        }
        return ans;
    }
}