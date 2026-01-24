class Hello{
int a , b;
void setter(int a, int b){
this.a = a;
this.b = b;
}
int add(){
return a+b;
}
}
public class B8{
public static void main(String[] args){
Hello hell = new Hello();
hell.setter(2,4);
System.out.println("Addition is:" + hell.add());
}
}