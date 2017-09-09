/**
 * New typescript file
 */



import {AbstractControl} from '@angular/forms';


export function myRangeValidator(min, max) {

  return function(c: AbstractControl): {[key: string]: boolean} | null {
    if (c.value < min || c.value > max) {
      return {'range': true};
    }
    return null;
  }

}


export function myEmailMatchValidator(c: AbstractControl): {[key: string]: boolean} | null {
  let email = c.get('email').value;
  let confirmEmail = c.get('confirmEmail').value;
  if (email !== confirmEmail)
    return {'match': true}
  return null;
}





