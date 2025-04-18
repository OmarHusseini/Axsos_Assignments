from django.shortcuts import render,redirect
from . import models
def index(request):
    context={
        'dojos': models.all_dojo(),     
        'ninjas':models.all_ninja()
    }
    return render(request,'index.html',context)

def new_dojo(request):
    if request.method == "POST":
        models.dojo.new_dojo(request.POST)
        return redirect('/')
    return redirect('/')

def new_ninja_frompost(request):
    if request.method == "POST":
        models.new_ninja1(request.POST)

        return redirect('/')
    return redirect('/')