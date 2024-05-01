`
					**Java has pointers but end user can not access it.**

Method :-

	 Syntax:-
		access_specifier static/nonstatic returntype method_name(Arguments)

	 Types :- 
		No Return type - No Argument++
		With Return type - No Argument
		No Return type  -  With Argument
		With Return type - With Argument

	 To Call Method :-
		Function_Name();

	Rules For Return Type:-
		1. Line Of Code After Return Statement will not execute.
		2. Return Statement Will not allowed in loop [Only 1 time return].
		3. Return Statement Will Return Only One Value[Only 1 Value return].

	Method OverLoading :-
		1. You can change parameters When you have same return type.
		2. If the number of parameters are same you need to change the return type compalsarily such that it does not type of cast return type implicitly.
		3. You can not just simply change the datatype of the arguments keeping the return type and the number of arguments same for two methods.


---



	Constructor:-

		1. Constructor should be same name as class name
		2. There has no return type.
		3. You can call a method inside the constructor.[Non Static Methods                 And Inside Class Methods]
		4. We can use access Modifiers.
		5. Constructor can not defined inside the constructor.

---


**Difference between Method and construction**:

	 Method:-

		The method name can be decided by user.
		Method needs to be explicitly call.
		Method has return type.
		We can call method in the constructor.
		when the method are same name it is method overloading we need to change return type/parameters.

	Constructor:-

		Construction name and class name should be same compalsary.
		the construction is called implicitly during the object creatin.
		Construction has no return type.
		You can not call constructor inside constructor.
		In construction overloading with only different parameters.
		non parameter constructor is not Always default construction.
		Every default constructor sholud be non parmeter.


*Whenever You want to access object allocation it gives classname@hashcode**

	Immutable Class :-
		-> Decare the class as final so it cannot be extended
		-> all class member should be private s they cannot be accessed outside of the class.
		-> Class member are only initailazed using constructor.

		Example this keyword:-
			ArrayObj(int id,String name,double rate){
				this.id = id;
				this.name = name;
				this.rate = rate;
			}

		Usege of this keyword :-
			->this can be used to refer current class instance variable.
			->this can be used to invoke current class method.
			->this() can be used to invoke current class constructor.
			->this can be passed as an argument in the method call.
			->this can be passed as an argument in constructor call.
			->this can be used to return the current class instance from the method.

		Visibiity modifiers:
			Accessing private members in class ;-
				
				whenever a variable of a class is declared privarte that is
					
					private datatype variable_name;
				then you can not access the variable directly in main function even with the help of object.
				
				Soluction to this is as follows :-
					Usege of parameterrised constructors just to initialize the values.
					assign the private variable to a public variable of the same class 
						Ex ;-
							private int a;
							int b = a;
					And use variable b everyware this holds true when a is already initialized in class.
				
				Compalsarily follow for dynamicaly usege:-
					declare a public method in which you cna directly use variable a for initializing ,performing operations on it
					the public method can have void or any return type parameterised or non parameterised.
					call this method in main through function to follow object to access variable in it.
					
					Note :-
						static private can be access through static methods only.
						
					Similarly when a class method is declared private A you need to create a public method B, call the private method A inside B And then call public method B in the main function.
					
					Methods to access private members:-
					
					Private members can initialise only 1 time.
						1. Using Constrructors
							
							Ex :-
								Class AccessModifier{
									private int a = 100;
									
									AccessModifier(int a){
										this.a = a;
									}
								}
								
					2. Using public variable
						
						Ex :-
							Class AccessModifier{
									private int a = 100;
									public int b = a;
								}
					
					3. Universal Method :-
						
						Return the private variable
							private int a;
							public int SetA(){
								a=sc.nextInt();
								return a;
							}
						
							
				Methods to access private Methods :-
						
						By Calling Private Method inside the pucic Method
							
							private a;
							private void increment(){
								a++;
								System.out.printnl(a);
							}
						public void setA(){
							sout("Enter value of A :");
							Scanner sc = new Scanner(System.in);
							a = sc.nextInt();
							increment();
						}
			
			Copy Constructor :-
		
		
		Wrapper Class :-
			The wrapper class in java provides the mechanism to convert primitive into object and object into primitive.
			Since J2SE 5.0 autoboxing and unboxing feature convert primitive into objects  and objects into primitive automatically. The automatic conversation of primitive into an object is known as autoboxing and vise-versa unboxing.
						
		Autoboxing :-
			Automatic conversation of primitive datatype into its corrospinding  wrapper class.
			Ex :-
				int a= 20;
				Integer i= Integer.valueOf(a); //Converting int into Integer explicitly
				Integer j = a; // Automaticaly Converting int into Integer Autoboxing .
				
		Unboxing :-
			 conversation of wrapper into its corrospinding  primitive type.
			Ex :-
				Integer a = new Integer(3);
				int i = a.intValue(); //converting Integer to int explicitly.
				int j = a; //unboxing, now compiler will write a.intValue() internally.
			
		Difference Between char and string
	
	Char :-
		->The Syntax to declare care value is char a = 'a';
		->If we try to define multiple character we need to create array of character and each character will be stored in each index.
		->White space characters will not counted in char datatype.
		->Char is a primitive datatype.
		->It has a wrapper class named Character.
		
	
	String :-
		->The Syntax to declare String value is String a = "xyz";
		->String is a collection of characters defined under a single variable and the location of perticular character can be retrive using string class methods.
		->White space characters will counted in String datatype.
		->String is a primitive datatype.
		->Strins itself a wrapper class whereas use as datatype.
		
		
		String Class:-
			String s = "HEllo";
			String s = new String("Hello");
			
			The object of variable of String class will never been change even if you concat ,replace,trim of uppend any String.
		
		To save the updated string after this operations you need to create another variable or object of string class.
	
	StringBuffer class Methods :-
		append();
		length();
		capacity();
		charAt();
		delete();
		deleteCharAt();
		insert();
		length();
		reverse();
		replace();

Difference Between String  and String Buffer Class :-

| String                                                                                                                                                                           | String Buffer                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| The string class objects are immutable.                                                                                                                                          | The string Buffer class objects are mutable.                                                                   |
| String Class objects holds its string length you can not change its size.                                                                                                        | In StringBuffer Class objects you can change its size.                                                         |
| You can concate the string string with other string and replace the characters of the string  at a given position but you can not insert a character sequence amidest the string | You can insert a character sequence in a string buffer object retaining the original characters in the string. |
| You can not delete any character from a string class object.                                                                                                                     | You can delete any character from a string Buffer class object which also adjust the …                         |
| String class object need to be type case explicitly to use string Buffer class methods                                                                                           | String Buffer class object can use string class methods directly                                               |
| You donn't need a any object to initialize a variable.                                                                                                                           | You compalsary need a object to initialize a variable.                                                         |
	You can convert a string class object into string buffer object to access the methods of string buffer class. You can not directly pass a string to string buffer object.


		Instance of operators in java:-
			This operator returns either true or false and hence is mejorly used in conditional statements.
			It is used to check whether a given object belongs to a perticular class or not.
		
	ArrayList Class
		- Java ArrayList class uses a dynamic array for storing the methods.
		- It is like an array, but there is no size limit.
		- we can add or remove element anytime.SO,it is much more flexible than the traditional array.
		- it is found in java.util package.
		- The ArrayList in java can have the duplicate element also.
	
	* Important points about the java ArrayList Class are:-
		- Java Array List class can contain duplicate elements.
		- Java Array List class maintains insertion order.
		- Java Array List class is non synchronized.
		- Java Array List allows random access because the array works on an index basis.
		- In ArrayList,  Manuplication in a little bit slower then the LinkList in java because shifting needs to occur if any element in=s removed from the array list.
		- we can not create an array list of primitive types , such as int ,float,char etc.It is required to use the required wrapper class in such cases.
			- Ex :-
					- 1. ArrayList<int>a1 = ArrayList<int>();  \\does not work.
					- 2.  ArrayList<Integer>a1 = new ArrayList<Integer>();  \\works fine.
  

---
															 Inheritance

---		
	**Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of a parent object . It is an important part of oops.**
	
	when you inherite from an existing class , you reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.
	
	Inheritance represents the Is-A Relationship in which is also know as a parent-child relationship.
	
	Sub Class/Child Class :-
		Subclass is a class which inherits the other class. It is also called a derived class,extended class , or  a Child class.
		
		Syntax :-
			class subclass_Name extends superclass_name
			
	Super class/Parent Class :-
		Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

		Parent class has same syntax as class syntax.

		**A SINGLE CHILD CLASS CAN NOT HAVE MULTIPLE PARENT CLASS BUT A SINGLE PARENT CLASS CAN HAVE MULTIPLE CHILD CLASS WHICH KNOWN AS HIRARCHICAL ING=HERITANCE.**
		
		PUBLIC ;-
			It will access in all levels.
		
		Private :-
			Only the same class members can access it.
		
		Protacted :-
			Only 1 level can access it.
			
	Inside the static methods super keyword can not used.

---
															Exception

---



Exception:-

	Exception is unwanted event/unexpected event it will occure du0ring execution of the program.

		So It Will disturb the flow of execution and remaining code will not executed.

	Exception Handling

		It is used to handle exception using try-catch.

		try{
		
		}
		Catch(ExceptionObjecct eo){
		
		}
		Final{
		
		}

Example :-
	
	class demo{
	
		public static void main(String[] args){
			int a=10 , b = 5 , c = 5; 
			try{
				int x = a/(b-c);
			}
			catch(arithmeticexception e){
			sout("divide by zero .");
			}
			int y = a/(b+c)
			sout(y)
			}
		}

	So In Java Error that can not be handle by user or programmer Ex:- Virtual matchin error , Stack Overflow, Out of Memory error , etc.


	Types of exceptions :-
		1.IO Exception
		2. SQLException
		3. ClassNotFoundException
		4. RuntimeException
			1. ArithmeticException
			2. NullPointerException
			3. NumberFormetException
			4. IndexOutOfBoundException
			5. StringIndexException
			6. ETC...


**WRITE A PROGRAM USING MULTIPLE CATCH BLOCK.

		try{
		
		}
		Catch(ExceptionObjecct eo){
		
		}Catch(ExceptionObjecct eo){
		
		}Catch(ExceptionObjecct eo){
		
		}
		Final{
		
		}


	checked Exception:-
		Exception predicted by programmer and it will handle at compile time.

	UnChecked Exception :-
		Exception it will check at run time error.
		IT is compalsary to handle check exception at compiletime .
		Compiler talls it may be possibility to come error at run time that file not found exception so it is compalsary to handele check exception.
		we can handle check exception in 2 ways
			1.Using Try Catch Block
			2. Using throws keyword.
		
			Example:-
				//Using Try-Catch Block
				try {
					Printwriter pw = new Printwriter("abc.txt");
				}catch(FilenotfoundException e){
					sout("File Not Found.."+e.getMessage());
				}
				
				Usage of Throws Keyword:-
					>Throws keyword is used for checked exception.
					>we can declare exceptions with the method signature using throws keyword.
					>we can declare multiple exceptions using throws keyword.
					>we can handle multiple exceptions at a time.
					>throws Keyword Delegate the responbility of exception handling to caller methd.
					
					Syntax :-
						returntype method_Name() throws exception_class_Name{
						
						}
					
					Example:-
						public static void main(String[] args) throws FileNotFoundException , ClassNotFoundException{
							Printwriter pw = new Printwriter("abc.txt");
						}

	Custome Exception / User Define Exception :-
		
		Java exception cover allmost all the general type of exceptions that may accure during the programming.
		If Programmer want to build business logic and it is usefull for the application users then programmer can build custome accption.
		
		Exception Class Hirarchi:-
			
					Throws
						^
						|
				Exception
						^
						|
			Custome Exception

		Custome Exception Program using superclass exception :-
			  	  
			class MyException extends Exception{  
			    MyException(String msg){  
			        super(msg);  
			    }  
			}  
			  
			public class CustomeException {  
			    public static void main(String[] args){  
			        float x = 5;  
			        float y = 1000;  
			        try{  
			            float z = x/y;  
			            if(z<0.01){  
			                throw new MyException("Number Is too small.");  
			            }  
			        }catch(MyException e){  
			            System.out.println("Caught my exception.");  
			            System.out.println(e.getMessage());  
			        }  
			    }  
			}
		
		Custome Exception Program using super class runtime exception.`
		
	Chained Exception:

		method:
			getcause()
			
			
			
		Interface In java:-
			It IS collection Fully abstract classes and methods.
			Used To implement multiple hirarchical inheritance.
			we can not create an object of Interfacce.

		Abstract Class :-
			The method Is Only Declared Not Defined.
			we can not create an object of abstract class.
			
		Upcasting :-
			Parent class reference and child class object.
		
		Use of upcasting :-
			upcasting is useful when youb want to write genric code that can handle diffierent types of objects without having to write sepratr code for eacch type.
			It also usefull when you want...