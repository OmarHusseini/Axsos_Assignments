from flask import Flask 
app=Flask(__name__)
@app.route('/')
def sayhello():
    return "Hello World!" 
 
@app.route('/Hi/<name>')
def hiname(name):
        return "Hi"+" " + name
 
@app.route('/repeat/<int:x>/<word>')
def repeat(x, word):
    return  (word + " ") *x
 
if __name__=='__main__':
    app.run(debug=True)
 