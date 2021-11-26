import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'codep'
})
export class CodepPipe implements PipeTransform {

  transform(value: any,...txt:any): string {
    return "C00X1"+" - "+txt[0]+" - "+value;
  }

}
