from django.shortcuts import render , redirect
from . import models

def index(request):
    context={
        'users': models.all_user()
    }
    return render(request,'index.html',context)


def information(request):
    if request.method == 'POST':
        models.new_user(request.POST)
        return redirect('/')