class Rectangle{
int width , height;
int area(){
return width*height;
}
}
public class B4{
public static void main(String[] args){
Rectangle rect = new Rectangle();
rect.height = 15;
rect.width = 10;
System.out.println(rect.area());
}
}
