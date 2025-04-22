from django.shortcuts import render,redirect
from . import models
def index(request):
    context={
        'books':models.all_books()
    }

    return render(request,'index.html',context)

def books(request):
    if request.method=='POST':
        models.new_books(request.POST)
        return redirect('/')
        


def authors(request):
    context={
        'authors': models.all_author()
    }
    return render(request,'author.html',context)

def add_author(request):
    if request.method=='POST':
        models.new_author(request.POST)
        return redirect('/authors')
    return redirect('/authors')

def books_detail(request ,id):
     context={
          
        'book' :models.get_book_by_id(id),
        'authors':models.all_author()
     }
     return render(request,'book_details.html',context)

def author_detail(request ,id):
     context={
          
        'author' :models.get_author_by_id(id),
        'books':models.all_books()


     }
     return render(request,'author_details.html',context)

def connect_author_book(request,id):
    if request.method == 'POST':
        models.connect_author_book(request.POST,id)
    return redirect(f'/books/{id}')

def connect_book_author(request,id):
    if request.method == 'POST':
        models.connect_book_author(request.POST,id) 
    return redirect (f'/authors/{id}')
        

