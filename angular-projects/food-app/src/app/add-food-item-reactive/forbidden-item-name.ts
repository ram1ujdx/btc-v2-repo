import { AbstractControl } from "@angular/forms";

export function forbiddenItemNameValidator(control:AbstractControl):{[key:string]:any}|null{

    let forbiddenPattern=/xyz/.test(control.value);
    return forbiddenPattern?{'forbiddenPattern':{value:control.value}}:null;

}