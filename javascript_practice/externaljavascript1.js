// console.log("hello world!...");
// alert("hello world!");
document.write("hello world!");


// this is example of prompt() through it we will take input from user
/*
let age=prompt("enter the age ");

if(age != null)
{
   alert("your age is "+age);
}
else
{
	alert("age filed was blank");
}
*/





// this is example of confirm() method and its shows the confirmation statement and give result in the form of (true and false).
let response = confirm("Are you sure you want to delete it.");

if(response)
{
    document.write("true output...... ");
}
else{
    document.write("false output.....");
}

