 class Programmer extends Person{
    technology;

    constructor(personName, location, age=20,technology){
       super(personName,location,age);
       this.technology=technology;
    }


    showPerson(){
        console.log(this);
    }
}