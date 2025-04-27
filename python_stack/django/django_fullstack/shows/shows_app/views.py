from django.shortcuts import render, HttpResponse , redirect
from . import models
from django.contrib import messages
from .models import Shows

def index(request):
    context={
        'shows':models.all_show()
    }
    return render(request,'index.html',context)

def create(request):
    return render(request,'create.html')

def add_new_show(request):
    if request.method == 'POST':
        errors = models.Shows.objects.basic_validator(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/shows/new')
        else: 
            new_show_id = models.add_new(request.POST)
    else:
     return redirect(f'/show_detail/{new_show_id}')

def edit_show(request,tv_id):
    if request.method=='POST':
        models.update_page(request.POST,tv_id)
        return redirect(f'/update/{tv_id}')
    return redirect(f'/update/{tv_id}')
    

def show_detail(request,tv_id):
    context={
        'shows':models.get_show_id(tv_id)
    }

    return render(request,'show-detail.html',context)


def update_page(request,tv_id):
    context={
        'shows':models.get_show_id(tv_id)
    }

    return render(request,'update.html',context)

def delete_show(request,tv_id):
    models.delete_show(tv_id),
    return redirect('/')


    
