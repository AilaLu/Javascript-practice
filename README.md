/*
 * Programming Quiz: Murder Mystery (3-4)
 */
 
var room = "gallery";
var suspect = "Ms. Van Cleve";

var weapon;
if ( room === "dining room") 
    { weapon = "knife";} 
    else if (room === "ballroom" ) 
    {weapon = "poison";} 
    else if (room === "billiards room") 
    {weapon = "pool stick";} 
    else 
    {weapon = "trophy";} 
    
var solved;


if ( room === "dining room" && suspect === "Mr. Parkes") {
solved = true;
} else if (room === "ballroom" && suspect === "Mr. Kalehoff") {
    solved = true;
} else if (room === "billiards room" && suspect === "Ms. Sparr") {
    solved = true;
}else {
    solved = true;
    
}


if (solved === true) {
	console.log(suspect+" did it in the "+room+" with the "+ weapon+"!");
}

