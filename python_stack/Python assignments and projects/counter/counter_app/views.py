from django.shortcuts import render, redirect

def index(request):
    
    if 'counter' not in request.session:
        request.session ['counter'] = 1
    else:
        request.session ['counter'] += 1
# you can path it without context but to arrangment my code recomended to use it , but ican write request.session ['counter'] inaread of cotext
    context = {
        "count": request.session['counter']
    }
    
    return render(request,'index.html', context)

def addtwo(request):
    request.session['counter']+=1
    return redirect('/')

def destroy(request):
    request.session.clear()
    return redirect('/')