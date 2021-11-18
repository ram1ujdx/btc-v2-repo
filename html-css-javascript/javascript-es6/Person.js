class Person{
    personName;
    location;
    age;

    constructor(personName, location, age=20){
        this.personName=personName;
        this.age=age;
        this.location=location;
    }

    showPerson(){
        console.log(this);
    }

}




let p1=new Programmer('Rahul',"Bangalore",25,"Java");
p1.showPerson();