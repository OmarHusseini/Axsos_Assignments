
const Product = require('../models/product.model');
 
module.exports.createProduct = (req, res) => {
    const {title,price,description } = req.body;
 
    Product.create({title,price,description})
    .then(product => res.json({msg:"uyfyguy",result:product}))
    .catch(err => {
        console.error("❌ Error creating person:", err);
        res.status(400).json(err);
    });
}
module.exports.getAllProduct = (request, response) => {
    Product.find({})
        .then(products => response.json(products))
        .catch(err => response.json(err))
}
 
module.exports.getProduct = (request, response) => {
    Product.findOne({_id:request.params.id})
        .then(product => response.json(product))
        .catch(err => response.json(err))
}

module.exports.updateProduct = (request, response) => {
    const {title,price,description } = request.body;
    Product.findOneAndUpdate({_id: request.params.id},{title,price,description } , {new:true , runValidators: true})
        .then(updatedPerson => response.json(updatedPerson))
        .catch(err => response.json(err))
}
 
module.exports.deleteProduct = (request, response) => {
    Product.deleteOne({ _id: request.params.id })
        .then(deleteConfirmation => response.json(deleteConfirmation))
        .catch(err => response.json(err))
}
    