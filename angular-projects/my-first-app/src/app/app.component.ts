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

  btnText="Click Me";

  comments?:string="Some Comments";

  showMessage(personName:any){
    this.personName=personName.value;
    
  }

}
