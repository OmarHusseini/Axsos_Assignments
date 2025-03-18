

function pizzaoven(hand, protein, cheese, toppings) {
    var pizza = {};
    pizza.crust = hand;
    pizza.sauce = protein;
    pizza.cheeses = cheese;
    pizza.toppings = toppings;
    return pizza;
}

// var order1 = pizzaoven("deep dish", "traditional", ["mozzarella"], ["pepporoni", "sausage"])
// // var x = ("black","egg","chedeer",["honey","patat"])
// console.log(order1);
console.log(pizzaoven(pizza.crust));

var order2 = pizzaoven("hand tossed", "marinara", ["mozzarella ", "feta"], ["mushrooms", "olives", "onions"])
console.log(order2);
var order3 = pizzaoven("sowerdo", "katchap", ["mozzarella ", "feta"], ["olives", "tomato"])
var order4 = pizzaoven("tosseh", "marinara", ["mozzarella ", "feta"], ["chicken", "whitesauce"])

function random_pizz(order1) {
    return order1[math.pizza(math.random() * order1)]
}
var doos = []
