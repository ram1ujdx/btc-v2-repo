export class Person{
    
    constructor(private personId:number, private personName:string, private age:number){}

    public showPerson():void{
        console.log("ID : "+this.personId);
        console.log("Name : "+this.personName);
        console.log("Age : "+this.age);
    }

}

