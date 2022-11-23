

//..............................................................................................................................................................
// JavaScript let and const :-

// in javascriptES6 let has a block-scope concept.

// * javascriptES6  let :-

//          let x="hello";

//      {
//          let x="owner";
//     //this console.log(x) is printed x value of inside scope.
//          console.log(x);         // output:- owner
//       }

//      // this console.log(x) is printed x value of out of scope
//              console.log(x);             // output :- hello




// javascriptES6 const :-

// in javascriptES6 const when you are declared a variable by using const that means that variable value once defined and cannot be changed.

// const name1="ansari";

// name1="zain";           // cannot change name1 variable because it is a constant variable

// console.log(name1);      // output :- error

// ..........................................................................................................................................................................




// * JavaScript Arrow Function=>

//     for example:-
                        // created a regular function
                        //         let x= function(a,b){
                        //             return console.log((a+b));
                        //         } 

                        //         x(10,20);                      

                        // // create an arrow function
                        //         let y= (a,b)=>{
                        //             return console.log((a+b));
                        //         }

                        //         y(10,20);






// => javascriptES6 module:-

import { greetPerson } from "./testing";

let x=greetPerson("ansari");

console.log(x);







