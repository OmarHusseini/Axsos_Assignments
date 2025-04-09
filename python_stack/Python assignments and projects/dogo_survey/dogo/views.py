from django.shortcuts import render, redirect

def index(request):
    return render(request,'index.html')

def result(request):
    context = {
        'name': request.POST['user_name'],
        'location': request.POST['location'],
        'progLang': request.POST['prog-lang'],
        'comment': request.POST['comment']
    }
    return render(request, 'result.html', context)



    
