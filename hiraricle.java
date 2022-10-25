//import java.util.Scanner;
class Animal
{  
 //Scanner sc= new Scanner(System.in);
  int n;

void eat()
  { 
    n=10;
    System.out.println("eating..."+n);  

}
}


class Dog extends Animal{  
void add()
  {
 int f=1;
  for(int i=0;i<n;i++)
    {
    f=f*i;
     i++; 
    
    System.out.println("factorial number:"+f);

  }
}
}

class Cat extends Animal
{  
void sub()
  {
    int sum=0;
    for(int i=0;i<=n;i++)
      {
        sum=sum+i;
        System.out.println("sum of number:"+sum);
      }
  }
  //{System.out.println("meowing...");}  
}  
class hiraricle{  
public static void main(String args[]){  
Cat c=new Cat();  
  Dog d= new Dog();
c.eat();  
c.sub(); 
c.eat();
d.add();
}
}