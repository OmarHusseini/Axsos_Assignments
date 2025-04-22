from django.urls import path
from . import views 

urlpatterns = [
    path('', views.index, name='index'),
    path('books', views.books, name='books'),
    path('authors', views.authors, name='authors'),
    path('add_author',views.add_author),
    path('books/<int:id>',views.books_detail),
    path('authors/<int:id>',views.author_detail),
    path('makeconnection/<int:id>',views.connect_author_book),
    path('author/<int:id>',views.connect_book_author)

]