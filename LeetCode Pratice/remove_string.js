const string1 =
  "Python is an easy to learn powerful programming language It has efficient high-level data structures and a simple but effective approach to objectoriented programming Python elegant syntax and dynamic typing";
const string2 =
  "Python is an easy to learn powerful programming language efficient and dynamic";

const output =
  "It has high-level data structures a simple but effective approach to objectoriented programming Python elegant syntax and typing";

let splice_string_1 = string1.split(" ");
let splice_string_2 = string2.split(" ");

splice_string_2.map((item) => {
  let index = splice_string_1.indexOf(item);
  splice_string_1 = splice_string_1.toSpliced(index, 1);
});
console.log(splice_string_1.join(" "));


