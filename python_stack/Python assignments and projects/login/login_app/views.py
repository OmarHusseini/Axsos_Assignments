from django.shortcuts import render,redirect
from . import models
from django.contrib import messages
from .models import User

def index(request):
    
    return render(request,'index.html')

def success_page(request):
    if 'user_id' not in request.session:
        return redirect ('/')
    return render(request,'success.html')

def new_register(request):
    if request.method =='POST':
        errors = User.objects.validate_registration(request.POST)
        if errors:
            for messg in errors.values():
                messages.error(request, messg)
            return redirect('/')
        user=models.create_user(request.POST)
        request.session['user_id']=user.id
        request.session['first_name']=user.first_name
        return redirect('/success')
    return redirect('/')

def login(request):
    if request.method=='POST':
        user=models.show_user(request.POST)
        if user is None:
            messages.error(request,'Invalid email or password')
            return redirect('/')
        else:
            request.session['user_id']=user.id
            request.session['first_name']=user.first_name
            return redirect ('/success')
    return redirect('/')

def log_out(request):
    request.session.clear()
    return redirect('/')
    