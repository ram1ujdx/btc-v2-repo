import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  constructor() { }

  personList:Array<Person>=[];


  ngOnInit(): void {
  }

  getColorByAge(age:number):string{
    return age>=18?'green':'red';

  }

  getClassByAge(age:number):string{
    return age>=18?'style1':'style2';
  }

  addPerson(personName:any, email:any, age:any){

    let person=new Person(personName.value,email.value,age.value);

    this.personList.push(person);

    console.log(this.personList);

  }

}
