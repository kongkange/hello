class Person{
	String name;
	int age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void sayHello(){
		System.out.println("Hello, "+name);
	}
}