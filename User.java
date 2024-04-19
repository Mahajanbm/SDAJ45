class User
{ 
static int x=90;
int a=80;//non-static data
  void demo()
{
System.out.println(a);
}

public static void main(String[] args)
{
User u1=new User();
u1.demo();
System.out.println(u1.a);
System.out.println(User.x);
}
}