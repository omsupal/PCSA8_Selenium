package javaPractice;

public class MethodChainingExample  
{  
private int id;      
private String name;  
private int age;  
private int std;  

public MethodChainingExample setId(int id)   
{  
this.id = id;  
//"this" (the current Student object) to allow for further chained method calls  
return this;  
}  
public MethodChainingExample setName(String name)   
{  
this.name = name;  
return this;  
}  
public MethodChainingExample setAge(int age)   
{  
this.age = age;  
return this;  
}  
public MethodChainingExample setStd(int std)   
{  
this.std = std;  
return this;  
}  
public void detail()   
{  
System.out.println("Student Detail is:\n");  
System.out.println("Id: "+id+ "\nName: "+name+"\nAge: "+age+ "\nStandard: "+std);  
}  
public static void main(String args[])   
{  
	MethodChainingExample student = new MethodChainingExample();  
//method chaining  
student.setId(1183).setName("Herry Tangri").setAge(17).setStd(9).detail();  
}  
}   