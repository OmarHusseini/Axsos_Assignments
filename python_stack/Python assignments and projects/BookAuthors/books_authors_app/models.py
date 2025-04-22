from django.db import models

# Create your models here.
class book(models.Model):
    title = models.CharField(max_length=200)
    desc =models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    author = models.ManyToManyField('author', related_name='books')



class author(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    notes = models.TextField(null=True, blank=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)  


def new_books(post):
    book.objects.create(title=post['title'], desc=post['descripe'])

def all_books():
    return book.objects.all()

def new_author(post):
    author.objects.create(first_name=post['fname'], last_name=post['lname'],notes=post['note'])

def all_author():
     return author.objects.all()

def get_book_by_id(id):
    return book.objects.get(id=id)

def get_author_by_id(id):
    return author.objects.get(id=id)
    
def connect_author_book(post,id):
    Author = author.objects.get(id=post['author_id'])
    Book = book.objects.get(id=id)
    Book.author.add(Author)

def connect_book_author(post,id):
    Book1= book.objects.get(id=post['book_id'])
    Author1 = author.objects.get(id=id) 
    Author1.books.add(Book1)
    


