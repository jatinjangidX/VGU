public class B5{
public static void main(String[] args){
int sum = 0;
int[] arr = {1,2,3,4,5};
for(int i=0; i<arr.length; i++){
  sum+=arr[i];
}

double avg = sum/arr.length;
System.out.println("The Sum is "+ sum);
System.out.println("THe Average is "+ avg);
}
}