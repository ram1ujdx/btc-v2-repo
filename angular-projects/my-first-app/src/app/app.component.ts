import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';

  personName?:string;

  isDisabled:boolean=false;

  btnText="Add Persons";
  
  persons:Array<String>=[];

  comments?:string="Some Comments";

  showMessage(personName:any){
    this.personName=personName.value;
    
  }

  addPerson(personName:string){
    this.persons.push(personName);
    console.log(this.persons);
  }

}
