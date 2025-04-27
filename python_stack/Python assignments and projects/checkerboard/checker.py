from flask import Flask , render_template, session
app = Flask(__name__)
app.secret_key = "test"

@app.route('/')
def chekerboard():
    session['test'] = 1
    return render_template("index.html", rows=8 , col=8 ,color1="red" , color2="black")

@app.route('/<int:rows>')
def checkrow(rows):
    return render_template("index.html", rows=rows, col=8 ,color1="red" , color2="black")

@app.route('/<int:rows>/<int:col>')
def checkrowcol(rows,col):
    return render_template("index.html", rows=rows, col=col,color1="red" , color2="black")

@app.route('/<int:rows>/<int:col>/<color1>/<color2>')
def checkcolor(rows,col,color1,color2):
    return render_template("index.html", rows=rows, col=col,color1=color1 , color2=color2)


if __name__ == "__main__":
    app.run(debug=True)