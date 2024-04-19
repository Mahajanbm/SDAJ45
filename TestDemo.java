class Category
{ 
static int id=1;
String name="Electroics";
int enddate=121124;
}
class TestDemo
{
public static void main(String[] args)
{
Category c1=new Category();//object creation 
System.out.println(Category.id);
System.out.println(c1.name);
System.out.println(c1.enddate);


}

}