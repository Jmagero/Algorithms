// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

// Examples:

// solution('abc', 'bc') // returns true
// solution('abc', 'd') // returns false

function solution(str, ending){
  // console.log(ending.length);
  // let newStr = str.slice(-2);
  // return (newStr === ending ? true : false);
  return str.endsWith(ending);
}

