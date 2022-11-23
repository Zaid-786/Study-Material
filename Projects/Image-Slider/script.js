// i have 4 images 
// images= 4 (0,1,2,3) 





let flag =0;                         /* we declared flag variable and assign value is 0 */

function controller(x)              /* we created controller() function with argument  and passed on onclick event arrow next and arrow prev on element */
    {

        flag=flag+(x);              /* in this statement we add and substract arguments value of x variable and stored into flag variable */

        slideShow(flag);            /* we passed flag variable into slideShow() function */

    }



slideShow(flag);                    /* we called slideShow() function with passed flag variable */        
function slideShow(num)             /* this is slideShow() function in which we wrote our logic to do task  */
    {
        let slides = document.getElementsByClassName("slide");                      /*we selected all slides of main slider container by className and stored into slides variable*/

        if(num == slides.length)            /* in this statement we passed a condition to check num is equal to slide length */
        {
            flag = 0;                       //then flag value is assign to 0
            num = 0;                        // then num value is assign to 0
        }
        if(num<0)                           /* in this statement we passed a condition to check num is less than 0*/      
        {
            flag=slides.length-1;           /*then flag value is assign to slides.length-1 means set last value of sildes*/
            num=slides.length-1;            /*then num value is assign to slides.length-1 */

        }



        for(let y of slides)                /* we created this for loop to access all slides and main reason of this we hide all sildes of screen  */
        {
            y.style.display="none";            /* by this statement we none of sildes display */
        }


        slides[num].style.display = "block";        /*by this statement we selected only particular slide on display  after clicking*/

    }