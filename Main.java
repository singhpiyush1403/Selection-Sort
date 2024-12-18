
public class Main{
    public static void main(String args[]){
        int [] a= {50,60,10,5,96,35,66};
        int min, temp = 0;
        for(int i=0; i<a.length-1;i++){
             min = i;
            for(int j =i+1; i<a.length; j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            temp = a[i];
            a[i]= a[min]; 
            a[min] = temp;
        }
        for(int i=0;i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}