from django.shortcuts import render

from django.shortcuts import render
from time import gmtime, strftime
    
def index(request):
    context = {
        "time": strftime("%b %w ,%Y  %H:%M %p", gmtime())
    }
    return render(request,'index.html', context)