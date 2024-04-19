class  Product
{ static int a=10;
 int b=70;
public static void main(String[] args)
{
 Product p1=new Product();
 int a=50;
System.out.println("Hello");//Hello

//System.out.println(x);
System.out.println(a);//50
System.out.println(Product.a);//accessing static data
System.out.println(p1.b);
}


}