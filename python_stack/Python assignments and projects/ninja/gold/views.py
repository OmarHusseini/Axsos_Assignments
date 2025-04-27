from django.shortcuts import render, redirect

def index(request):
    if 'silver' not in request.session:
        request.session['silver'] = 0
    
    if 'activity' not in request.session:
        request.session ['activity']=[]
    return render(request,'index.html')

def process_money(request):
    if request.method == 'POST' :
        location = request.POST ['location']
        
