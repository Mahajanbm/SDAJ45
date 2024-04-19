class Person
{

static  int id=101;
 void demo()
{
System.out.println(Person.id);
}
 static void data()
{
//Person p1=new Person();
System.out.println(Person.id);
}
 public static void main(String[] args)
{
Person p1=new Person();
System.out.println(p1.id);
}
}