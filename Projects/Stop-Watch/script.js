
var hr=0;                       //for hours  value that we declared hr variable
var min=0;                        //for minutes value that we declared min variable
var sec=0;                        //for seconds value that we declared sec variable
var count=0;                      //for count value that we declared count variable

var timer=false;                  //we declared timer variable for check timer is on or off(means if timer is true then timer is start and timer is false then timer is off)


function start() {                // start() method for timer start

    timer=true;                   //if timer is true then start() function is working and invoked stopWatch() function
    stopWatch();                  // in  stopWatch() function we wrote out main logic 
}



function stop() {                 // stop() function for stop timer

    timer=false;                   // if timer is false then stop() function is working

}



function reset() {                // reset() function for reset timer 

    timer=false;                  // if timer is false then reset() function is working
 
    // assigned all times values zeros
    hr=0;                               
    min=0;
    sec=0;
    count=0;

    //set all time values are zero in html tag
    document.getElementById("hr").innerHTML="00";
    document.getElementById("min").innerHTML="00";
    document.getElementById("sec").innerHTML="00";
    document.getElementById("count").innerHTML="00";


}



//this is main function which will perform the task . 
function stopWatch() {

    if(timer==true)                     // check condition if timer==true then stopWatch() function is working 
    {
        count=count+1;                  // increment count value by 1 and stored within it.


        if(count==100)                  // check condition if count==100 then 
        {
            sec=sec+1;                  // increment sec value by 1 and stored within it.
            count=0;                    // set count value is zero
        }

        if(sec==60)                     // check condition if sec==60 then
        {
            min=min+1;                  // increment min value by 1 and stored within it.
            sec=0;                      // set sec value is zero
        }
        
        if(min==60)                     // check condition if min==60 then
        {
            hr=hr+1;                    // increment hr value by 1 and stored within it.
            min=0;                      // set min value is zero
            sec=0;                      // set sec value is zero
        }


        // we declared 4 variables for stored hr,min,sec,count
        var hrstring=hr;                
        var minstring=min;
        var secstring=sec;
        var countstring=count;

        if(hr<10)                            // check condition if hr is less than 10 then
        {
            hrstring="0"+hr;                 // set hr + "0" value into hrstring value
        }   
        if(min<10)                           // check condition if min is less than 10 then
        {
            minstring="0"+min;               // set min + "0" value into minstring value
        }     
        if(sec<10)                          // check condition if sec is less than 10 then
        {
            secstring="0"+sec;              // set sec + "0" value into secstring value
        }
        if(count<10)                        // check condition if count is less than 10 then
        {
            countstring="0"+count;          // set count + "0" value into countstring value
        }


        document.getElementById("hr").innerHTML=hrstring;           //set our hrstring value into hr-id of html tag 
        document.getElementById("min").innerHTML=minstring;         //set our minstring value into min-id of html tag
        document.getElementById("sec").innerHTML=secstring;         //set our secstring value into sec-id of html tag
        document.getElementById("count").innerHTML=countstring;     //set our countstring value into count-id of html tag
        
        setTimeout("stopWatch()",10);                               // setTimeout("stopWatch()",10) for we called stopWatch() function after 10-milliseconds again and again until condition is false(means timer is false).
    }

}