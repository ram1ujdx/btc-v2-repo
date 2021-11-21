import { Person } from "./Person";

class Employee extends Person{
    role:string;
    constructor(personId:number, personName:string, age:number, role:string){
       super(personId,personName,age);
       this.role=role;
    }

    showPerson(){
        super.showPerson();
        console.log("Role : "+this.role);
    }

}


let person:Person=new Employee(105,"Mahesh",27,"Developer");

person.showPerson();
