let allButtons = document.querySelectorAll("button");
let input = document.getElementById("display");

allButtons.forEach((element) => {
    element.addEventListener("click",() =>{
        switch(element.value){
            case "MR":
                console.log("MR is clicked");
                break;

            case "C":
                input.value = 0;
            
            default:
                input.value += element.value;
        }
    });
});