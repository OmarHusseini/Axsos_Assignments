const ProductController = require('../controllers/product.controller');
 
module.exports = app => {
  app.post('/api/product', ProductController.createProduct);
  app.get('/api/products', ProductController.getAllProduct);
  app.get('/api/product/:id', ProductController.getProduct);
  app.patch('/api/product/:id', ProductController.updateProduct);
  app.delete('/api/product/:id', ProductController.deleteProduct);
};