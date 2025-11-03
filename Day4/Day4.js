// Easy Questions
// 1. Convert to Arrow Function
// Rewrite the following function using an arrow function:
// function add(a, b) {
//     return a + b;
// }

const res = (a, b) => {
  return a + b;
};
console.log("Q1. " + res(5, 10));

// 2. Default Parameters
// Create a function greet that takes two parameters, name and message. If the message is not provided, it should default to "Welcome!". Use default parameters in your implementation.
function greet(name, msg = "hello ") {
  return `${msg}${name}`;
}
console.log(greet("Q2. Prateek", "Jai Ram ji ki "));
console.log(greet("Prateek"));
console.log(greet("Prateek", ""));

// 3. Template Literals
// Write a function formatString that takes a name and an age and returns a sentence in the format:
// "Hello, my name is [name] and I am [age] years old."

function formatString(name, age) {
  return `Hello, my name is ${name} and I am ${age} years old.`;
}
console.log("Q3. " + formatString("Prateek", 24));

// 4. Object Destructuring
// Given the following object:
const person = {
  name: "Alice",
  age: 25,
  address: { city: "New York", country: "NY" },
};
// Write a function that extracts the name and city properties and logs the sentence: "Alice lives in New York." It should also access and log the address object.
let {
  name,
  address: { city },
} = person;
console.log(`Q4. ${name} lives in ${city}, Address Obj : ${person.address}`);

// 5. Rest Operator
// Write a function sumAll that takes any number of arguments and returns their sum. Use the rest operator to handle the arguments.
let arr = [1, 2, 3, 4, 5, 6];
let sumAll = [0, ...arr].reduce((a, b) => a + b, 0);
console.log("Q5. " + sumAll);

// 6. Filter Even Numbers
// Write a function filterEvens that takes an array of numbers and returns a new array containing only the even numbers. Use the filter method.
// Example:
// filterEvens([1, 2, 3, 4, 5, 6]); // Output: [2, 4, 6]

let arr1 = [1, 2, 3, 4, 5, 6, 7];
let filterEvens = arr1.filter(function (e) {
  return e % 2 === 0;
});
console.log("Q6. " + filterEvens);

// 7. Array Mapping
// Write a function doubleValues that takes an array of numbers and returns a new array where each number is doubled. Use the map method.
// Example:
// doubleValues([1, 2, 3]); // Output: [2, 4, 6]

let arr3 = [1, 2, 3, 4, 5, 6];
let result = arr3.map(function (e) {
  return e * 2;
});
console.log("Q7. " + result);

// 8. Find the Maximum
// Write a function findMax that takes an array of numbers and returns the largest number in the array. Use the spread operator.
// Example:
// findMax([3, 5, 7, 2, 8]); // Output: 8

let arr4 = [1, 2, 3, 4, 5, 6, 7];
function findMax(ar) {
  return Math.max(...ar);
}
console.log("Q8. " + findMax(arr4));

// 9. Object and Array Destructuring
// Given the following data:
const data = [
  {
    name: "Bob",
    age: 24,
  },
  {
    name: "Alice",
    age: 21,
  },
];
// Write a function that extracts the age as  “24”  and name as “Alice” and returns a sentence: "Alice’s age is 24."

let [obj1 = { name, age }, obj2 = { name, age }] = data;
console.log(`Q9. ${obj2.name}’s age is ${obj1.age}`);

// 10. Data Manipulation using Array functions
// Write a function that manipulates data in such a way that it returns an array of objects again but with the selected keys only.
// Input:
let input = [
  {
    id: 1,
    title: "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    price: 109.95,
    description:
      "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    category: "men's clothing",
    image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    rating: {
      rate: 3.9,
      count: 120,
    },
  },
];
// Output:
// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "rate": 3.9,
// "count": 120
// }]

let arrResult1 = input.map((i) => ({
  id: i.id,
  title: i.title,
  rate: i.rating.rate,
  count: i.rating.count,
}));
console.log("Q10. " + arrResult1);

// 11. Default Parameter
const fun = (name = "abc") => {
  if (name) {
    console.log("Q11. if", name);
  } else {
    console.log("Q11. else", name);
  }
};

fun("");
// Output ?
// console.log("Q11. else");

// 12. Deep Clone Objects
// Write a function deepClone that creates a deep copy of a given object. Ensure that nested objects and arrays are properly cloned without retaining references to the original object.
// Example:
const obj = { a: 1, b: { c: 2 } };
// const clonedObj = deepClone(obj);
// clonedObj.b.c = 42;
// console.log(obj.b.c); // Output: 2

function deepCloneMe(object) {
  if (object == null || typeof object != "object") return object;

  if (Array.isArray(object)) return object.map((i) => deepCloneMe(i));

  let cloned = {};
  for (let i in object) {
    if (object.hasOwnProperty(i)) cloned[i] = deepCloneMe(object[i]);
  }

  return cloned;
}

const deepClone = deepCloneMe(obj);
deepClone.b.c = 14;
console.log(obj.b.c);

// 13. Flatten Nested Arrays
// Write a function flattenArray that takes a nested array and returns a flattened array. Use recursion and/or ES6 methods to solve this problem.
// Example:

function flattenArray(arr) {
  return arr.reduce((acc, item) => {
    if (Array.isArray(item)) {
      acc = acc.concat(flattenArray(item)); // recursive call for nested arrays
    } else {
      acc.push(item);
    }
    return acc;
  }, []);
}

const nested = [1, [2, [3, [4, 5]]], 6];
const flat = flattenArray(nested);
console.log(flat);
