//-----------------------Oppgave 1-------------------------------------//
function sum(input){
  if (toString.call(input) !== "[object Array]") return false;
  var total =  0;
  for(var i=0;i<input.length;i++) {                  
    if(isNaN(input[i])){
      continue;
    }
    total += Number(input[i]);
  }
  return total;
}
console.log(sum([1,2,3]));
console.log(sum([100,-200,3]));
console.log(sum([1,2,'a',3]));

//-----------------------Oppgave 2-------------------------------------//
function test37(x) 
{
  if (x % 3 == 0 || x % 7 == 0) 
  {
    return true;
  } 
  else {
    return false;
  }
}

console.log(test37(12));
console.log(test37(14));
console.log(test37(10));
console.log(test37(11));

//-----------------------Oppgave 3-------------------------------------//
function multiplyBy() 
{ 
  num1 = document.getElementById("firstNumber").value; 
  num2 = document.getElementById("secondNumber").value; 
  document.getElementById("result").innerHTML = num1 * num2; 
} 
function divideBy() { 
  num1 = document.getElementById("firstNumber").value; 
  num2 = document.getElementById("secondNumber").value; 
  document.getElementById("result").innerHTML = num1 / num2; 
} 

//-----------------------Oppgave 4-------------------------------------//
function oppgave4(){
var library = [ 
    {
        title: 'Bill Gates',
        author: 'The Road Ahead',
        readingStatus: true
    },
    {
        title: 'Steve Jobs',
        author: 'Walter Isaacson',
        readingStatus: true
    },
    {
        title: 'Mockingjay: The Final Book of The Hunger Games',
        author: 'Suzanne Collins',
        readingStatus: false
    }];

for (var i = 0; i < library.length; i++) 
   {
    var book = "'" + library[i].title + "'" + ' by ' + library[i].author + ".";
    if (library[i].readingStatus) {
      console.log("Already read " + book);
    } else
    {
     console.log("You still need to read " + book);
    }
   }
}
//-----------------------Oppgave 5-------------------------------------//
function oppgave5() {
  var num = Math.ceil(Math.random() * 10);
  var gnum = prompt('Guess the number between 1 and 10 inclusive');
  if (gnum == num)
    alert('Matched');
  else
    alert('Not matched, the number was ' + num);
}  


